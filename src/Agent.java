import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Agent
{
  //  public static void main (String[] args)
    {


        Scanner scnr = new Scanner (System.in);
        System.out.println("Enter Agent name: ");
        String agentName = scnr.nextLine();
        System.out.println("You played using: " + agentName);

    }
}
