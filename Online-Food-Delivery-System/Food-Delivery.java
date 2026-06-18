public class FoodItem {
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

    public double calculateAmount() {
        return price * quantity;
    }

   public void displayItemDetails() {
        System.out.println("Item ID : " + itemId);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Amount : " + calculateAmount());
        System.out.println("-----------------------");
    }
}

class Customer {
    int customerId;
    String customerName;
    String mobileNumber;

    Customer(int customerId, String customerName, String mobileNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
    }

    void displayCustomerDetails() {
        System.out.println("Customer ID : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("-----------------------");
    }
}

