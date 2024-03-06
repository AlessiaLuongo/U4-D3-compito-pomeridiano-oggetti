package Esercizio3.Entites;

public class Main {
    public static void main(String[] args) {
        Cliente Alessia = new Cliente("Alessia", "Luongo", "alessia@gmail.com", "06.03.24");
        System.out.println(Alessia);
        Cliente Edobello = new Cliente("Edo", "bello", "edo@gmail.com", "07.03.24");

        Articolo primoAcquisto = new Articolo("un bellissimo Elefante", 8.75, 105);
        Articolo secondoAcquisto = new Articolo("un fantastico ippopotamo", 10.00, 80);

        Carrello carrello = new Carrello(Alessia.getCodiceCliente());
        Carrello carello1 = new Carrello(Edobello.getCodiceCliente());

        Cliente.aggiungiAlCarrello(primoAcquisto.getCodiceArticolo());
        primoAcquisto.aggiornoPezziDisponibili();
        carrello.acquistaArticolo(primoAcquisto);
        System.out.println(carrello);

        Cliente.aggiungiAlCarrello(secondoAcquisto.getCodiceArticolo());

        carrello.acquistaArticolo(secondoAcquisto);
        System.out.println(carrello);

        Cliente.aggiungiAlCarrello(primoAcquisto.getCodiceArticolo());


    }
}
