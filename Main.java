import java.util.Scanner;
public class Main {
   public static void main(String[] args) {


      /* Soda categories */
      Coke cokeOriginal = new Coke("Coke Original", "vanilla with a bit of citrus", 1.25, 150, ItemCategories.SODA, true);
      Coke cokeRaspberry = new Coke("Coke Raspberry", "Raspberry", 1.50, 140, ItemCategories.SODA, true);
      Coke cokeCherry = new Coke("Coke Cherry", "Cherry", 2.00, 150, ItemCategories.SODA, true);
      Sprite spriteOriginal = new Sprite("Sprite Original", "Lemon-Lime", 1.00, 140, ItemCategories.SODA, true);
      Sprite spriteLymonade = new Sprite("Sprite Lymonade", "Sprite + Lemonade", 1.20, 130, ItemCategories.SODA, true);
      Sprite spriteZero = new Sprite("Sprite Zero Sugar", "Lemon-Lime", .50, 0, ItemCategories.SODA, false);
      /* end Soda categories */

      /* Chips categories */
      Lays laysOriginal = new Lays("Lays Original", "classic Potato Chips", 4.00, 160, ItemCategories.CHIPS, true);
      Lays laysBBQ = new Lays("Lays BBQ", "Barbecue", 5.00, 150, ItemCategories.CHIPS, true);
      Lays laysChileLimon = new Lays("Lays Chile Limon", "Chile Limon", 5.00, 160, ItemCategories.CHIPS, true);
      Doritos doritosSpicySweetChili = new Doritos("Doritos Sweet Spicy Chili", "Sweet Spicy Chili", 5.00, 150, ItemCategories.CHIPS, true);
      Doritos doritosOriginal = new Doritos("Doritos Nacho Cheese", "Nacho Cheese", 3.00, 150, ItemCategories.CHIPS, false);
      Doritos doritosReducedFat = new Doritos("Doritos Reduced Fat", "Cool Ranch", 2.50, 130, ItemCategories.CHIPS, false);
      /* End Chip category */

      /*Chocolate Bar category*/
      Hershey hersheyMilkChoco = new Hershey("Hershey Milk Chocolate", "Milk Chocolate", 2.00, 220, ItemCategories.CHOCOLATE_BARS);
      Hershey hersheyAlmonds = new Hershey("Hershey Milk chocolate with Almonds", "Milk chocolate with almonds", 2.50, 210, ItemCategories.CHOCOLATE_BARS);
      Hershey hersheyCookiesNcream = new Hershey("Hershey Cookies 'N' Creme", "Cookies & Cream", 3.00, 220, ItemCategories.CHOCOLATE_BARS);
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
      Cookies chocoChipCK = new Cookies("Chocolate Chip Cookie", "Chocolate chip", 3.00, 170, ItemCategories.COOKIES);
      Cookies sugarCK = new Cookies("Sugar Cookie", "Sugar", 3.00, 140, ItemCategories.COOKIES);
      Cookies oreoCK = new Cookies("Oreo Cookie", "chocolate with creme", 3.00, 160, ItemCategories.COOKIES);
      Cookies mapleWalnutCK = new Cookies("Maple Walnut Cookie", "maple walnut", 3.00, 140, ItemCategories.COOKIES);
      Cookies cinnamonCk = new Cookies("Cinnamon Cookie", "Cinnamon", 3.00, 380, ItemCategories.COOKIES);
      Cookies smoreCK = new Cookies("S'more Cookie", "Marshmallow Chocolate", 3.00, 190, ItemCategories.COOKIES);
      /*end cookie category*/

      //start vending machine
      VendingMachinePrices vendingMachinePrices = new VendingMachinePrices(6, 6);
      VendingMachine vendingMachine = new VendingMachine(6, 6);
      VendingMachineNutritionalFacts vendingMachineNFacts = new VendingMachineNutritionalFacts(6,6);


      //add products to array
      vendingMachine.addProduct(0, 0, cokeOriginal.getName());
      vendingMachine.addProduct(0, 1, cokeRaspberry.getName());
      vendingMachine.addProduct(0, 2, cokeCherry.getName());
      vendingMachine.addProduct(0, 3, spriteOriginal.getName());
      vendingMachine.addProduct(0, 4, spriteLymonade.getName());
      vendingMachine.addProduct(0, 5, spriteZero.getName());

      /* second row */
      vendingMachine.addProduct(1, 0, laysOriginal.getName());
      vendingMachine.addProduct(1, 1, laysBBQ.getName());
      vendingMachine.addProduct(1, 2, laysChileLimon.getName());
      vendingMachine.addProduct(1, 3, doritosSpicySweetChili.getName());
      vendingMachine.addProduct(1, 4, doritosOriginal.getName());
      vendingMachine.addProduct(1, 5, doritosReducedFat.getName());

      // Third Row
      vendingMachine.addProduct(2, 0, hersheyMilkChoco.getName());
      vendingMachine.addProduct(2, 1, hersheyAlmonds.getName());
      vendingMachine.addProduct(2, 2, hersheyCookiesNcream.getName());
      vendingMachine.addProduct(2, 3, hersheyNuggets.getName());
      vendingMachine.addProduct(2, 4, hersheyKisses.getName());
      vendingMachine.addProduct(2, 5, hersheyCottonCandy.getName());

      // Forth row
      vendingMachine.addProduct(3, 0, cherryGarcia.getName());
      vendingMachine.addProduct(3, 1, chocoChipCookieDough.getName());
      vendingMachine.addProduct(3, 2, mintChocoCookie.getName());
      vendingMachine.addProduct(3, 3, pbCup.getName());
      vendingMachine.addProduct(3, 4, sbCheesecake.getName());
      vendingMachine.addProduct(3, 5, saltedCara.getName());

      // Fifth row
      vendingMachine.addProduct(4, 0, skittles.getName());
      vendingMachine.addProduct(4, 1, candyCane.getName());
      vendingMachine.addProduct(4, 2, starburst.getName());
      vendingMachine.addProduct(4, 3, tootsiePop.getName());
      vendingMachine.addProduct(4, 4, twizzler.getName());
      vendingMachine.addProduct(4, 5, candyCorn.getName());

      // Sixth row
      vendingMachine.addProduct(5, 0, chocoChipCK.getName());
      vendingMachine.addProduct(5, 1, sugarCK.getName());
      vendingMachine.addProduct(5, 2, oreoCK.getName());
      vendingMachine.addProduct(5, 3, mapleWalnutCK.getName());
      vendingMachine.addProduct(5, 4, cinnamonCk.getName());
      vendingMachine.addProduct(5, 5, smoreCK.getName());

      /* ************************** price array ******************************** */
      /*first row*/
      vendingMachinePrices.addProductPrices(0, 0, cokeOriginal.getPrice());
      vendingMachinePrices.addProductPrices(0, 1, cokeRaspberry.getPrice());
      vendingMachinePrices.addProductPrices(0, 2, cokeCherry.getPrice());
      vendingMachinePrices.addProductPrices(0, 3, spriteOriginal.getPrice());
      vendingMachinePrices.addProductPrices(0, 4, spriteLymonade.getPrice());
      vendingMachinePrices.addProductPrices(0, 5, spriteZero.getPrice());

      /* second row */
      vendingMachinePrices.addProductPrices(1, 0, laysOriginal.getPrice());
      vendingMachinePrices.addProductPrices(1, 1, laysBBQ.getPrice());
      vendingMachinePrices.addProductPrices(1, 2, laysChileLimon.getPrice());
      vendingMachinePrices.addProductPrices(1, 3, doritosSpicySweetChili.getPrice());
      vendingMachinePrices.addProductPrices(1, 4, doritosOriginal.getPrice());
      vendingMachinePrices.addProductPrices(1, 5, doritosReducedFat.getPrice());

      // Third Row
      vendingMachinePrices.addProductPrices(2, 0, hersheyMilkChoco.getPrice());
      vendingMachinePrices.addProductPrices(2, 1, hersheyAlmonds.getPrice());
      vendingMachinePrices.addProductPrices(2, 2, hersheyCookiesNcream.getPrice());
      vendingMachinePrices.addProductPrices(2, 3, hersheyNuggets.getPrice());
      vendingMachinePrices.addProductPrices(2, 4, hersheyKisses.getPrice());
      vendingMachinePrices.addProductPrices(2, 5, hersheyCottonCandy.getPrice());

      // Forth row
      vendingMachinePrices.addProductPrices(3, 0, cherryGarcia.getPrice());
      vendingMachinePrices.addProductPrices(3, 1, chocoChipCookieDough.getPrice());
      vendingMachinePrices.addProductPrices(3, 2, mintChocoCookie.getPrice());
      vendingMachinePrices.addProductPrices(3, 3, pbCup.getPrice());
      vendingMachinePrices.addProductPrices(3, 4, sbCheesecake.getPrice());
      vendingMachinePrices.addProductPrices(3, 5, saltedCara.getPrice());

      // Fifth row
      vendingMachinePrices.addProductPrices(4, 0, skittles.getPrice());
      vendingMachinePrices.addProductPrices(4, 1, candyCane.getPrice());
      vendingMachinePrices.addProductPrices(4, 2, starburst.getPrice());
      vendingMachinePrices.addProductPrices(4, 3, tootsiePop.getPrice());
      vendingMachinePrices.addProductPrices(4, 4, twizzler.getPrice());
      vendingMachinePrices.addProductPrices(4, 5, candyCorn.getPrice());

      // Sixth row
      vendingMachinePrices.addProductPrices(5, 0, chocoChipCK.getPrice());
      vendingMachinePrices.addProductPrices(5, 1, sugarCK.getPrice());
      vendingMachinePrices.addProductPrices(5, 2, oreoCK.getPrice());
      vendingMachinePrices.addProductPrices(5, 3, mapleWalnutCK.getPrice());
      vendingMachinePrices.addProductPrices(5, 4, cinnamonCk.getPrice());
      vendingMachinePrices.addProductPrices(5, 5, smoreCK.getPrice());

      //************************Nutritional facts array*************************
      /*first row*/
      vendingMachineNFacts.addProductNFacts(0, 0, cokeOriginal.getCalories());
      vendingMachineNFacts.addProductNFacts(0, 1, cokeRaspberry.getCalories());
      vendingMachineNFacts.addProductNFacts(0, 2, cokeCherry.getCalories());
      vendingMachineNFacts.addProductNFacts(0, 3, spriteOriginal.getCalories());
      vendingMachineNFacts.addProductNFacts(0, 4, spriteLymonade.getCalories());
      vendingMachineNFacts.addProductNFacts(0, 5, spriteZero.getCalories());

      /* second row */
      vendingMachineNFacts.addProductNFacts(1, 0, laysOriginal.getCalories());
      vendingMachineNFacts.addProductNFacts(1, 1, laysBBQ.getCalories());
      vendingMachineNFacts.addProductNFacts(1, 2, laysChileLimon.getCalories());
      vendingMachineNFacts.addProductNFacts(1, 3, doritosSpicySweetChili.getCalories());
      vendingMachineNFacts.addProductNFacts(1, 4, doritosOriginal.getCalories());
      vendingMachineNFacts.addProductNFacts(1, 5, doritosReducedFat.getCalories());

      // Third Row
      vendingMachineNFacts.addProductNFacts(2, 0, hersheyMilkChoco.getCalories());
      vendingMachineNFacts.addProductNFacts(2, 1, hersheyAlmonds.getCalories());
      vendingMachineNFacts.addProductNFacts(2, 2, hersheyCookiesNcream.getCalories());
      vendingMachineNFacts.addProductNFacts(2, 3, hersheyNuggets.getCalories());
      vendingMachineNFacts.addProductNFacts(2, 4, hersheyKisses.getCalories());
      vendingMachineNFacts.addProductNFacts(2, 5, hersheyCottonCandy.getCalories());

      // Forth row
      vendingMachineNFacts.addProductNFacts(3, 0, cherryGarcia.getCalories());
      vendingMachineNFacts.addProductNFacts(3, 1, chocoChipCookieDough.getCalories());
      vendingMachineNFacts.addProductNFacts(3, 2, mintChocoCookie.getCalories());
      vendingMachineNFacts.addProductNFacts(3, 3, pbCup.getCalories());
      vendingMachineNFacts.addProductNFacts(3, 4, sbCheesecake.getCalories());
      vendingMachineNFacts.addProductNFacts(3, 5, saltedCara.getCalories());

      // Fifth row
      vendingMachineNFacts.addProductNFacts(4, 0, skittles.getCalories());
      vendingMachineNFacts.addProductNFacts(4, 1, candyCane.getCalories());
      vendingMachineNFacts.addProductNFacts(4, 2, starburst.getCalories());
      vendingMachineNFacts.addProductNFacts(4, 3, tootsiePop.getCalories());
      vendingMachineNFacts.addProductNFacts(4, 4, twizzler.getCalories());
      vendingMachineNFacts.addProductNFacts(4, 5, candyCorn.getCalories());

      // Sixth row
      vendingMachineNFacts.addProductNFacts(5, 0, chocoChipCK.getCalories());
      vendingMachineNFacts.addProductNFacts(5, 1, sugarCK.getCalories());
      vendingMachineNFacts.addProductNFacts(5, 2, oreoCK.getCalories());
      vendingMachineNFacts.addProductNFacts(5, 3, mapleWalnutCK.getCalories());
      vendingMachineNFacts.addProductNFacts(5, 4, cinnamonCk.getCalories());
      vendingMachineNFacts.addProductNFacts(5, 5, smoreCK.getCalories());


      Scanner scanner = new Scanner(System.in);
      //welcome user
      System.out.println("Welcome to my Vending Machine!");
      System.out.println("Here are the available items:");
      System.out.println(); //for readability

      //display array
      vendingMachine.display();
      System.out.println();

      double totalAmount = 0.0;

      while (true) {
         System.out.println();
         System.out.println("Input Format: rows(0-5) - columns(0-5)");
         System.out.println("Please choose your desired row from the table above or press 99 to exit: ");
         int rowChoice = scanner.nextInt();
         if (rowChoice == 99) {
            break; //break out of loop
         }
         while (rowChoice < 0 || rowChoice > 5) {
            System.out.println("location does not exist, please try again!");
            System.out.println("Please choose your desired row from the table above ");
            rowChoice = scanner.nextInt();

         }

         System.out.println("Please choose your desired column from the table above: ");
         int colChoice = scanner.nextInt();
         while (colChoice < 0 || colChoice > 5) {
            System.out.println("Location does not exist, please try again:");
            System.out.println("Please choose your desired column from the table above: ");
            colChoice = scanner.nextInt();
         }

         String productChoice = vendingMachine.getProduct(rowChoice, colChoice);
         double productPrice = vendingMachinePrices.getProductPrices(rowChoice, colChoice);
         int productCalories = vendingMachineNFacts.getProductNFacts(rowChoice, colChoice);

         processing();
         vending();
         System.out.println();


         System.out.println(productChoice + " is $" + productPrice);
         System.out.println(productChoice + " has "+ productCalories +" calories");

         System.out.print("Insert coins for payment (e.g., 1.00 for $1.00): $");
         double payment = scanner.nextDouble();  // Accept user payment

         while (payment < productPrice) {
            System.out.println("insufficient funds, please enter more coins. at least $" + productPrice + " is needed.");
            System.out.println("Insert coins for payment (1.00 for $1.00):");
            payment = scanner.nextDouble();
         }
         // Dispense item
         System.out.println("Dispensing " + productChoice);
         totalAmount += productPrice;
         double change = payment - productPrice;  // Change value to return to the user
         if (change > 0) {
            System.out.println("Change: $" + change);
         }

      }// while loop end
      System.out.println("Thank you for using the Vending Machine!");
      System.out.println("Total amount of transaction(s): $" + totalAmount);

      // Always close input, open connections to files, database,& networking
      scanner.close();
   }//main method end

   private static void processing() {
      System.out.println("Processing Request");
   }
   private static void vending(){
      System.out.println("Item is being retrieved");
   }
}//main class end













