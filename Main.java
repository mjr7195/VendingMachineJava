public class Main {
    public static void main(String[] args){
        //Soda categories
       Coke soda1 = new Coke("Coke", "vanilla with a bit of citrus", 1.25, 150, ItemCategories.SODA, true);
       Sprite soda2 = new Sprite("Sprite", "Lime", 1.00, 140, ItemCategories.SODA, true);
       CokeZero soda3 = new CokeZero("Coke Zero", "vanilla with a bit of citrus", 2.00, 0, ItemCategories.SODA, false);
       FantaPeach soda4 = new FantaPeach("Fanta Peach", "Peach", 2.50, 250, ItemCategories.SODA, true);
       Crush soda5 = new Crush("Crush Pineapple", "Pineapple", 2.85, 190, ItemCategories.SODA, true);
       System.out.println("Item 1 name: " + soda1.getName());
       System.out.println("Item 1 total price: $" + soda1.calcTotalPrice());
       System.out.println(soda1.getName()+ " is a "+ soda1.getItemCategory());

    }
}
