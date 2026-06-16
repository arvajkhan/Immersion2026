
class FoodItem {

    private int itemId;
    private String itemName;
    private double price;
    private int quantity;

   public  FoodItem(int itemId, String itemName, double price, int quantity) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

  public  double calculateAmount() {
        return price * quantity;
    }

  public  void displayItemDetails() {
        System.out.println("Item ID : " + itemId);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Amount : " + calculateAmount());
        System.out.println("-----------------------");
    }
}

