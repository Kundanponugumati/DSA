package bitManupulation;

public class clearithbit {
    public static void compute(int n,int i)
    {

        int bitmask = 1<<i;
        // or we can use bitmask = ~(1<<i);
        System.out.println(n^bitmask);
    }
    public static void main(String[] args) {
        compute(10,3);
    }
}
