//How do you count the occurrence of a given character in a string
public class Occurence {
    public static void main(String[] args) {
        //First method
                String str = "Sweta Mishra";
               char ch = 'a';
                int cnt = 0;

                for ( int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == ch)
                        cnt++;
                }
               System.out.println("Occurrences of "+ch+" are:" +cnt);

        //Second method
        int totalcount = str.length();
        int total_Occurrence = str.replace("h","").length();
        int count = totalcount - total_Occurrence;
        System.out.println("Occurrences of h are:" +count);

         }
        }


