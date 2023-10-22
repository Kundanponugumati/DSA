package bitManupulation;

public class noOf1s {
    public static void compute(int num)
    {
        int count=0;
        if((num & 1) == 0)
        {
         count=0;
         while(num>0)
         {
             num = num >> 1;
             if((num & 1) == 1)
                count++;

         }
        }
        if((num & 1) == 1)
        {
            count=1;
            while(num>0)
            {
                num = num >> 1;
                if((num & 1) == 1)
                    count++;

            }
        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        int num=16;
        compute(num);
    }
}
