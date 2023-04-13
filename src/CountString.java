import java.util.HashMap;
import java.util.Map;

//Write a java program to count the number of words in a string using HashMap
public class CountString {
    public static void main(String[] args) {


                String str = "My name is Sweta";

                Map<String, Integer> Map = new HashMap<>();

                String[] words = str.split(" ");

                for (String word : words) {
                    // containsKey(key) will return a boolean value
                    // i.e. true if it contains the key and false if
                    // it doesn't.
                    if (Map.containsKey(word))
                        Map.put(word, Map.get(word) + 1);

                    else
                        Map.put(word, 1);
                }

                System.out.println(Map);
            }
        }
