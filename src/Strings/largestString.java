package Strings;

public class largestString {
    public static void largestString(String [] fruits)
    {
        String largest = fruits[0];
        for(String data: fruits)
        {
            if(largest.compareTo(data)<0)
            {
                largest=data;
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        String [] fruits = {"apple", "banana","carrot","mango","Mango"};
        largestString(fruits);
    }
}
