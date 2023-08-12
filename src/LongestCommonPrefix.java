import java.util.*;
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)
        {
            return "No match found";
        }
        else{
            Arrays.sort(strs);
            StringBuilder result = new StringBuilder();
            char[] first = strs[0].toCharArray();
            char[] last = strs[strs.length-1].toCharArray();

            for(int i=0; i<first.length; i++)

            {
                if(first[i] != last[i])
                    break;
                result.append(first[i]);


            }
            return result.toString();

        }
    }

    public static void main(String[] args) {
        String[] strs = {"dose", "dog", "dove"};
        LongestCommonPrefix lg = new LongestCommonPrefix();
        System.out.println(lg.longestCommonPrefix(strs));
    }
}
