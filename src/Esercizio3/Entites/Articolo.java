package Esercizio3.Entites;

import java.util.Random;

public class Articolo {
    int codiceArticolo;
    String descrizioneArticolo;
    double prezzo;
    int pezziDisponibili;

    public Articolo(String descrizioneArticolo, double prezzo, int pezziDisponibili) {
        Random codiceArticolo = new Random();

        this.codiceArticolo = codiceArticolo.nextInt(1, 10000);
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.pezziDisponibili = pezziDisponibili;
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
