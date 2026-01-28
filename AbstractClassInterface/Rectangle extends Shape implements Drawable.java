package abstractinterface;
class Rectangle extends Shape implements Drawable {
    double length = 4, width = 6;

    double area() {
        return length * width;
    }

    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}