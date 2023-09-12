class Doritos extends VendingItem {
    private boolean hasNormalTax;

    public Doritos(String name, String flavor, double price, int calories, ItemCategories itemType, boolean hasNormalTax) {
        super(name, flavor, price, calories, itemType);
        this.hasNormalTax = hasNormalTax; /* normal tax is 6%*/
    }

    @Override
    public double calcTotalPrice() {
        double total = getPrice();
        if (hasNormalTax) {
            double tax = total * 0.06; // taxes taken out, soda has an extra tax.
            total += tax;
        }
        return total;
    }
}
