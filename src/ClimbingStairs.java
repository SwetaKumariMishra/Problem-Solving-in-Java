//You are climbing a staircase. It takes n steps to reach the top.
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
public class ClimbingStairs {

    static int climbStairs(int n)
    {
        if(n==1  || n==2)
        {
            return n;
        }
        else {
            return climbStairs(n-1) + climbStairs(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(2));

    }
}
