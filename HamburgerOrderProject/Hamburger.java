package HamburgerOrderProject;

import java.util.Scanner;

public class Hamburger {

    private String breadRollType;
    private String meatType;
    private int extras;
    private final int hamburgerBasePrice = 20;

    public Hamburger(String breadRollType, String meatType) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
    }

    public int Extras (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want addition to your base burger? (Y/N)");
        String wantExtra = scanner.nextLine();

        if (wantExtra.equals("Y")){
            int extraCount = 0;
            System.out.println("You may choose up to 4 items from the following additions:");
            System.out.println("lettuces, tomatos, carrots and onions");

            for (int i = 1; i <= 4; i++){
                if (extraCount >= 4){
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

    public int Price() {
        int hamburgerPrice = hamburgerBasePrice + extras;
        return hamburgerPrice;
    }

    public void AdditionsMenu(){
        System.out.println("lettuce = 2 nis");
        System.out.println("tomato = 2 nis");
        System.out.println("carrot = 2 nis");
        System.out.println("onin = 2 nis");
    }

    public int getHamburgerBasePrice() {
        return hamburgerBasePrice;
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
        }

        return null;
    }
}