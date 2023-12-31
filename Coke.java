 class Coke extends VendingItem{
   private boolean hasTax;

     public Coke(String name, String flavor, double price, int calories,ItemCategories itemType, boolean hasTax) {
         super(name, flavor, price, calories, itemType);
         this.hasTax = hasTax;
     }
     @Override
     public double calcTotalPrice() {
         double total = getPrice();
         if (hasTax) {
             double tax = total * 0.08; // Additional cost for soda
             total += tax;
         }
         return total;
     }

}
