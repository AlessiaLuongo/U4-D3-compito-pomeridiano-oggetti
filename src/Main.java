import Esercizio1.Entites.Rettangolo;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(3, 3);
        System.out.println("I valori del rettangolo: " + "altezza" + rettangolo.height + "larghezza" + rettangolo.width);
        System.out.println(rettangolo.calculatePerimeter());
        System.out.println(rettangolo.calculateArea());

    }
}