package main;

import java.util.LinkedList;

public class PrimeGenerator {
    protected long from, to;
    protected LinkedList<Long> primes;

    public PrimeGenerator(long from, long to) {
        this.from = from;
        this.to = to;
        this.primes = new LinkedList<>();
    }

    public void generatePrimes() {
        for (long num = from; num <= to; num++) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
    }

    public LinkedList<Long> getPrimes() {
        return primes;
    }

    private boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
