package LinearEquationSolver;

/*
 * This program solves a two unknown variables linear equations
 */
import java.util.Scanner;
public class EquationSolver{
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in); //Calling a scanner object

        // declaring the variables
        int a11, a12, a21, a22, b1, b2;
        int typeOfSolution;
        final int MAX = 1000; //round max numbers

        // getting the input from the user
        System.out.println ("This program solves a system of 2 linear equations");
        System.out.println ("Enter the coefficients a11, a12, a21, a22, b1, b2");
        a11 = scan.nextInt();
        a12 = scan.nextInt();
        a21 = scan.nextInt();
        a22 = scan.nextInt();
        b1 = scan.nextInt();
        b2 = scan.nextInt();

        // choosing the right solution type and then later on entering it to a switch statment
        if (((a11*a22)-(a12*a21)) != 0){ //one solution
            typeOfSolution = 1;
        } else if ((((b2*a11)-(b1*a21)) == 0) && (((b1*a22)-(b2*a12)) == 0)) { //endless options for a solution
            if (((b1 != 0) && (a11 == 0) && (a12 == 0)) ||((b2 !=0) && (a21 == 0) && (a22 == 0))){ // no soultion
                typeOfSolution = 3;
            } else { //endless option for a soultion
                typeOfSolution = 2;
            }
        } else { // no solution
            typeOfSolution = 3;
        }

        // the final output to the user
        System.out.println ("Eq1: " + a11 + "*x1+" + a12 + "*x2=" + b1);
        System.out.println ("Eq2: " + a21 + "*x1+" + a22 + "*x2=" + b2);

        // switch calculation and output
        switch (typeOfSolution) {
            case 1:
                double x1 = (((double) (b1*a22) - (b2*a12)) / ((double) (a11*a22) - (a12*a21)));
                double x2 = (((double) (b2*a11) - (b1*a21)) / ((double) (a11*a22) - (a12*a21)));
                x1 = Math.round (x1*MAX) / (MAX*1.0);
                x2 = Math.round (x2*MAX) / (MAX*1.0);
                System.out.println ("Single solution: (" + x1 + "," + x2 + ")");
                break;
            case 2:
                System.out.println ("Many solutions");
                break;
            case 3:
                System.out.println ("No solution");
                break;
        } // end of switch statement

    } //Closing the main method
} //Closing the class