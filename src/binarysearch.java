




public class binarysearch {
    public static int compute(int [] arr, int key) {
        int start=0;
        int end =arr.length-1;
        int mid;
        while(start<=end) {
            mid = (start +end )/2;
            if (arr[mid]>key) {
                end = mid-1;
            }
            if(arr[mid]<key) {
                start = mid+1;
            }
            if(arr[mid]==key){
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10,12,14,16};
        int key=10;
        int result = compute(arr,10);
        if(result==-1) {
            System.out.println("the element is not present in the array");
        }
        else {
            System.out.println("the index of the "+key+" is "+result);
        }
    }
}
