package Esercizio1.Entites;

public class Rettangolo {
    public int height;
    public int width;

    public Rettangolo(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int calculatePerimeter() {
        return ((this.height + this.width) * 2);
    }

    public int calculateArea() {
        return (this.height * this.width);
    }

}
