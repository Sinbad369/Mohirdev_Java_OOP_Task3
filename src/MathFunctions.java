public class MathFunctions {
    private static double pi;
    private static double e;

    static {
        e = 2.71828182846;
        pi = 3.14159265359;
    }

    // Area of a circle
    public static double getArea(double radius){
        return pi * radius * radius;
    }

    // Power of e to the number given
    public static double getPower(int power){
        return Math.pow(e, power);
    }

    // Heron formula to find the area of a triangle
    public static double getArea(double a, double b, double c){
       double semiPerimeter = (a + b + c) / 2;
       return Math.sqrt(semiPerimeter * (semiPerimeter - a)
       *(semiPerimeter - b) * (semiPerimeter - c));
    }
}
