class Solution {
    static final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2;
        long oddCount = n / 2;

        long evenPower = power(5, evenCount);
        long oddPower = power(4, oddCount);

        return (int)((evenPower * oddPower) % MOD);
    }

    private long power(long base, long exp) {
        long result = 1;
        base %= MOD;

        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp /= 2;
        }

        return result;
    }
}
