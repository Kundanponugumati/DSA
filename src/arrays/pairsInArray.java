package arrays;

public class pairsInArray {
    public static void pairs(int [] arr)
    {
        int noOfPairs=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                System.out.print("{"+arr[i]+","+arr[j]+"}"+" ");
                noOfPairs++;
            }
            System.out.println();
        }
        System.out.println(noOfPairs);
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10,12,14};
        pairs(arr);
    }
}
