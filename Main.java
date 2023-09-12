import java.util.Scanner;
public class Main {
    public static void main(String[] args){
       /* Soda categories */
       Coke cokeOriginal = new Coke("Coke Original", "vanilla with a bit of citrus", 1.25, 150, ItemCategories.SODA, true);
       Coke cokeRaspberry = new Coke("Coke Raspberry", "Raspberry", 1.50, 140, ItemCategories.SODA, true);
       Coke cokeCherry = new Coke("Coke Cherry", "Cherry", 2.00, 150, ItemCategories.SODA, true);
       Sprite spriteOriginal = new Sprite("Sprite Original", "Lemon-Lime", 1.00, 140, ItemCategories.SODA, true);
       Sprite spriteLymonade = new Sprite("Sprite Lymonade", "Sprite + Lemonade", 1.20, 130, ItemCategories.SODA, true);
       Sprite spriteZero = new Sprite("Sprite Zero Sugar", "Lemon-Lime", .50, 0, ItemCategories.SODA, false);
       /* end Soda categories */

       /* Chips categories */
       Lays laysOriginal = new Lays("Lays Original", "classic Potato Chips",4.00, 160, ItemCategories.CHIPS, true);
       Lays laysBBQ = new Lays("Lays BBQ", "Barbecue", 5.00, 150, ItemCategories.CHIPS, true);
       Lays laysChileLimon = new Lays("Lays Chile Limon", "Chile Limon", 5.00, 160, ItemCategories.CHIPS, true);
       Doritos doritosSpicySweetChili = new Doritos("Doritos Sweet Spicy Chili", "Sweet Spicy Chili", 5.00, 150, ItemCategories.CHIPS, true);
       Doritos doritosOriginal = new Doritos("Doritos Nacho Cheese", "Nacho Cheese", 3.00, 150, ItemCategories.CHIPS, false);
       Doritos doritosReducedFat = new Doritos("Doritos Reduced Fat", "Cool Ranch", 2.50, 130, ItemCategories.CHIPS, false);
       /* End Chip category */

       /*Chocolate Bar category*/
       Hershey hersheyMilkChoco = new Hershey("Hershey Milk Chocolate", "Milk Chocolate", 2.00, 220, ItemCategories.CHOCOLATE_BARS);
       Hershey hersheyAlmonds = new Hershey("Hershey Milk chocolate with Almonds", "Milk chocolate with almonds", 2.50, 210, ItemCategories.CHOCOLATE_BARS);
       Hershey hersheyCookiesNcream = new Hershey("Hershey Cookies 'N' Creme","Cookies & Cream", 3.00, 220, ItemCategories.CHOCOLATE_BARS );

       System.out.println("Item selected: " + cokeOriginal.getName());
       System.out.println("Item price: $" + hersheyMilkChoco.calcTotalPrice());
       System.out.println(cokeOriginal.getName()+ " is a "+ cokeOriginal.getItemCategory());

    }
}
