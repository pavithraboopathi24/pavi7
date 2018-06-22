import java.io.*;
import java.util.*;
class G12
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int reverse=0,remain;
        int n=sc.nextInt();
        int or=n;
        while(n!=0)
        {
            remain=n%10;
            reverse=reverse*10+remain;
            n=n/10;
        }
        if(or==reverse)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("no");
        }
       
    }
}
