import java.util.Scanner;
public class Main {
    public static void main(String[] args){
       /* Soda categories */
       Coke coke = new Coke("Coke", "vanilla with a bit of citrus", 1.25, 150, ItemCategories.SODA, true);
       Sprite Sprite = new Sprite("Sprite", "Lime", 1.00, 140, ItemCategories.SODA, true);
       CokeZero cokeZero = new CokeZero("Coke Zero", "vanilla with a bit of citrus", 2.00, 0, ItemCategories.SODA, false);
       FantaPeach fantaPeach = new FantaPeach("Fanta Peach", "Peach", 2.50, 250, ItemCategories.SODA, true);
       Crush crushPineapple = new Crush("Crush Pineapple", "Pineapple", 2.85, 190, ItemCategories.SODA, true);
       MountainDew mtnDew = new MountainDew("Mountain Dew", "Baja Blast", 3.00, 170, ItemCategories.SODA, true);
       /* end Soda categories */
       /* Chips categories */

       System.out.println("Item selected: " + coke.getName());
       System.out.println("Item price: $" + coke.calcTotalPrice());
       System.out.println(coke.getName()+ " is a "+ coke.getItemCategory());

    }
}
