//Write a Java program to create a class called "Inventory" with a collection of products and methods to add and remove products, and to check for low inventory.
class demo {
    private String[] name;      
    private int[] quantity;     
    private int itemCount;      

    // Constructor to initialize the inventory
    demo(int maxSize) {
        name = new String[maxSize];
        quantity = new int[maxSize];
        itemCount = 0;
    }

    public void add(String itemName, int itemQuantity) {
        if (itemCount < name.length) {
            name[itemCount] = itemName;
            quantity[itemCount] = itemQuantity;
            itemCount++;
            System.out.println("Added " + itemQuantity + " of " + itemName);
        } else {
            System.out.println("Inventory is full, cannot add more items.");
        }
    }

    // Method to remove a quantity of a product
    public void removeQuantity(String product, int userModify) {
        for (int i = 0; i < itemCount; i++) {
            if (name[i].equals(product)) {
                if (quantity[i] >= userModify) {
                    quantity[i] -= userModify;
                    System.out.println("Removed " + userModify + " from " + product + ". New quantity: " + quantity[i]);
                } else {
                    System.out.println("Not enough stock to remove for " + product);
                }
                return;
            }
        }
        System.out.println("Product not found in the inventory.");
    }

    // Method to remove a product from the inventory
    public void removeProduct(String product) {
        for (int i = 0; i < itemCount; i++) {
            if (name[i].equals(product)) {
                
                for (int j = i; j < itemCount - 1; j++) {
                    name[j] = name[j + 1];
                    quantity[j] = quantity[j + 1];
                }
                name[itemCount - 1] = null;  
                quantity[itemCount - 1] = 0; 
                itemCount--; 
                System.out.println("Product " + product + " removed from inventory.");
                return;
            }
        }
        System.out.println("Product not found in the inventory.");
    }

    
    public void displayInventory() {
        if (itemCount == 0) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("Inventory:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("Item: " + name[i] + ", Quantity: " + quantity[i]);
        }
    }
}

public class Inventory {
    public static void main(String[] args) {
        
        demo inventory = new demo(5);

        
        inventory.add("Apple", 10);
        inventory.add("Banana", 20);
        inventory.add("Orange", 15);
      ;

        
        inventory.displayInventory();

        
        inventory.removeQuantity("Apple", 5);

        
        inventory.removeProduct("Banana");

       
        inventory.displayInventory();
    }
}

   
  
