public class VendingMachineNutritionalFacts {
    public int[][] productNFacts;

    public VendingMachineNutritionalFacts(int rows, int cols){
        productNFacts = new int[rows][cols];
    }

    public void addProductNFacts(int rows, int cols, int productName){
        if (rows >= 0 && rows < productNFacts.length && cols >= 0 && cols < productNFacts[0].length){
            productNFacts[rows][cols] = productName;
        } else {
            System.out.println("Invalid input for adding product.");
        }
    }

    public int getProductNFacts(int rows, int cols) {
        int productNFact = productNFacts[rows][cols];
        if (rows >= 0 && rows < productNFacts.length && cols >= 0 && cols < productNFacts.length) {
            productNFact = productNFacts[rows][cols];

        }
        return productNFact;
    }
}
