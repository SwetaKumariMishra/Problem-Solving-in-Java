// Find the Index of the first occurrence in a string
public class FirstOccurrence {
        public int strStr(String haystack, String needle) {
            int m = haystack.length(), n = needle.length();

            if(m < n)
            {
                return -1;
            }
            else if(n == 0)
            {
                return 0;
            }

            for(int i=0; i<=m-n; i++)
            {
                if(haystack.substring(i, i+n).equals(needle))
                {
                    return i;
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        FirstOccurrence fo = new FirstOccurrence();
        System.out.println(fo.strStr("leetcode", "leeto"));
        }
    }
