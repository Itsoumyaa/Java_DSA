import java.util.*;
public class NextPermutation {
    static void Nextpermutation(int[] arr){
        int p=-1;
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                p=i;
                break;
            }
        }
        for(int i=n-1;i>=p;i--){
            if(arr[i]>arr[p]){
                swap(arr,i,p);
                break;
            }
        }
        reverse(arr,p+1,n-1);
    }
     static void reverse(int[] arr, int start, int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={2,4,1,7,5,0};
        System.out.println("Given Array is : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The next permutation is: ");
        Nextpermutation(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
