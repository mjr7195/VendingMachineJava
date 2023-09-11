abstract class VendingItem {
    private String name;
    private String flavor;
    private int calories;
    private double price;
    private Category category;

    public VendingItem(String name, String flavor, double price, int calories, ItemCategories itemType) {
        this.name = name;
        this.flavor = flavor;
        this.calories = calories;
        this.price = price;
        this.category = new Category(itemType);
    }
    //abstract method to get total price for soda
    public abstract double calcTotalPrice();

    //Setter and getters for private variables
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getCalories() {
        return calories ;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getItemCategory(){return category;}

}
