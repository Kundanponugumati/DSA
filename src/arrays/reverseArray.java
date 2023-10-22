package arrays;

public class reverseArray {
    public static void reverse(int[]arr)
    {
        int start=0;
        int end = arr.length-1;
        while(start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int element : arr)
        {
            System.out.print(element+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10,12,14};
        reverse(arr);
    }
}
