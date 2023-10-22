package bitManupulation;

public class checkNoPowerof2 {
    public static void compute(int num)
    {
        if((num&num-1)==0)
        {
            System.out.println(num+" is power of 2");
        }
        else {
            System.out.println(num+" is not power of 2");

        }
    }
    public static void main(String[] args) {
        int num=16;
        compute(num);
    }
}
