package HamburgerOrderProject;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("white", "beef");
        hamburger.Extras();
        System.out.println("your hamburger total is " + hamburger.Price() + " nis");

        System.out.println("********");

        HealthyBurger  healthyBurger = new HealthyBurger("beef");
        healthyBurger.Extras();
        System.out.println("your healthy hamburger total is " + healthyBurger.Price() + " nis");

        System.out.println("*******");

        DeluxeBurger deluxeHamburger = new DeluxeBurger("white", "beef");
        deluxeHamburger.Extras();
        System.out.println("your deluxe hamburger total is " + deluxeHamburger.Price() + " nis");

    }
}