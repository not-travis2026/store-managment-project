import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

    boolean didBuy = false;
    System.out.println("welcome to the Clothing Store! What would you like to buy today?");
    System.out.println("1. Desing a custom Shirt");
    System.out.println("2. Desing a custom Hat");
    System.out.print("> ");

    int userSelection = input.nextInt();

    if(userSelection == 1) {
      System.out.println("What is the style/brand name of the shirt?");
      System.out.print("> ");
      String shirtName = input.nextLine();

      System.out.println("What is the price of the shirt?");
      System.out.print("> ");
      double shirtPrice = input.nextDouble();
      input.nextLine();

      System.out.println("what size do you need (S, M, L, XL) ?");
      System.out.print("> ");
      String shirtSize = input.nextLine();

      Shirt newShirt = new Shirt(shirtName, shirtPrice, shirtSize);

      System.out.println("\nHere is your custom order:");
      System.out.println(newShirt);
      didBuy = true;
    }

    else if (userSelection == 2) {
      System.out.println("What is the style/brand name of the hat?");
      System.out.print("> ");
      String hatName = input.nextLine();

      System.out.println("What is the price of the hat ?");
      System.out.print("> ");
      double hatPrice = input.nextDouble();

      System.out.println("Is it an adjustable snapback hat? (1 - Yes / 2 - No)");
      System.out.print("> ");
      int adjustableSelection = input.nextInt();

      boolean adjustable = false;
      if(adjustableSelection == 1) {
        adjustable = true;
      }

      Hat newHat = new Hat(hatName, hatPrice, adjustable);

      System.out.println("\nHere is your custom order:");
      System.out.println(newHat);
      didBuy = true;
    }
    System.out.println();
    if(didBuy) {
      System.out.println("Thank you for your purcahase! Your items will ship soon.");
      } else {
      System.out.println("Thanks for browsing our store. Come back when you want to buy!");
      }
// Closes the Scanner object
    input.close();
    
  }
}