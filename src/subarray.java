public class subarray {
    public static void compute(int[] arr) {
        int total_subarrays=0;
        int sum;
        int maxSum=arr[0];
        int minSum=arr[0];
        for(int i=0;i<arr.length;i++) {
            for(int j=i;j<arr.length;j++){
                 sum =0;
                for(int k=i;k<=j;k++) {
                    System.out.print(arr[k] +" ");
                    sum = sum+arr[k];
                }
                System.out.println();
                System.out.println("sum of subarray is "+sum);
                if(maxSum<sum) {
                    maxSum=sum;
                }
                if(minSum>sum) {
                    minSum=sum;
                }
                total_subarrays++;
                System.out.println();
            }
            System.out.println("****");
        }
        System.out.println(total_subarrays);
        System.out.println(maxSum);
        System.out.println(minSum);
    }
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        compute(arr);
    }
}
