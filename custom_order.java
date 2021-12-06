import java.util.Scanner; 

public class custom_order {

    static double totalCost; // Total Cost
    static String addOnList; // List of addons 

    static void addItem(String item, int cost) {
            totalCost+=cost;
            addOnList+=item;
        }

    public static void main(String[] args) {
        
    	Scanner keyboard = new Scanner (System.in); 
        
        String firstName; // User's first name
        String itemOrder; // Item ordered
        String frostingType; // Frosting ordered
        String fillingType; // Filling ordered
        String toppings; // Toppings ordered
        String input;  // User input

        double cost = 15.00; // Cost of cake and cupcakes
        final double TAX_RATE = .08;  // Sales tax rate
        double tax; // Amount of tax

        
        // Introduce shop 
        System.out.println("Welcome to Java's Cake & Cupcake Shop!");
        System.out.println("We make custom cakes with our secret cake batter!");
        
        // Prompt user to input first name
        System.out.print("What is your first name? ");
        firstName = keyboard.nextLine();

        // Greet with Menu
        System.out.print(firstName + ", please see our MENU below: ");
        System.out.print("\n"); 
    
        // DISPLAY MENU
        System.out.println("_______________________________________________");      
        System.out.println("        MENU         QUANTITY    BASE COST  ");
        System.out.println("_______________________________________________"); 
        System.out.println("        Cake             1            $15     ");
        System.out.println("   Set of Cupcakes       6            $15     ");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("Frostings* (vanilla, chocolate, strawberry, coco)");
        System.out.println("Fillings* (mocha, mint, lemon, caramel, vanilla)");
        System.out.println("Toppings* (sprinkles, cinnamon, cocoa, nuts)");
        System.out.println("*Frostings , Fillings and Toppings cost $2 each");
        System.out.println("_______________________________________________");

        // PROMPT USER TO ORDER
        System.out.println("Do you want CUPCAKES or a CAKE?");
        itemOrder = keyboard.nextLine();

        // PROMPT USER TO CHOOSE FROSTING
        System.out.println("What type of FROSTING do you want? ");
        System.out.println("Vanilla, Chocolate, Strawberry or Coco");
        frostingType = keyboard.nextLine();

        if (frostingType != "no"){
          addItem(frostingType,2);
          addOnList+=", ";
        }
      
        // PROMPT USER TO CHOOSE FILLING
        System.out.println("What type of FILLING do you want? ");
        System.out.println("Mocha, Mint, Lemon, Caramel or Raspberry");
        fillingType = keyboard.nextLine();

        if (fillingType != "no"){
          addItem(fillingType,2);
          addOnList+=", ";
        }
      
        // PROMPT USER TO CHOOSE TOPPINGS
        System.out.println("What type of TOPPINGS do you want? ");
        System.out.println("Sprinkles, Cinnamon, Cocoa, Nuts");
        toppings = keyboard.nextLine();
        if (toppings != "no"){
          addItem(toppings,2);
          addOnList+=", ";
        }
      
        // DISPLAY ORDER CONFIRMATION
        System.out.println();
        System.out.println(firstName + " , your order is as follows: ");
        System.out.println("_________________________________________");
        System.out.println("Item Ordered: " + itemOrder);
        System.out.println("Frosting: " + frostingType);
        System.out.println("Filling: " + fillingType);
        System.out.println("Toppings: " + toppings);
        System.out.println("_________________________________________");

        // DISPLAY TOTAL COST AND SALES TAX
        totalCost += cost; // Adding Price of the cake
        System.out.printf("The cost of your order is: $%.2f\n", totalCost);
        tax = (totalCost) * TAX_RATE;
        System.out.printf("The tax is: $%.2f\n", tax);
        System.out.printf("The total due is: $%.2f\n",(tax + totalCost));
    }   
}
