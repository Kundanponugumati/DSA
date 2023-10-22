package arrays;

public class binarySearch {
    public static int bsearch(int[]arr,int key)
    {
        int start=0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = (start+end)/2;
            if(key>arr[mid])
            {
                start=mid+1;
            }
            if(key<arr[mid])
            {
                end= mid-1;
            }
            if(key==arr[mid])
            {
                return mid;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10,12,14};
        int key =12;
        int result=bsearch(arr,key);
        if(result==-1)
            System.out.println(key +" is not present in the array");
        else
            System.out.println(key+" is present at index "+result);
    }
}
