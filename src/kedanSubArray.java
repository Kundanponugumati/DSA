public class kedanSubArray {


    public static int check(int[] arr)
    {
        for(int data : arr)
        {
            if(data>0) {
                compute(arr);
                return 0;
            }
        }
        return -1;
    }

    // above code is modifed karens sub array if the elements in the array are all negative.


    public static int  compute(int [] arr)
    {

        int currentSum=0;
        int maxSum=arr[0];
//        for(int i=0;i<arr.length;i++)
//        {
//            if(currentSum+arr[i]>0)
//            {
//                currentSum=currentSum + arr[i];
//            }
//            if(maxSum<currentSum)
//            {
//                maxSum=currentSum;
//            }
//        }
        for(int element : arr)
        {
            if(currentSum+element>0)
            {
                currentSum=currentSum + element;
            }
            if(maxSum<currentSum)
            {
                maxSum=currentSum;
            }
        }
        System.out.println(maxSum);
        return 0;
    }
    public static void main(String[] args)
    {
        int [] arr ={-2,-3,4,-1,-2,1,5,-3};
//        int [] arr = {-1,-2,-3,-4};
        int result = check(arr);
        int min=arr[0];
        if(result == -1)
        {
           for(int data: arr)
           {
               if(min<data)
               {
                   min=data;
               }
           }
            System.out.println(min);
        }
    }
}
