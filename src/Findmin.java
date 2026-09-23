import java.util.Scanner;
public class Findmin {
    public static void main (String[]args){
        int [ ]arr ={18,2,7,3,14,23};
        System.out.println(min(arr));
    }

    static int min(int[]arr){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<ans)
            {
                ans=arr[i];
            }
        }
        return ans;
    }
}
