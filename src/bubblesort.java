public class bubblesort {
    public static void compute(int[] arr)
    {
        int n = arr.length;
        int swap=0;
        for(int i=0;i<=n-2;i++)
        {
         for(int j=0;j<=n-2-i;j++)
         {

             if(arr[j]>arr[j+1])
             {
                 int temp =arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
                 swap++;
             }
         }
        }
        System.out.println("no.of Swaps "+swap);

        // for printing sorted array
        for(int element:arr)
        {
            System.out.print(element+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={1,5,2,11,2,1};
        compute(arr);
    }
}
