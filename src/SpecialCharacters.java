import java.awt.desktop.PreferencesEvent;

public class SpecialCharacters {
    public static void reverse(char str[])
    {
        int r = str.length-1;
        int l = 0;

        while (l<r)
        {
            if (!Character.isAlphabetic(str[l]))
                l++;
            else if (!Character.isAlphabetic(str[r]))
                r--;

            else {
                char temp = str[l];
                str[l] = str[r];
                str[r] = temp;
                l++;
                r--;
            }
        }
    }
    public static void main(String[] args) {

        String str = "ab,$cd";
        char[] charArray = str.toCharArray();

        System.out.println("Input string:" +str);
        reverse(charArray);
        String revStr = new String(charArray);

        System.out.println("Output string:" +revStr);
    }
}
