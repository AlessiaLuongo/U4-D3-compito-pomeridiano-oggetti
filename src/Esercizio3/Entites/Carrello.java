package Esercizio3.Entites;

import java.util.ArrayList;
import java.util.List;

public class Carrello {
    int codiceClienteAssociato;
    List<Articolo> listaArticoli;
    int costoArticoli;

    public Carrello(int codiceClienteAssociato) {
        this.codiceClienteAssociato = codiceClienteAssociato;
        this.listaArticoli = new ArrayList<>();
        this.costoArticoli = 0;
    }

    @Override
    public String toString() {
        return "Carrello{" +
                "codiceClienteAssociato=" + codiceClienteAssociato +
                ", listaArticoli=" + listaArticoli +
                ", costoArticoli=" + costoArticoli +
                '}';
    }
}
