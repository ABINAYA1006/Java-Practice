import java.util.Scanner;
import java.util.Arrays;
public class Passingfunctions {
public static void main(String[]args){
    int[]nums={3,4,5,6};
    System.out.println(Arrays.toString(nums));
    change(nums);
    System.out.println(Arrays.toString(nums));git commit -m "Added passing functions program"
}
 static void change(int[]arr){
    arr[0]=99;
}
}
