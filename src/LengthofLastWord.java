//Given a string s consisting of words and spaces, return the length of the last word in the string.
public class LengthofLastWord {

    public static void main(String[] args) {
        String s = "Hello Sweta";
        System.out.println(lengthofLastWord(s));
    }

    static int lengthofLastWord(String s)
    {
        String str = s.trim();
        int count = 0;
        for (int i=str.length()-1; i>=0; i--)
        {
            if(str.charAt(i) != ' ')
            {
                count++;
            }
            else {
                break;
            }
        }
        return count;
    }
}
