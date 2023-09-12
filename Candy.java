class Candy extends VendingItem {
    private String chewEffect;
    public Candy(String name, String flavor, double price, int calories,ItemCategories itemType, String chewEffect) {
        super(name, flavor, price, calories, itemType);
        this.chewEffect = chewEffect;
    }
    @Override
    public double calcTotalPrice() {
        double total = getPrice();

        return total;
    }
}
