package pets;

public class Cat extends Animal {
  public Cat(String name, String owner) {
    super(name, owner);
  }

  @Override
  void speak() {
    super.setMessage("Meow!");
  }

  @Override
  void displayAvatar() {
    System.out.println("");
    System.out.println(" /\\___/\\");
    System.out.println("( o   o )");
    System.out.println("(  =^=  )");
    System.out.println("(        )");
    System.out.println("(         )");
    System.out.println("(          ))))))))))) ");
    System.out.println("");
  }
}
