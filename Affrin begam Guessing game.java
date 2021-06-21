import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int R = (int)(Math.random()*10+1);
        Scanner SC=new Scanner (System.in);
        System.out.print("Enter a positive number below 10");
        int N = SC.nextInt();
        int C=1;
        while (N !=R)
        {
            C++;
            if(N<R)
            System.out.println(N + "is smaller");
            else
            System.out.println(N + "is greater");
            System.out.println("Enter another number: ");
            N=SC.nextInt();
        }
        if(C==1) System.out.println("*****\nCongratulations!");
        else if(C==2) System.out.println("***\nCongratulations!");
        else if(C==3) System.out.println("*****\nCongratulations!");
        else System.out.println("you win");
    }
}

