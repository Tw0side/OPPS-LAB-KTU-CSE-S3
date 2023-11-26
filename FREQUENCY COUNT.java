import java.util.Scanner;

class FREQUENCY_COUNT
{
    public int fcoutnt(String str, char ch)
    {
        int count = 0;
        int len = str.length();
        str = str.toLowerCase();
        System.out.println("length of string is " + len);
        for(int i = 0; i < len; i++)
        {
            if(str.charAt(i) == ch)
            {
                count++;
            }
        }
        return count;
    }
}
class FREQUENCYCOUNT
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        FREQUENCY_COUNT obj = new FREQUENCY_COUNT();
        int count = obj.fcoutnt(str, ch);
        System.out.println("Frequency of " + ch + " is " + count);
    }
}