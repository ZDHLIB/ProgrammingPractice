package Easy;

public class Q507 {
    /**
     * Euclid proved that 2p−1(2p−1)2p−1(2p−1) is an even perfect number
     * whenever 2p−12p−1 is prime, where pp is prime.

     For example, the first four perfect numbers are generated
     by the formula 2^(p−1) * (2^(p) − 1), with p a prime number, as follows:

     for p = 2:   2^1(2^2 − 1) = 6
     for p = 3:   2^2(2^3 − 1) = 28
     for p = 5:   2^4(2^5 − 1) = 496
     for p = 7:   2^6(2^7 − 1) = 8128.
     Prime numbers of the form 2^(p) − 1 are known as Mersenne primes.
     For 2^(p) − 1 to be prime, it is necessary that p itself be prime.
     However, not all numbers of the form 2^(p) − 1 with a prime p are prime;
     for example, 2^(11) − 1 = 2047 = 23 × 89 is not a prime number.

     You can see that for small value of p, its related perfect number goes very high.
     So, we need to evaluate perfect numbers for some primes
     (2, 3, 5, 7, 13, 17, 19, 31) only, as for bigger prime its perfect number will not fit in 64 bits.
     * @param num
     * @return
     */
    public boolean checkPerfectNumber(int num) {
        int[] primes=new int[]{2,3,5,7,13,17,19,31};
        for (int prime: primes) {
            if (pn(prime) == num)
                return true;
        }
        return false;
    }

    public int pn(int p) {
        return (1 << (p - 1)) * ((1 << p) - 1);
    }
}
