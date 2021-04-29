import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        System.out.println("Введите ручками палиндром \n");
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        System.out.println(reverseString(word));
        in.close();
    }

    public static boolean reverseString(String str){
        String answ = "";
        for(int i = str.length()-1; i >= 0; i--)
        {
            answ += str.charAt(i);
        }

        return  isPalindrome(answ, str);
    }

    public static boolean isPalindrome(String str, String str2){
        if(str.equals(str2))
        {
            return true;
        }
        else return false;
    }
}