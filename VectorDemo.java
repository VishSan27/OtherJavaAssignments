// VectorDemo.java

public class VectorDemo {

    public static void main(String[] args) {

        try {

            double[] a = {2, 3};
            double[] b = {4, 5};

            Vector v1 = new Vector(2, a);
            Vector v2 = new Vector(2, b);

            // Addition
            Vector sum = v1.add(v2);
            System.out.print("Addition Result: ");
            sum.display();

            // Subtraction
            Vector diff = v1.subtract(v2);
            System.out.print("Subtraction Result: ");
            diff.display();

            // Dot Product
            double dot =
                v1.dotProduct(v2);

            System.out.println(
                "Dot Product: " + dot
            );

        }
        catch (VectorException e) {

            System.out.println(
                "Error: " + e.getMessage()
            );
        }

    }

}