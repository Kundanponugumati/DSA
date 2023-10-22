public class prefixarray {
    public static void prefixArray (int [] arr)
    {
        // prefix array
        int [] prefixarry = new int [arr.length];
        prefixarry[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            prefixarry[i]= prefixarry[i-1]+ arr[i];
        }
        // printing prefix array
        for(int data : prefixarry)
        {
            System.out.print(data+ " ");
        }
        System.out.println();

    }
    public static void sumOfArray(int [] arr)
    {
        int sum =0;
        for(int element:arr)
        {
            sum =sum+element;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        prefixArray(arr);
        sumOfArray(arr);
    }
}
