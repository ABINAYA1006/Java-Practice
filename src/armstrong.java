import java.util.Scanner;
public class armstrong {
    public static void main (String[]args){
        int n=153;
        int temp=n;
        int len=Integer.toString(n).length();
        int sum=0;

        while(n>0) {
            int num=n%10;
            sum = sum+(int)Math.pow(num,len);
            n/=10;
        }
        if(temp==sum){
            System.out.println("armstrong");
        }
        else System.out.println("false");
    }
}
