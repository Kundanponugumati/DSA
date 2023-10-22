package Strings;

public class stringCompression {
    public static void main(String[] args) {
        String str="aabbcc";
        // output: a4b2c3d2
        String compress="";
//        for(int i=0;i<str.length();i++)
//        {
//            int sum =0;
//            if(i!=0)
//            {
//                if(str.charAt(i)!=str.charAt(i-1))
//                {
//                    for(int j=i+1;j<str.length();j++)
//                    {
//                        if( str.charAt(i)==str.charAt(j))
//                        {
//                            sum++;
//                        }
//                    }
//                    if(sum!=0)
//                        compress=compress+str.charAt(i)+(sum+1);
//                    else
//                        compress=compress+str.charAt(i);
//                }
//            }
//            if(i==0)
//            {
//
//                    for(int j=i+1;j<str.length();j++)
//                    {
//                        if( str.charAt(i)==str.charAt(j))
//                        {
//                            sum++;
//                        }
//                    }
//                    if(sum!=0)
//                        compress=compress+str.charAt(i)+(sum+1);
//                    else
//                        compress=compress+str.charAt(i);
//
//            }
//        }
//        System.out.println(compress);


        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int sum=0;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                sum++;
                i++;
            }
            if(sum>1)
                compress=compress+ch+sum;
            else
                compress = compress +ch;
        }
        System.out.println(compress);
    }
}
