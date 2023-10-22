package arrays;

public class linearSearch {
    public static int lsearch(int[]arr,int key)
    {
//        for(int data:arr)
//        {
//            if(key==data)
//                return key;
//        }
        for(int i=0;i<arr.length;i++)
        {
            if(key==arr[i])
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int key =10;
        int result = lsearch(arr,key);
        if(result==-1)
        {
            System.out.println(key+" is not present in the given array");
        }
        else
            System.out.println(key+" is present in the given array at index "+result);
    }
}
