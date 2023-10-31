package kunalTutorial.searching;

public class searchIn2Darray {
    public static String compute(int [][]arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==key)
                {
                    return (""+i+" row and "+j+" column");
                }
            }
        }
        return "-1";
    }
    public static void minAndMax(int [][]arr)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]<min)
                {
                    min=arr[i][j];
                }
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }
            }
        }
        System.out.println(min);
        System.out.println(max);

    }
    public static void main(String[] args) {
        int [][] arr ={{2,4,6,8},{1,3,5,7},{12,32,11,2,11,34}};
        int key =22;
        minAndMax(arr);
        String res = compute(arr,key);
        if(res.equals("-1"))
        {
            System.out.println("Element not Found");
        }
        else
            System.out.println("element found at "+res);
    }
}
