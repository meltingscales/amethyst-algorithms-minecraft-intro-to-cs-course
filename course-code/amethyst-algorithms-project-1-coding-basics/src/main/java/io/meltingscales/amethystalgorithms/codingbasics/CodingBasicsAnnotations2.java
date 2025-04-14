package io.meltingscales.amethystalgorithms.codingbasics;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

// Step 1: Create the custom annotation
@Retention(RetentionPolicy.RUNTIME) // Keeps the annotation at runtime
@Target(ElementType.METHOD) // This annotation can only be used on methods.
@interface SmellsWeird {
  String message() default "This method smells weird!";
}

public class CodingBasicsAnnotations2 {

  // Step 2: Annotate methods

  // This one has a non-default custom message.
  @SmellsWeird(message = "This method smells like strawberries.")
  public static void sprayStrawberryCologne() {
    System.out.println("Spraying strawberry...");
  }

  // This one has no message.
  @SmellsWeird
  public static void sprayWeirdoCologne() {
    System.out.println("Spraying some weird cologne...");
  }

  // This one has no annotation.
  public static void itsJustWaterBroTrustMe() {
    System.out.println("It's just water bro, trust me");
  }

  public static void main(String[] args) throws Exception {
    System.out.println("Running annotated methods:");

    // Step 3: Scan and process methods dynamically

    // This is a list of all of our methods - declared above.
    Method[] all_methods = CodingBasicsAnnotations2.class.getDeclaredMethods();

    // go through each of the two methods,
    for (var method : all_methods) {

      // if the "SmellsWeird" annotation is present,
      if (method.isAnnotationPresent(SmellsWeird.class)) {

        // Get the annotation,
        SmellsWeird annotation = method.getAnnotation(SmellsWeird.class);

        // and print its message.
        System.out.println("- " + method.getName() + " smells weird: " + annotation.message());
      }
    }

    // notice how our itsJustWaterBroTrustMe method does NOT get executed
    // because it does not have an annotation!
  }
}
