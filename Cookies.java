class Cookies extends VendingItem {
    public Cookies(String name, String flavor, double price, int calories,ItemCategories itemType) {
        super(name, flavor, price, calories, itemType);
    }
    @Override
    public double calcTotalPrice() {
        double total = getPrice();

        return total;
    }
}
