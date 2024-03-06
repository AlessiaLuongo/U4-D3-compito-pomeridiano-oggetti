package Esercizio1.Entites;

public class Rettangolo {
    public int height;
    public int width;

    public Rettangolo(int height, int width) {
        this.height = height;
        this.width = width;
    }


    public static void print(Rettangolo primoRettangolo) {
        System.out.println("Perimeter: " + primoRettangolo.calculatePerimeter() + " Area: " + primoRettangolo.calculateArea());
    }

    public static void print(Rettangolo primoRettangolo, Rettangolo secondoRettangolo) {
        System.out.println("Perimeter: " + primoRettangolo.calculatePerimeter() + " Area: " + primoRettangolo.calculateArea());
        System.out.println("Perimeter: " + secondoRettangolo.calculatePerimeter() + " Area: " + secondoRettangolo.calculateArea());
        System.out.println("Somma Perimeter: " + stampaUnaSomma(primoRettangolo, secondoRettangolo)[0]);
        System.out.println("Somma Area: " + stampaUnaSomma(primoRettangolo, secondoRettangolo)[1]);
    }


    public static int[] stampaUnaSomma(Rettangolo primoRettangolo, Rettangolo secondoRettangolo) {
        int sumPerimeter = primoRettangolo.calculatePerimeter() + secondoRettangolo.calculatePerimeter();
        int sumArea = primoRettangolo.calculateArea() + secondoRettangolo.calculateArea();
        int[] arrayDiSomme = new int[2];
        arrayDiSomme[0] = sumPerimeter;
        arrayDiSomme[1] = sumArea;

        return arrayDiSomme;
    }

    public int calculatePerimeter() {
        return ((this.height + this.width) * 2);
    }

    public int calculateArea() {
        return (this.height * this.width);
    }
}
