package Esercizio2.Entites;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sim {
    public String numeroDiTelefono;
    public int credito;
    public List<String> ultimeCinqueChiamate;

    public Sim(String numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
        this.credito = 0;
        this.ultimeCinqueChiamate = new ArrayList<>();

    }

    public int creaMinutaggioChiamata() {
        Random minutaggio = new Random();
        return (minutaggio.nextInt(1, 10000));
    }

    public void ricaricaCredito(int ricarica) {
        this.credito = this.credito + ricarica;
        System.out.println("Ricarica effettuata di: " + ricarica + "€");
    }

    public void printSimInformations() {
        System.out.println("Sim{" +
                "numeroDiTelefono='" + numeroDiTelefono + '\'' +
                ", credito=" + credito +
                ", ultimeCinqueChiamate=" + ultimeCinqueChiamate +
                '}');
    }

    public void chiamata(String numeroDiTelefono) {
        System.out.println("Chiamata in uscita verso " + numeroDiTelefono);
        if (this.credito <= 2) {
            System.out.println("Credito insufficiente");
        } else {
            this.credito = this.credito - 2;
            this.ultimeCinqueChiamate.add(numeroDiTelefono);
            if (ultimeCinqueChiamate.size() == 6) {
                ultimeCinqueChiamate.remove(0);
            }
            System.out.println("Chiamata di " + creaMinutaggioChiamata() + " secondi finita");
        }

    }


    @Override
    public String toString() {
        return "Sim{" +
                "numeroDiTelefono='" + numeroDiTelefono + '\'' +
                ", credito=" + credito +
                ", ultimeCinqueChiamate=" + ultimeCinqueChiamate +
                '}';
    }
}
