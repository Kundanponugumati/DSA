package kunalTutorial.searching;

public class binarySearch {
    public static void main(String[] args) {
        int [] arr={2,4,6,9,11,12,14,20,38,43};
        int key = 38;
        System.out.println(compute(arr,key));
       int res = compute(arr,key);
       if(res==-1)
           System.out.println("element not found");
       else
           System.out.println("element found at "+res);
    }

    public static int compute(int[] arr,int key) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
          int middle=(start+end)/2;
          if(arr[middle]>key)
          {
              end=middle-1;
          }
          else if(arr[middle]<key)
          {
              start=middle+1;
          }
          else if(arr[middle]==key)
          {
              return middle;
          }
        }
        return -1;
    }
}
