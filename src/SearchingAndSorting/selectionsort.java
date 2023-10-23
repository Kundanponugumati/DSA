package SearchingAndSorting;

public class selectionsort {
    public static void ssort(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int min = arr[i];
            for(int j=0;j<arr.length;j++)
            {
                if(min>arr[j])
                {
                    min=arr[j];
                }
            }
            int temp=arr[i];
            arr[i]=min;
            min=temp;
        }
        // for printing array
        for(int element : arr)
        {
            System.out.print(element+" ");
        }
    }


    public static void main(String[] args)
    {
        int [] arr = {5,4,1,3,2};
        ssort(arr);
    }
}
