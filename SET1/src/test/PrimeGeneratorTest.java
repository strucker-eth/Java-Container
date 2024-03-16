import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

public class PrimeGeneratorTest {

    @Test
    public void testGeneratePrimes() {
        PrimeGenerator gen = new PrimeGenerator(1, 10);
        gen.generatePrimes();
        Long[] expectedPrimes = {2L, 3L, 5L, 7L};
        assertIterableEquals(Arrays.asList(expectedPrimes), gen.getPrimes());
    }

    @Test
    public void testGeneratePrimesNegative() {
        PrimeGenerator gen = new PrimeGenerator(-10, 10);
        gen.generatePrimes();
        LinkedList<Long> primes = gen.getPrimes();
        // Asserting that no primes are generated for negative range
        assertEquals(0, primes.size());
    }
}
