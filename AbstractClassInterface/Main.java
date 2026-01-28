package abstractinterface;
public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        System.out.println("Circle Area: " + s1.area());
        System.out.println("Rectangle Area: " + s2.area());

        Drawable d1 = new Circle();
        Drawable d2 = new Rectangle();

        d1.draw();
        d2.draw();
    }
}
