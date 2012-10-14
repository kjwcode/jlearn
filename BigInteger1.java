import java.math.BigInteger;


public class BigInteger1 {
    public static void main(String[] args) {
        BigInteger two = new BigInteger("2");
        BigInteger bigint = two.pow(256);
        System.out.println(bigint);

        BigInteger bigint2 = bigint.multiply(two);
        System.out.println(bigint2);

        BigInteger bigint3 = bigint.divide(two);
        System.out.println(bigint3);
        System.out.format("0x%s\n", bigint3.toString(16));
    }
}
