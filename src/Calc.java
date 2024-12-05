import java.util.Scanner;


public class Calc {

    {
      //  Agent instaLock = new Agent();

        Scanner scnr = new Scanner(System.in);
        double knum, anum, dnum, kda;
        System.out.println("Enter number of kills: ");
        knum = scnr.nextInt();
        System.out.println("Enter number of assist: ");
        anum = scnr.nextInt();
        System.out.println("Enter number of deaths: ");
        dnum = scnr.nextInt();
        kda = (knum + anum) / dnum;
        System.out.println("You're K/D/A is: " + kda);

    }


}
