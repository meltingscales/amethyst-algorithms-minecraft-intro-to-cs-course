package io.meltingscales.amethystalgorithms.codingbasics;

public class CodingBasicsAnnotations1 {

  static class KittyCat {
    @Override // Tells the compiler we're overriding the toString method
    public String toString() {
      return "Meow!! I'm a cat :3c";
    }
  }

  public static void main(String[] args) {
    KittyCat wallaceTheCat = new KittyCat();
    System.out.println(wallaceTheCat.toString());
  }
}
