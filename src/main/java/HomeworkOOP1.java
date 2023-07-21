interface VendingMachine {
    void getProduct(String name, int volume);
    void getProduct(String name, int volume, int temperature);
}

class HotDrink {
    private final String name;
    private final int volume;

    public HotDrink(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Volume: " + volume + " ml");
    }
}

class HotDrinkHeir extends HotDrink {
    private final int temperature;

    public HotDrinkHeir(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("Temperature: " + temperature + " degrees");
    }
}

class HotDrinkMachine implements VendingMachine {
    @Override
    public void getProduct(String name, int volume) {
        System.out.println();
        System.out.println("The product " + name + " with a volume " + volume + " has been issued");
        System.out.println();
    }

    @Override
    public void getProduct(String name, int volume, int temperature) {
        System.out.println("The product " + name + " with a volume " + volume + " and with a temperature " + temperature + " has been issued");
        System.out.println();
    }
}

public class HomeworkOOP1 {
    public static void main(String[] args) {
        HotDrink drink1 = new HotDrink("Tea", 300);
        HotDrinkHeir drink2 = new HotDrinkHeir("Coffee", 200, 90);

        HotDrinkMachine machine = new HotDrinkMachine();

        drink1.getInfo();
        drink2.getInfo();

        machine.getProduct("Tea", 300);
        machine.getProduct("Coffee", 200, 90);
    }
}
