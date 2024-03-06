import Esercizio1.Entites.Rettangolo;
import Esercizio2.Entites.Sim;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(3, 6);
        Rettangolo unAltroRettangolo = new Rettangolo(7, 10);
        //Rettangolo.print(rettangolo);
        //Rettangolo.print(unAltroRettangolo);
        Rettangolo.print(rettangolo, unAltroRettangolo);

        Sim primaSim = new Sim("3636");
        primaSim.ricaricaCredito(20);
        primaSim.printSimInformations();
        primaSim.ricaricaCredito(20);
        primaSim.printSimInformations();
        primaSim.chiamata("3589");
        primaSim.printSimInformations();
        primaSim.chiamata("1234");
        primaSim.printSimInformations();
        primaSim.chiamata("0000");
        primaSim.printSimInformations();
        primaSim.chiamata("1111");
        primaSim.printSimInformations();
        primaSim.chiamata("2222");
        primaSim.printSimInformations();
        primaSim.chiamata("3333");
        primaSim.printSimInformations();
        primaSim.chiamata("4444");
        primaSim.printSimInformations();
    }
}