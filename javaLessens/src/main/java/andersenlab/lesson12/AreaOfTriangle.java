package andersenlab.lesson12;

public class AreaOfTriangle {
    public static double findAreaOfTriangle() {
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double halfPerimeter = (a + b + c) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }
}