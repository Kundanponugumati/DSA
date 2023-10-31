package kunalTutorial.searching;

public class noContainEvenDigits {
    public static void compute(int [] arr)
    {
        int odd =0;
        int even =0;
        for(int element:arr)
        {
//            String str =Integer.toString(element);
            String str = ""+element;
            if(str.length()%2==0)
            {
                even++;
            }
            if(str.length()%2!=0)
            {
                odd++;
            }
        }
        System.out.println("total no.of even no.of digits elements "+even);
        System.out.println("total no.of odd no.of digits elements "+odd);
    }
    public static void main(String[] args) {
        int []arr = {12,345,2,6,7896};
        compute(arr);
    }
}
