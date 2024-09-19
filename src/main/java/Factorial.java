
import java.math.BigInteger;

public class Factorial {

    public static BigInteger factorial(int n)
    {
        if(n==0 || n==1)
        {
            return BigInteger.ONE;
        }

        return BigInteger.valueOf(n).multiply(factorial(n-1));
    }

    public static void main(String[] args) {


        BigInteger result = factorial(5000);
        System.out.println(result);

    }
}
