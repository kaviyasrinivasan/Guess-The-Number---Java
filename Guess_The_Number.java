import java.util.*;
class Guess_The_Number
{
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        String play="yes";
        while(play.equals("yes"))
        {
            int guess=-1;
            int tries=0;
            Random random_num=new Random();
            int rand=random_num.nextInt((100-1))+1;
            while(guess!=rand && tries<=10)
            {
                System.out.println("Guess the Number between 1 and 100");
                guess=sc.nextInt();
                tries+=1;
                if(guess==rand)
                {
                    System.out.println("Hurray! You have Found the Number in "+tries+" Guesses");
                    System.out.println("Do You want to replay? (yes/no)");
                    play=sc.next().toLowerCase();
                }
                
                else if(guess>rand)
                {
                    System.out.println("The number is too High! Try Again...");
                }
                else
                {
                    System.out.println("The number is too Low! Try Again...");
                }
            }
        }
    }
}
