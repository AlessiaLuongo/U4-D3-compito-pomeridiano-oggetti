package Esercizio3.Entites;

import java.util.ArrayList;
import java.util.List;

public class Carrello {
    private final int codiceClienteAssociato;
    public List<Articolo> listaArticoli;
    public double costoArticoli;

    public Carrello(int codiceClienteAssociato) {
        this.codiceClienteAssociato = codiceClienteAssociato;
        this.listaArticoli = new ArrayList<>();
        this.costoArticoli = 0;
    }

    public void acquistaArticolo(Articolo articolo) {
        listaArticoli.add(articolo);
        costoArticoli = costoArticoli + articolo.prezzo;
        articolo.aggiornoPezziDisponibili();

    }

    @Override
    public String toString() {
        return "Carrello{" +
                "codiceClienteAssociato= " + codiceClienteAssociato +
                ", listaArticoli= " + listaArticoli +
                ", costoArticoli= " + costoArticoli + "€" +
                '}';
    }
}
