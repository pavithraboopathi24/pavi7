import java.io.*;
import java.util.*;
class G13
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean flag=false;
        for(int i=2;i<=num/2;++i)
        {
            if(num%i==0)
            {
                flag=true;
                break;
            }
        }
        if(!flag)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
