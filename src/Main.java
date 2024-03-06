import Esercizio1.Entites.Rettangolo;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(3, 6);
        Rettangolo unAltroRettangolo = new Rettangolo(7, 10);
        //Rettangolo.print(rettangolo);
        //Rettangolo.print(unAltroRettangolo);
        Rettangolo.print(rettangolo, unAltroRettangolo);


    }
}