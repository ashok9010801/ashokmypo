import java.util.Scanner;
public class neon {
    public static void main(String[] args){
        int num,sum=0,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        num=sc.nextInt();
        int square=num*num;
        while(square!=0)
        {
            rem=square%10;
            sum+=rem;
            square/=10;
        }
        if(sum==num)
        {
            System.out.println("it is a neon number");
        }
        else
        {
            System.out.println("it is not a neon number");
        }
    }
}
