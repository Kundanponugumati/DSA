package bitManupulation;

public class clearLastibits {
    public static void compute(int n,int i)
    {

//        int bitmask = (-1)<<i;
        int bitmask = (~0)<<i;
        System.out.println(n&bitmask);
    }
    public static void main(String[] args) {
        compute(15,2);
    }
}
