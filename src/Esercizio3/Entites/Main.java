package Esercizio3.Entites;

public class Main {
    public static void main(String[] args) {
        Cliente Alessia = new Cliente("Alessia", "Luongo", "alessia@gmail.com", "06.03.24");
        System.out.println(Alessia);
        Articolo primoAcquisto = new Articolo("un bellissimo Elefante", 8.75, 105);
        System.out.println(primoAcquisto);
        Carrello carrello = new Carrello(Alessia.codiceCliente);
        System.out.println(carrello);
    }
}
