package HamburgerOrderProject;

import java.util.Scanner;

public class HealthyBurger extends Hamburger {

    private int healthyBurgerBasePrice = getHamburgerBasePrice() + 6;
    private int extras;

    public HealthyBurger(String meatType) {
        super("brown rye bread roll", meatType);
    }

    public int getHealthyBurgerBasePrice() {
        return healthyBurgerBasePrice;
    }

    @Override
    public int Extras (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want addition to your base burger? (Y/N)");
        String wantExtra = scanner.nextLine();

        if (wantExtra.equals("Y")){
            int extraCount = 0;
            System.out.println("You may choose up to 2 items from the following additions:");
            System.out.println("lettuces, tomatos, carrots, onions, pineapples and mushrums.");

            for (int i = 1; i <= 6; i++){
                if (extraCount >= 2){
                    break;
                }

                Additions additions = list(i);

                System.out.println("How many " + additions.getName() + " do you want?");
                additions.setAmount(scanner.nextInt());
                extraCount += additions.getAmount();
            }

            return extras = (extraCount*2);

        } else {
            scanner.close();
            return extras = 0;
        }

    }

    @Override
    public int Price() {
        int healthyBurgerBasePric = healthyBurgerBasePrice + extras;
        return healthyBurgerBasePric;
    }

    @Override
    public void AdditionsMenu(){
        System.out.println("lettuce = 2 nis");
        System.out.println("tomato = 2 nis");
        System.out.println("carrot = 2 nis");
        System.out.println("onin = 2 nis");
        System.out.println("pineapple = 2 nis");
        System.out.println("mushroms = 2 nis");
    }

    public int gethealthyBurgerBasePrice() {
        return healthyBurgerBasePrice;
    }

    public static Additions list(int number) {
        switch (number) {
            case 1:
                return new Lettuces();
            case 2:
                return new Tomatos();
            case 3:
                return new Carrots();
            case 4:
                return new Onions();
            case 5:
                return new Pineapple();
            case 6:
                return new Mushrooms();
        }

        return null;
    }

}