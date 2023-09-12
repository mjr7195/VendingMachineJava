public class VendingMachinePrices {
    private double[][] productPrices;

    public VendingMachinePrices(int rows, int cols){
        productPrices = new double[rows][cols];
    }

    public void addProductPrices(int rows, int cols, double productPrice){
        if (rows >= 0 && rows < productPrices.length && cols >= 0 && cols < productPrices[0].length){
            productPrices[rows][cols] = productPrice;
        } else {
            System.out.println("Invalid input for adding product price.");
        }
    }

    public void display(){
        for (int i = 0; i < productPrices.length;i++){
            for (int j = 0; j < productPrices[0].length; j++){
                double product = productPrices[i][j];
                System.out.print(" (" + i + "-" + j + ") [ "+ product + " ]");
                }
            }
            System.out.println();
    }
}
