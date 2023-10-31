package kunalTutorial.searching;

public class linearSearch {
    public static int compute(int [] arr, int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10,12};
        int key = 8;
       int res= compute(arr,key);
       if(res==-1)
       {
           System.out.println("Element not Found");
       }
       else
           System.out.println("Element found at index "+res);
    }
}
