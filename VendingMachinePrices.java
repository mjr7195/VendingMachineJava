public class VendingMachinePrices {
    private double[][] productPrices;

    public VendingMachinePrices(int rows, int cols) {
        productPrices = new double[rows][cols];
    }

    public void addProductPrices(int rows, int cols, double productPrice) {
        if (rows >= 0 && rows < productPrices.length && cols >= 0 && cols < productPrices[0].length) {
            productPrices[rows][cols] = productPrice;
        } else {
            System.out.println("Invalid input for adding product price.");
        }
    }

    public double getProductPrices(int rows, int cols) {
        double productPrice = 0;
        if (rows >= 0 && rows < productPrices.length && cols >= 0 && cols < productPrices.length) {
            productPrice = productPrices[rows][cols];

        }
        return productPrice;
    }

    public void display() {
        for (int i = 0; i < productPrices.length; i++) {
            for (int j = 0; j < productPrices[0].length; j++) {
                double productPrice = productPrices[i][j];
                System.out.print(" (" + i + "-" + j + ") [ $" + productPrice + " ]");
            }
            System.out.println();
        }

    }
}

