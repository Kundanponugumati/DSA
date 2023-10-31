package kunalTutorial.searching;


public class minAndMax {
    public static void compute(int[] arr)
{
    int min = arr[0];
    int max=arr[0];
    for(int element:arr)
    {
        if(element>max)
        {
            max=element;
        }
        if(element<min)
        {
            min=element;
        }
    }
    System.out.println(min);
    System.out.println(max);
}
    public static void main(String[] args)
    {
        int [] arr= {22,62,81,10,12,14,12,14,29,32};
        compute(arr);
    }
}
