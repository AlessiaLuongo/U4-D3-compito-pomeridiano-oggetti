package Esercizio3.Entites;

import java.util.Random;

public class Articolo {
    private final int codiceArticolo;
    public String descrizioneArticolo;
    public double prezzo;
    private int pezziDisponibili;

    public Articolo(String descrizioneArticolo, double prezzo, int pezziDisponibili) {
        Random codiceArticolo = new Random();

        this.codiceArticolo = codiceArticolo.nextInt(1, 10000);
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.pezziDisponibili = pezziDisponibili;
    }

    public int getCodiceArticolo() {
        return codiceArticolo;
    }


    public int aggiornoPezziDisponibili() {
        return pezziDisponibili = pezziDisponibili - 1;
    }


    @Override
    public String toString() {
        return "Articolo{" +
                "codiceArticolo=" + codiceArticolo +
                ", descrizioneArticolo='" + descrizioneArticolo + '\'' +
                ", prezzo=" + prezzo + "€" +
                ", pezziDisponibili=" + pezziDisponibili +
                '}';
    }
}
