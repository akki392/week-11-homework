package Question2;

import java.util.Scanner;

public class StudentMarksheet {

    public static void main(String[] args) {
        int Math=80;
        int Science=90;
        int English=93;
        int Total =Math+Science+English;
        float Percentage;
        boolean Result;
        char Grade;

        System.out.println(" -----------------------------------");
        System.out.println("|                                   |");
        System.out.println("| Mark Sheet                        |");
        System.out.println("|___________________________________|");
        System.out.println("|Enter your Name:                   |");
        System.out.println("|Enter your Roll No:                |");
        System.out.println("|___________________________________|");
        System.out.println("| Subjects : Mark                   |");
        System.out.println("|___________________________________|");
        System.out.println("|Enter mark of Math : "+Math+"            |");
        System.out.println("|Enter mark of Science : "+Science+"         |");
        System.out.println("|Enter mark of English : "+English+"         |");
        System.out.println("|___________________________________|");
        System.out.println("|Enter your Total : "+Total+"             |");
        System.out.println("|___________________________________|");
        System.out.println("| Percentage :                      |");
        Percentage = Total / 3;
        System.out.println(Percentage);
        System.out.println("| Result :                          |");
        while (Percentage > 45) {
            System.out.println("Pass");
            break;
        }
        while (Percentage < 45) {
            System.out.println("Fail");
            break;
        }
        while (Percentage < 35) {
            System.out.println("Try Again");
            break;
        }
        System.out.println("| Grade :                           |");
        if (Percentage > 90) {
            System.out.println(" A+ ");
        } else if (Percentage > 85) {
            System.out.println(" A ");
        } else if ((Percentage < 85) && (Percentage > 75)) {
            System.out.println(" B ");
        } else if ((Percentage > 50) && (Percentage < 75)) {
            System.out.println(" C ");
        } else if ((Percentage > 35) && (Percentage < 45)) {
            System.out.println(" D");
        } else
            System.out.println("Fail");
        System.out.println("|___________________________________|");
    }
}

