package pets;

public class Dog extends Animal {
  public Dog(String name, String owner) {
    super(name, owner);
  }

  @Override
  void speak() {
    super.setMessage("Woof!");
  }

  @Override
  void displayAvatar() {
    System.out.println("");
    System.out.println("             __");
    System.out.println("            /  \\");
    System.out.println("           / ..|\\");
    System.out.println("          (_\\  |_)");
    System.out.println("          /  \\@\'");
    System.out.println("         /     \\");
    System.out.println("    _   /  `   |");
    System.out.println("    \\/  \\  | _\\");
    System.out.println("     \\   /_ || \\\\_");
    System.out.println("      \\____)|_) \\_)");
    System.out.println("");
  }
}
