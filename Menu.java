import java.util.Scanner;

public class Menu {
    public double subTotal;
    public static double runningTotal;
    private static double itemPrice;
    static boolean ordering = true;
    static Scanner input = new Scanner(System.in);
    
    public static void menu() {
        System.out.println("Welcome \n1. Burger ($2.00) \n2. Fries ($1.50)\n3. Soda ($1.00) \n4. Hot Dog ($2.00) \n9. Order Complete");
    }

    public static double itemPrice(int foodItem) {
        if (foodItem == 1) {
            // burger= $3.00
            System.out.println("You have ordered a burger");
            itemPrice = 3.00;
        }
        if (foodItem == 2) {
            // fries = $1.50
            System.out.println("You have ordered fries");
            itemPrice = 1.50;
        }
        if (foodItem == 3) {
            // soda = $1.00
            System.out.println("You have ordered a soda");
            itemPrice = 1.00;
        }
         if (foodItem == 4) {
            // hot dog = $2.00
            System.out.println("You've ordered a hot dog");
            itemPrice = 1.00;
        }
        quantity();
        return itemPrice;
    }
      public static double quantity() {
        System.out.println("Enter quantity");
        double quantity = input.nextDouble();
        return quantity;
    }

      public static void done(double runningTotal) {
        ordering = false;
        System.out.println(runningTotal);
        System.out.println("Enjoy your meal and have a nice day.");
    }
     public static double subTotal(double quantity, double itemPrice) {
        double subTotal = quantity * itemPrice;
        System.out.println("Subtotal: " + subTotal);
        return subTotal;
    }

     public static void main(String[] args) {
     int menuOption;
     int foodItem = 0;
     input = new Scanner(System.in);
     double runningTotal=0;
    do{
    menu();
    menuOption = input.nextInt();
    switch(menuOption){
      case 1:
        foodItem = 1;
        runningTotal += itemPrice(foodItem);
        break;
      case 2:
        foodItem = 2;
        runningTotal += itemPrice(foodItem);
        break;
      case 3:
        foodItem = 3;
        runningTotal += itemPrice(foodItem);
        break;
      case 4:
       foodItem = 4;
       runningTotal += itemPrice(foodItem);
       break; 
      case 9:
        done(runningTotal);
        break;
      default:
        System.out.println("Invalid option.");
    }
  } while(ordering);
  System.out.println("Total amount: " + runningTotal);
 }
}