package abstractinterface;
class Circle extends Shape implements Drawable {
    double radius = 5;

    double area() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("Drawing Circle");
    }
}