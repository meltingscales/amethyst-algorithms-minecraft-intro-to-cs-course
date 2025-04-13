package io.meltingscales.amethystalgorithms.codingbasics;

// This is a class
public class CodingBasicsFunctionsAndMethods {

  // This is a method/function
  public static void main(String[] args) {

    // This is a nested class that can do math
    class MathUtils {

      // This is a method/function
      public int add_two(int x, int y) {
        return x + y;
      }

      // This is a method/function, too
      public int subtract_two(int x, int y) {
        return x - y;
      }

      // etc.
      public int multiply_two(int x, int y) {
        return x * y;
      }

      public int divide_two(int x, int y) {
        return x / y;
      }

      public int factorial(int n) {
        if (n == 0) return 1;

        return multiply_two(n, n - 1);
      }
    }

    // This is a nested class to demonstrate a cafe order system
    class CafeOrder {

      // This is a method for taking an order. It is tied to the class `CafeOrder`
      public String takeOrder(String customerName, String drink, String size) {
        return "Order for " + customerName + ": " + size + " " + drink;
      }

      // A method for preparing an order. It simulates making the drink.
      public String prepareOrder(String drink) {
        return drink + " is being prepared.";
      }

      // A method for delivering the order to the customer.
      public String deliverOrder(String customerName, String drink) {
        return "Delivering " + drink + " to " + customerName + ".";
      }
    }

    // Using MathUtils to demonstrate mathematical operations
    MathUtils myMathUtils = new MathUtils();
    int a = 3;
    int b = 4;
    int c = myMathUtils.multiply_two(a, b);

    int bigNumber = myMathUtils.factorial(6);

    System.out.printf("a = %d \n", a);
    System.out.printf("b = %d \n", b);
    System.out.printf("c = %d \n", c);
    System.out.printf("bigNumber = %d \n", bigNumber);

    // Using CafeOrder to demonstrate ordering workflow
    CafeOrder cafe = new CafeOrder();
    String order = cafe.takeOrder("Alice", "Latte", "Grande");
    System.out.println(order);

    String preparation = cafe.prepareOrder("Latte");
    System.out.println(preparation);

    String delivery = cafe.deliverOrder("Alice", "Latte");
    System.out.println(delivery);
  }
}
