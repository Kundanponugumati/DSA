package kunalTutorial.searching;

public class maxWealth {
    public static void compute(int [][] arr)
    {
//        int [] lengthArr = new int[arr.length];
        int max= Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
           for(int j=0;j<arr[i].length;j++)
           {
               sum = sum + arr[i][j];
           }
           if(max<sum)
           {
               max=sum;
           }
//           lengthArr[i]=sum;

        }
//        int max=Integer.MIN_VALUE;
//        for(int element:lengthArr)
//        {
//            if(max<element)
//            {
//                max=element;
//            }
//        }
        System.out.println(max);


    }
    public static void main(String[] args) {
        int [][] arr= {{1,2,3},{2,1,3},{3,3}};
        compute(arr);
    }
}
