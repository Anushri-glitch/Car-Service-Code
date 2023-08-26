package Recursion;
import java.util.Scanner;

public class findSum {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        System.out.println("Enter Elements : ");
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum = 0;
                String str = "";
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                    str += Integer.toString(arr[k])+ " ";
                }
                if(sum == 0){
                    System.out.println(str);
                    return;
                }
            }
        }
    }
}
