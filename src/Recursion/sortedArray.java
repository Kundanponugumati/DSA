package Recursion;

public class sortedArray {
    public static boolean compute(int [] arr,int i)
    {
        if(i==arr.length-1)
        {
            return true;
        }
        if(arr[i]>arr[i+1])
        {
            return false;
        }
        compute(arr,i+1);
        return true;
    }
    public static void main(String[] args) {
        int [] arr = {1,3,2,3,5,6,5,1};
        int i=0;
        System.out.println(compute(arr,i));
    }
}
