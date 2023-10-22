public class pairsInArray {
    public static void compute (int [] arr) {
        int i = 0;
        int j = arr.length - 1;
        int totalPairs=0;
        for ( i = 0; i < j; i++) {
            for (j = i+1; j< arr.length; j++) {
            System.out.print("( "+ arr[i] + " " + arr[j]+" ) "+ " ");
            totalPairs++;
            }
            System.out.println();
        }
        System.out.println(totalPairs);
    }
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10};
        compute(arr);
    }
}
