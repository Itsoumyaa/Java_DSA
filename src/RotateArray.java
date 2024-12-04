public class RotateArray {
    static void Rotate(int[] arr, int d){
        int n=arr.length;
        d%=n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Rotate(arr,2);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
