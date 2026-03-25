// Vector.java

class Vector {

    private int dimension;
    private double[] elements;

    // Constructor
    public Vector(int dimension, double[] elements)
            throws VectorException {

        if (dimension != 2 && dimension != 3) {
            throw new VectorException(
                "Only 2D or 3D vectors allowed."
            );
        }

        this.dimension = dimension;
        this.elements = new double[dimension];

        for (int i = 0; i < dimension; i++) {
            this.elements[i] = elements[i];
        }
    }

    // Check dimension
    private void checkDimension(Vector v)
            throws VectorException {

        if (this.dimension != v.dimension) {
            throw new VectorException(
                "Vector dimensions must be same."
            );
        }
    }

    // Add vectors
    public Vector add(Vector v)
            throws VectorException {

        checkDimension(v);

        double[] result = new double[dimension];

        for (int i = 0; i < dimension; i++) {
            result[i] =
                this.elements[i] + v.elements[i];
        }

        return new Vector(dimension, result);
    }

    // Subtract vectors
    public Vector subtract(Vector v)
            throws VectorException {

        checkDimension(v);

        double[] result = new double[dimension];

        for (int i = 0; i < dimension; i++) {
            result[i] =
                this.elements[i] - v.elements[i];
        }

        return new Vector(dimension, result);
    }

    // Dot product
    public double dotProduct(Vector v)
            throws VectorException {

        checkDimension(v);

        double sum = 0;

        for (int i = 0; i < dimension; i++) {
            sum +=
                this.elements[i] * v.elements[i];
        }

        return sum;
    }

    // Display vector
    public void display() {

        System.out.print("Vector: (");

        for (int i = 0; i < dimension; i++) {

            System.out.print(elements[i]);

            if (i < dimension - 1) {
                System.out.print(", ");
            }
        }

        System.out.println(")");
    }

}