package kunalTutorial.searchingProblems;
// ceiling means find the smallest element in array i.e equal to or greater the given element
public class celingANumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 11, 14, 16, 18};
        int key = 17;
        System.out.println(arr[compute(arr, key)]);
    }

    public static int compute(int[] arr, int key) {
        if(key>arr[arr.length-1])
        {
            return -1;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=key)
                return i;
        }

        return -1;
    }
}
