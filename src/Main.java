public class Main {
    public static void main(String[] args) {
        // Test the constructor that takes a variable number of coefficients
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial p2 = new MyPolynomial(1.5, 2.4, 3.1, 5.0, 2.3);

        // Test the constructor that takes coefficients from a file
        MyPolynomial p3 = new MyPolynomial("poly.txt");

        // Test the getDegree() method
        System.out.println("p1 degree: " + p1.getDegree());
        System.out.println("p2 degree: " + p2.getDegree());
        System.out.println("p3 degree: " + p3.getDegree());

        // Test the toString() method
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);

        // Test the evaluate() method
        System.out.println("p1(10): " + p1.evaluate(10));
        System.out.println("p2(10): " + p2.evaluate(10));
        System.out.println("p3(10): " + p3.evaluate(10));

        // Test the add() method
        MyPolynomial p4 = p1.add(p2);
        System.out.println("p1+p2: " + p4);

        // Test the multiply() method
        MyPolynomial p5 = p1.multiply(p2);
        System.out.println("p1*p2: " + p5);

    }
}