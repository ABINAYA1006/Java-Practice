import java.util.Scanner;
public class Sal{
    public static void main(String[]args){
        int Salary=25000;
        if(Salary>10000){
            Salary=Salary+2000;
        }
        else{
            Salary=Salary+1000;
        }
        System.out.println(Salary);
    }
}