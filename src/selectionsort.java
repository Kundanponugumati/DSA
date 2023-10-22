public class selectionsort {

    public static void compute(int [] arr) {
        int n = arr.length - 1;
        int[] sortedArray = new int[n];
        int index=0;
        // find the min element from the unsorted array
        int min = arr[0];
        for (int i = 0; i < n; i++)
        {
            for (int j =i+1; j <= n; j++)
            {
                if (min > arr[j])
                {
                    min = arr[j];
                    index=j;
                }
            }
            System.out.println(index);
            int temp=arr[i];
            arr[i]=min;
            arr[index]=temp;
        }

        for(int element : arr)
        {
            System.out.print(element+" ");
        }

    }
    public static void main(String[] args) {
        int [] arr = {5,4,1,3,2};
        compute(arr);
    }
}
