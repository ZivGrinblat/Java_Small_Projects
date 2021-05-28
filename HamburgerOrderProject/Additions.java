package HamburgerOrderProject;

public class Additions {

    private String name;
    public int amount;

    public Additions(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}

class Lettuces extends Additions {

    public Lettuces() {
        super("lettuce");
    }

}

class Tomatos extends Additions {

    public Tomatos() {
        super("tomatos");
    }
}

class Carrots extends Additions {

    public Carrots() {
        super("carrots");
    }
}

class Onions extends Additions {

    public Onions() {
        super("onions");
    }
}

class Pineapple extends Additions {

    public Pineapple() {
        super("pineapples");
    }
}

class Mushrooms extends Additions {

    public Mushrooms() {
        super("mushrooms");
    }
}
