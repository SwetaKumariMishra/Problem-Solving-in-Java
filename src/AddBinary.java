//Given two binary strings a and b, return their sum as a binary string.
public class AddBinary {

    public String addBinary(String a, String b)
    {
        StringBuilder result = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;

        while(i>=0 || j>=0)
        {
            int sum=carry;
            if(i>=0)
            {
                sum = sum+a.charAt(i--) - '0';
            }
            if(j>=0)
            {
                sum = sum+b.charAt(j--) - '0';
            }
            result.insert(0, sum%2);
            carry = sum/2;

        }

        if(carry > 0)
        {
            result.insert(0, 1);
        }
        return result.toString();
    }

    public static void main(String[] args) {

        String a = "1100";
        String b = "1000";

        AddBinary ad = new AddBinary();
        System.out.println(ad.addBinary(a, b));
    }
}
