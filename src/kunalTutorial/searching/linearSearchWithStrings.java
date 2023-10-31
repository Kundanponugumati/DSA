package kunalTutorial.searching;

public class linearSearchWithStrings {
    public static int compute(String name , char key)
    {
        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String name = "Kundan Sai Ponugumati";
        char key = 'a';
        int res = compute(name,key);
        if(res==-1)
        {
            System.out.println("Character not Found");
        }
        else
            System.out.println("Character found at index "+res);
    }
}
