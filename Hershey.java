class Hershey extends VendingItem {
    private int highInSugar = 2;

    public Hershey(String name, String flavor, double price, int calories,ItemCategories itemType) {
        super(name, flavor, price, calories, itemType);
    }
    @Override
    public double calcTotalPrice() {
        double total = getPrice();
            total += highInSugar; //adds $2.00 to total for chocolate

        return total;
    }
}
