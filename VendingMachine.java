public class VendingMachine {

   private String[][] products;

   public VendingMachine(int rows, int cols){
       products = new String[rows][cols];
   }

   public void addProduct(int rows, int cols, String productName){
       if (rows >= 0 && rows < products.length && cols >= 0 && cols < products[0].length){
           products[rows][cols] = productName;
       } else {
           System.out.println("Invalid input for adding product.");
       }
   }
   public String getProduct(int rows, int cols){
       if (rows >= 0 && rows < products.length && cols >= 0 && cols < products.length){
           String product = products[rows][cols];
           if (product != null){
               products[rows][cols] = null;
               return product;
           } else{
               return "Already empty";
           }
       }else {
           return "Location doesn't exist";
       }
   }

   public void display(){
       for (int i = 0; i < products.length;i++){
           for (int j = 0; j < products[0].length; j++){
               String product = products[i][j];
               if (product == null){
                   System.out.print("Empty");
               } else {
                   System.out.print(" (" + i + "-" + j + ") [ "+ product + " ]");
               }
           }
           System.out.println();
       }
   }

}
