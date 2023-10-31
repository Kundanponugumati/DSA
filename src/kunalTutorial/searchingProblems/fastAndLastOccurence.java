package kunalTutorial.searchingProblems;

public class fastAndLastOccurence {
    public static void main(String[] args) {
        int [] arr= {5,7,7,7,7,8,8,10};
        int key=7;
        System.out.println(compute(arr,key));

    }
    public static int compute(int arr[],int key)
    {
        int start=0;
        int end = arr.length-1;
        int StartPos=0;
        int LastPos=0;
        while(start<=end)
        {
            int middle=(start+end)/2;
            if(arr[middle]>key)
            {
                end= middle-1;
            }
            else if(arr[middle]<key)
            {
                start= middle+1;
            }
            else if(arr[middle]==key)
            {
                // for first occurence.
                end= middle-1;
            }
            StartPos= middle;
        }
        while(start<=end)
        {
            int middle=(start+end)/2;
            if(arr[middle]>key)
            {
                end= middle-1;
            }
            else if(arr[middle]<key)
            {
                start= middle+1;
            }
            else if(arr[middle]==key)
            {
                // for last occurence.
                start= middle+1;
            }
            LastPos= middle;
        }

        return StartPos;
    }
}
