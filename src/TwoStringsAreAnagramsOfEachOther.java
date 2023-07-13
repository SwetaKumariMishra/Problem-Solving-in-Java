import java.util.Arrays;

public class TwoStringsAreAnagramsOfEachOther {
    public static boolean areAnagrams( char str1[], char str2[])
    {
        int n1 = str1.length;
        int n2 = str2.length;

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i=0; i<n1; i++)

           if(str1[i] != str2[i])
           return false;

               return true;
    }

    public static void main(String[] args) {
        char str1[] = {'s', 'w', 'e', 't', 'a'};
        char str2[] = {'w', 't', 'e', 's' ,'a'};

        if(areAnagrams(str1, str2))
        {
            System.out.println("The two strings are anagrams of each other");
        }
        else
        {
            System.out.println("The two strings are not anagrams of each other");
        }
    }
}
