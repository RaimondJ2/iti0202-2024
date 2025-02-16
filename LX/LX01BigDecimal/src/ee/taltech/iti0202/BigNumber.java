package ee.taltech.iti0202.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

public class BigNumber {
    /**
     * Multiply 2 int values and return product in BigInteger
     * 
     * @param factor1 first factor
     * @param factor2 second factor
     * @return factor1 x factor2
     */
    public BigInteger multiplyBigInteger(int factor1, int factor2) {
        int c = 0;
        return BigInteger.valueOf(factor1).multiply(BigInteger.valueOf(factor2));
    }

    /**
     * Divide 2 values and return quotient in BigInteger
     * If divisor is 0, return 0
     * 
     * @param dividend dividend
     * @param divisor  divisor
     * @return dividend / divisor
     */
    public BigInteger divideBigInteger(BigInteger dividend, int divisor) {
        if (divisor == 0)
            return BigInteger.ZERO;
        return dividend.divide(BigInteger.valueOf(divisor));
    }

    /**
     * Add 2 values and return sum in BigInteger
     * 
     * @param add1 first value
     * @param add2 second value
     * @return add1 + add2
     */
    public BigInteger addBigInteger(int add1, int add2) {
        return BigInteger.valueOf(add1).add(BigInteger.valueOf(add2));
    }

    /**
     * Subtract 2 values and return difference in BigInteger
     * 
     * @param minuend    first value
     * @param subtrahend second value
     * @return value1 - value2
     */
    public BigInteger subtractBigInteger(BigInteger minuend, int subtrahend) {
        return minuend.subtract(BigInteger.valueOf(subtrahend));
    }

    /**
     * Multiply double value with int multiplier, round according to rounding
     * and return in BigDecimal
     * 
     * @param value      value to calculate
     * @param multiplier multiplier to use
     * @param rounding   rounding to use
     * @return value multiplied by multiplier and rounded by rounding
     */
    public BigDecimal multiplyAndRoundBigDecimal(double value, int multiplier, int rounding) {
        return BigDecimal.valueOf(value).multiply(BigDecimal.valueOf(multiplier),
                new MathContext(rounding));
    }

    /**
     * Calculate n factorial and return in BigInteger
     * If n < 0, it should return 1
     * 
     * @param n n-th factorial to calculate
     * @return n-th factorial
     */
    public BigInteger factorial(int n) {
        if (n < 0)
            return BigInteger.ONE;
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    /**
     * Calculates base to the power of exponent and return in BigInteger
     * 
     * @param base     base
     * @param exponent exponent
     * @return base to the power of exponent
     */
    public BigInteger power(int base, int exponent) {
        return BigInteger.valueOf(base).pow(exponent);
    }

    /**
     * Round val1 and val2 with the rounding given, and check if they are equal
     * after that
     * 
     * @param val1     first value to round
     * @param val2     second value to round
     * @param rounding rounding to use
     * @return true or false if val1 and val2 are equal after rounded with rounding
     */
    public boolean isSame(BigDecimal val1, BigDecimal val2, int rounding) {
        return val1.round(new MathContext(rounding)).equals(val2.round(new MathContext(rounding)));
    }

    /**
     *
     * @param n n-th fib number to calculate
     * @return n-th fib number value
     */
    public BigInteger fibonacci(int n) {
        if (n <= 0)
            return BigInteger.ZERO;
        BigInteger lastFibNumber1 = BigInteger.ONE;
        BigInteger lastFibNumber2 = BigInteger.ONE;
        BigInteger curFibNumber = BigInteger.ONE;
        for (int i = 3; i <= n; i++) {
            curFibNumber = curFibNumber.add(lastFibNumber1);
            lastFibNumber1 = lastFibNumber2;
            lastFibNumber2 = curFibNumber;
        }
        return curFibNumber;
    }

    /**
     *
     * @param n n-th luc number to calculate
     * @return n-th lucas number
     */
    public BigInteger lucas(int n) {
        if (n <= 0)
            return BigInteger.TWO;
        if (n == 1)
            return BigInteger.ONE;
        BigInteger lastFibNumber1 = BigInteger.ONE;
        BigInteger lastFibNumber2 = BigInteger.ONE;
        BigInteger curFibNumber = BigInteger.TWO;
        for (int i = 2; i <= n; i++) {
            curFibNumber = curFibNumber.add(lastFibNumber1);
            lastFibNumber1 = lastFibNumber2;
            lastFibNumber2 = curFibNumber;
        }
        return curFibNumber;
    }
}
