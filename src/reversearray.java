public class reversearray {
     static void compute (int [] arr) {
         int temp;
         int i=0;
         int j= arr.length-1;
         while(i<=j) {
             temp = arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             i++;
             j--;
         }
    }
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10,12};
        compute(arr);
        for(int element:arr) {
            System.out.print(element+ " ");
        }
    }
}
