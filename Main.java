public class Main {
    public static void main(String[] args){
       Coke item1 = new Coke("Coke", "vanilla with a bit of citris", 1.25, 150, ItemCategories.SODA, true);
       System.out.println("Item 1 name: " + item1.getName());
       System.out.println("Item 1 total price: $" + item1.calcTotalPrice());
       System.out.println(item1.getName()+ " is a "+ item1.getItemCategory());

    }
}
