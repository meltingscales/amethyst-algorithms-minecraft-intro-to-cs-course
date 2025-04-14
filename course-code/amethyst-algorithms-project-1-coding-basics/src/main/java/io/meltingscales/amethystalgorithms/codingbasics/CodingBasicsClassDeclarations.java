package io.meltingscales.amethystalgorithms.codingbasics;

public class CodingBasicsClassDeclarations {

  /***
   *
   * As you can see, this is somewhat different than an interface. <br>
   *
   * Similar to interfaces, though, this class can NOT be instantiated.<br>
   *
   * You can extend this {@link #"Organism"}, and if you do, you must implement ALL abstract methods.
   */
  public abstract class Organism {

    /***
     * Here we have an 'instance variable'. It can be created when a subclass of Organism is instantiated.<br>
     *
     * This is the first major difference between abstract classes and 'interfaces'.<br>
     *
     * 'Interfaces' can NOT be instantiated, and are NOT allowed to have ANY instance variables, nor are they allowed to have methods with implementation.
     */
    public boolean alive;

    // Below here are a bunch of abstract methods.
    // This is similar to interfaces, except the 'abstract' modifier is added.
    // Note there is no method body.
    public abstract void live();

    public abstract void die();

    // Actually, this is another form of polymorphism called 'method overloading'.
    // Essentially, we have two methods with the SAME NAME! How's that work? How does Java know
    // which to use?
    // They have one way to be identified: They take different arguments!
    public abstract void eat(Organism o);

    public abstract void eat();

    public abstract void move();

    // And the last main difference, a method with a body.
    // Abstract classes have methods with bodies, but can not be called directly, and must be called
    // by making something that 'extends' or 'subclasses' an Organism.
    public void test() {
      System.out.println("Hi! I'm a test method!");
    }
  }

  public class Wolf extends Organism {

    @Override
    public void live() {
      System.out.println("I am a fierce baby " + getClass().getSimpleName() + "!");
    }

    @Override
    public void die() {
      System.out.println("Me, a " + getClass().getSimpleName() + ", has died!");
      alive = false;
    }

    @Override
    public void eat(Organism o) {
      System.out.println("Mmm, a meaty " + o.getClass().getSimpleName() + " to eat!");
      o.die();
    }

    @Override
    public void eat() {
      System.out.println("I can't eat grass, I'm a " + getClass().getSimpleName());
    }

    @Override
    public void move() {
      System.out.println("(silently lurks)");
    }
  }

  public class Deer extends Organism {

    /***
     * The default constructor.<br>
     *
     * Called when a Deer is instantiated.
     */
    public Deer() {
      System.out.println("Who's instantiating the deer class?!");
    }

    @Override
    public void live() {
      System.out.println("I am a beautiful baby " + getClass().getSimpleName() + "!");
    }

    @Override
    public void die() {
      System.out.println("Me, a " + getClass().getSimpleName() + ", has died!");
      alive = false;
    }

    @Override
    public void eat(Organism o) {
      System.out.println("I can't eat that! It's another organism!");
    }

    @Override
    public void eat() {
      System.out.println("Mmm, grass!");
    }

    @Override
    public void move() {
      System.out.println("(gracefully prances)");
    }
  }

  public void run_example(String[] args) {
    /***
     * This is an example of polymorphism.<br>
     *
     * You're allowed to say that 'd1' is an Organism because Deer can do everything that Organisms can.<br>
     *
     * I.e. a Deer IS-A Organism.
     */
    Organism d1 = new Deer();

    /***
     * HOWEVER, you are NOT allowed to do this! (hence why it is commented out!)<br>
     *
     * The reason being that the Organism class -would- be being instantiated, and we can't do that.<br>
     *
     * You can't instantiate an Organism, and also, and Organism is NOT a deer.
     */
    // Deer d1 = new Organism();

    Deer d2 = new Deer();

    d1.eat();
    d2.eat();

    Organism w1 = new Wolf(); // Again we see polymorphism in action.

    w1.eat(d1); // Wolf 1 eats an Organism, which happens to be a Deer.
  }

  public static void main(String[] args) {

    CodingBasicsClassDeclarations example = new CodingBasicsClassDeclarations();

    example.run_example(args);
  }
}
