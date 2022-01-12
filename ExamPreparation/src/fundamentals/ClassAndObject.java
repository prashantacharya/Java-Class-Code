package fundamentals;

class MobilePhone {
    protected int RAM, storage;
    protected String name;

    MobilePhone(String name, int RAM, int storage) {
        this.RAM = RAM;
        this.storage = storage;
        this.name = name;
    }

    void printInfo() {
        System.out.printf("%s phone has %d GB RAM and %d GB storage.", name, RAM, storage);
    }
}

class AndroidPhone extends MobilePhone {
    private String type;

    AndroidPhone(String name, int RAM, int storage) {
        super(name, RAM, storage);
        this.type = "Android";
    }

    void printInfo() {
        System.out.printf("%s is an %s phone that has %d GB RAM and %d GB storage.", name, type, RAM, storage);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        AndroidPhone galaxyS21 = new AndroidPhone("Samsung Galaxy S21", 8, 256);
        galaxyS21.printInfo();
    }
}
