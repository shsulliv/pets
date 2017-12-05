public class Animal {
    String name;
    String owner;
    int hunger;
    int size;
    boolean isSleeping;
    String message;

    Animal(String name, String owner) {
        this.name = name;
        this.owner = owner;
        setSize(30);
        setHunger(5);
        setMessage("");

    }

    void setHunger(int hunger) {
        if (hunger < 0) {
            hunger = 0;
        }
        if (hunger > 10) {
            hunger = 10;
        }
        this.hunger = hunger;
    }

    void setSize(int size) {
        if (hunger < 0) {
            hunger = 0;
        }
        if (hunger > 100) {
            hunger = 100;
        }
        this.size = size;
    }

    void setMessage(String message) {
        this.message = message;
    }

    void feed(int amount) {
        setHunger(hunger - amount);
        if (hunger == 0) {
            setSize(size + 2);
        }
    }

    void nap() {
        isSleeping = true;
    }

    void wakeUp() {
        isSleeping = false;
    }

    int getHealth() {
        return Math.max(0, (30 - Math.abs(30 - size)) - hunger);
    }


    void checkHealth() {
        int health = getHealth();
        if (health < 5) {
            setMessage("Take your pet to the vet!");
        }
    }

    void play() {
        setHunger(hunger + 3);
        if (hunger > 5) {
            setSize(size - 3);
        }
    }

    void displayAvatar() {
        System.out.println("");
        System.out.println("????????");
        System.out.println("?      ?");
        System.out.println("?      ?");
        System.out.println("????????");
        System.out.println("");
    }

    void displayOwner() {
        System.out.println("This is " + name + ". They belong to " + owner + ".");
    }

    void displayHunger() {
        System.out.println("Hunger level: " + hunger + " / 10");
    }

    void displaySize() {
        System.out.println("Size: " + size + " / 100");
    }

    void displayHealth() {
        System.out.println("Health: " + getHealth() + " / 30");

    }

    void displayConsciousness() {
        if (isSleeping) {
            System.out.println("Shhh!" + name + " is sleeping.");
        } else {
            System.out.println(name + " is awake.");
        }
    }

    void displayMessage() {
        System.out.println(message);
    }

    void display() {
        checkHealth();
        displayAvatar();
        displayOwner();
        displayHunger();
        displaySize();
        displayHealth();
        displayConsciousness();
        displayMessage();
    }

}
