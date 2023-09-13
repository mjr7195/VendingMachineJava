public class VendingMachineNutritionalFacts {
    public double[][] productNFacts;

    public VendingMachineNutritionalFacts(int rows, int cols){
        productNFacts = new double[rows][cols];
    }

    public void addProductNFacts(int rows, int cols, double productName){
        if (rows >= 0 && rows < productNFacts.length && cols >= 0 && cols < productNFacts[0].length){
            productNFacts[rows][cols] = productName;
        } else {
            System.out.println("Invalid input for adding product.");
        }
    }

    public double getProductNFacts(int rows, int cols) {
        double productNFact = productNFacts[rows][cols];
        if (rows >= 0 && rows < productNFacts.length && cols >= 0 && cols < productNFacts.length) {
            productNFact = productNFacts[rows][cols];

        }
        return productNFact;
    }
}
