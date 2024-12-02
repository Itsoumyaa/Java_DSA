import java.util.*;
public class ReverseAnArray {
    static void reverse(int[] arr){
        int n=arr.length;
        int i=0,j=n-1;
        while(i!=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
