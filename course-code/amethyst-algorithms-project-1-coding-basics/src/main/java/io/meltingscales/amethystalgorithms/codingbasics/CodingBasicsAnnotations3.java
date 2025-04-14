package io.meltingscales.amethystalgorithms.codingbasics;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Step 1: Create the Route annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Route {
  String path();

  String method() default "GET";
}

public class CodingBasicsAnnotations3 {

  // Step 2: Annotate methods with @Route
  @Route(path = "/hello", method = "GET")
  public static void handleHello() {
    System.out.println("Hello, world!");
  }

  @Route(path = "/goodbye", method = "POST")
  public static void handleGoodbye() {
    System.out.println("Goodbye, world!");
  }

  // Step 3: Simulate a request and find the matching @Route method
  private static void simulateRequest(String path) throws Exception {

    // search through all methods,
    for (var method : CodingBasicsAnnotations3.class.getDeclaredMethods()) {

      // if our method has a Route annotation,
      if (method.isAnnotationPresent(Route.class)) {
        Route route = method.getAnnotation(Route.class);
        // and, if the path matches,
        if (route.path().equals(path)) {

          // execute our route.
          method.invoke(null); // Invoke the method if the path matches
          return;
        }
      }
    }
    System.out.println("404 Not Found");
  }

  public static void main(String[] args) throws Exception {

    // Think about this for a second - We wrote some pretty powerful code above.
    // We don't need to execute `handleHello()` at all - We DYNAMICALLY FIND the method
    // based on its metadata - its annotation! Isn't that cool?
    //
    // This is called "metaprogramming" and ...well... Peter Norvig (lisp fan) would
    // be very happy. Go research Peter Norvig and "PAIP".
    System.out.println("Simulating a request to '/hello'...");
    simulateRequest("/hello");

    System.out.println("Simulating a request to '/goodbye'...");
    simulateRequest("/goodbye");
  }
}
