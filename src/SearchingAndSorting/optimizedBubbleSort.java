package SearchingAndSorting;

public class optimizedBubbleSort {
    public static void optimisedbsort(int [] arr)
    {
        int swaps=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                swaps++;
            }
        }
        if(swaps==0)
        {
            System.out.println("Given array is sorted Array");
        }
    }
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        optimisedbsort(arr);
    }
}
