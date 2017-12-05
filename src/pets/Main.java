package pets;

import java.util.Scanner;

public class Main {

  public Main() {
    String command;
    Scanner keyboard = new Scanner(System.in);
    Animal myPet;

    myPet = new Animal("Pipoca", "Shannon");

    while (true) {
      myPet.display();
      System.out.println("What do you want to do with your pet?");
      System.out.println("f - Feed; n - Nap; w - Wake up; p - Play");
      System.out.println("x - Exit");

      System.out.print("> ");
      command = keyboard.next();
      if (command.equals("x")) {
        break;
      }

      handleCommand(myPet, command);
    }

    System.out.println("Good bye");
  }

  public static void main(String[] args) {
    new Main();
  }

  public void handleCommand(Animal pet, String command) {
    if (command.equals("f")) {
      if (pet.isSleeping) {
        pet.setMessage("You cannot feed a sleeping pet! Wake up " + pet.name + " first!");
      } else {
        pet.feed(1);
        pet.setMessage("You have fed " + pet.name + ".");
      }
    }
    if (command.equals("n")) {
      pet.nap();
      pet.setMessage("You have put " + pet.name + " to sleep.");
    }
    if (command.equals("w")) {
      pet.wakeUp();
      pet.setMessage("You have woken up " + pet.name + ".");
    }
    if (command.equals("p")) {
      pet.play();
      pet.setMessage("You have played with " + pet.name + ".");
    }
  }
}
