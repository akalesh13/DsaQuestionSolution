//Check String is Anagram or not.
package StringQuestion;
import java.util.Arrays;
import java.util.Scanner;
public class AnagramString {
    static boolean checking(String s1,String s2){
       char [] char1 =s1.toCharArray();
       char [] char2=s2.toCharArray();
        int n1= char1.length;
        int n2=char2.length;
        if(n1!=n2){
            return false;
        }
        Arrays.sort(char1);
        Arrays.sort(char2);
        for(int i=0;i<n1;i++){
            if(char1[i]!=char2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Two String");
        String s1=sc.nextLine();
        String s2=sc.nextLine();
         boolean result=checking(s1,s2);
         if(result){
             System.out.println("String is Anagram");
         }
         else {
             System.out.println("String is not Anagram");
         }

    }
}
