import java.util.Random;
import java.util.Scanner;
class rps
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,comp,user,d=0,u=0,c=0;
        System.out.println("Let's begin Rock-Paper-Scissors");
        while(true)
        {
        System.out.println("Enter 1 for Rock\nEnter 2 for Paper\nEnter 3 for Scissors");
        System.out.println("Enter your choice");
        user=sc.nextInt();
        if(user==1)
        {
            System.out.println("user choice: Rock");
        }
        else if(user==2)
        {
            System.out.println("user choice: Paper");
        }
        else if(user==3)
        {
            System.out.println("user choice: Scissor");
        }
        else
        {
            System.out.println("Invalid input");
        }
        Random ran=new Random();
        comp=ran.nextInt(3);
        if(comp==0)
        {
            System.out.println("Computer choice: Rock");
        }
         else if(comp==1)
        {
            System.out.println("Computer choice: Paper");
        }
        else
        {
            System.out.println("user choice: Scissor");
        }
        if(user==1 && comp==0 || user==2 && comp==1 || user==3 && comp==2)
        {
            System.out.println("Match is draw.");
            d++;
        }
        else if(user==3 && comp==1 || user==1 && comp==2 || user==2 && comp==0)
        {
            System.out.println("You won the match.");
            u++;
        }
        else
        {
            System.out.println("Computer wins!");
            c++;
        }
        System.out.println("Your score:");
        System.out.println("user :"+u);
        System.out.println("comp :"+c);
        System.out.println("Draw :"+d);
        System.out.println("Do you want to play again (yes/no)");
        String again=sc.next();
        if(!again.equalsIgnoreCase("yes"))
        {
            System.out.println("Thank you for playing the game..");
            break;
        }
    }
    }
}