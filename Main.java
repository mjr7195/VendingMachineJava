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
       Hershey hersheyNuggets = new Hershey("Hershey Nuggets", "Milk chocolate", 5.00, 150, ItemCategories.CHOCOLATE_BARS);
       Hershey hersheyKisses = new Hershey("Hershey Kisses", "Milk Chocolate", 1.50, 150, ItemCategories.CHOCOLATE_BARS);
       Hershey hersheyCottonCandy = new Hershey("Hershey Cotton Candy", "Cotton Candy", 3.00, 210, ItemCategories.CHOCOLATE_BARS);
       /* end chocolate bar*/

       /* Ice Cream category*/
       BenAndJerrys cherryGarcia = new BenAndJerrys("Ben & Jerry's Cherry Garcia", "Cherry", 6.00, 340, ItemCategories.ICE_CREAM);
       BenAndJerrys chocoChipCookieDough = new BenAndJerrys("Ben & Jerry's Chocolate Chip Cookie Dough", "vanilla with cookie dough", 6.00, 370, ItemCategories.ICE_CREAM);
       BenAndJerrys mintChocoCookie = new BenAndJerrys("Ben & Jerry's Mint Chocolate Cookie", "Mint Chocolate", 7.00, 360, ItemCategories.ICE_CREAM);
       BenAndJerrys pbCup = new BenAndJerrys("Ben & Jerry's Peanut Butter Cup", "Peanut", 6.50, 470, ItemCategories.ICE_CREAM);
       BenAndJerrys sbCheesecake = new BenAndJerrys("Ben & Jerry's Strawberry Cheesecake", "Strawberry Cheesecake", 5.50, 340, ItemCategories.ICE_CREAM);
       BenAndJerrys saltedCara = new BenAndJerrys("Ben & Jerry's Salted Caramel Core", "Salted Caramel", 5.00, 360, ItemCategories.ICE_CREAM);
       /* end ice cream category*/

       /* candy category*/
       Candy skittles = new Candy("Skittles", "Lime", 2.00, 250, ItemCategories.CANDY, "chewy");
       Candy candyCane = new Candy("Candy Cane", "Mint", 1.00, 60, ItemCategories.CANDY, "hard");
       Candy starburst = new Candy("Starburst", "Tropical", 1.00, 236, ItemCategories.CANDY, "chewy");
       Candy tootsiePop = new Candy("Tootsie Pop", "cherry with chocolate inside", .50, 60, ItemCategories.CANDY, "hard");
       Candy twizzler = new Candy("Twizzlers", "Cherry", 2.00, 120, ItemCategories.CANDY, "chewy");
       Candy candyCorn = new Candy("Candy Corn", "marshmallow", .50, 150, ItemCategories.CANDY, "chewy");
       /* end candy category */

       /* cookies category */
       Cookies ChocoChipCK = new Cookies("Chocolate Chip Cookie", "Chocolate chip", 3.00, 170, ItemCategories.COOKIES);
       Cookies sugarCK = new Cookies("Sugar Cookie", "Sugar", 3.00, 140, ItemCategories.COOKIES);
       Cookies oreoCK = new Cookies("Oreo Cookie", "chocolate with creme", 3.00, 160, ItemCategories.COOKIES);
       Cookies mapleWalnutCK = new Cookies("Maple Walnut Cookie", "maple walnut", 3.00, 140, ItemCategories.COOKIES);
       Cookies cinnamonCk = new Cookies("Cinnamon Cookie", "Cinnamon", 3.00, 380, ItemCategories.COOKIES);
       Cookies smoreCK = new Cookies("S'more Cookie", "Marshmallow Chocolate", 3.00, 190, ItemCategories.COOKIES);
       /*end cookie category*/

       System.out.println("Item selected: " + cokeOriginal.getName());
       System.out.println("Item price: $" + hersheyMilkChoco.calcTotalPrice());
       System.out.println(cokeOriginal.getName()+ " is a "+ cokeOriginal.getItemCategory());

    }
}
