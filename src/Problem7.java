/*This problem was asked by Square.

The Sieve of Eratosthenes is an algorithm used to generate all prime numbers smaller than N. The method is to take
increasingly larger prime numbers, and mark their multiples as composite.

For example, to find all primes less than 100, we would first mark [4, 6, 8, ...] (multiples of two), then [6, 9, 12, ...]
(multiples of three), and so on. Once we have done this for all primes less than N, the unmarked numbers that remain
will be prime.

Implement this algorithm.

Bonus: Create a generator that produces primes indefinitely (that is, without taking N as an input).*/

public class Problem7 {

    public static void sieveOfEratosthenes(int n){
        boolean [] isPrime = new boolean[n+1];
        for (int i = 0 ; i < n+1; i++){
            isPrime[i] = true;
        }
        for (int p = 2; p*p <= Math.sqrt(n); p++){
            if (isPrime[p]){
                for (int i = p*p; i<=n; i += p){
                    isPrime[i] = false;
                }
            }
        }
        for (int i = 2 ; i<=n; i++){
            if (isPrime[i]){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String [] args){
        sieveOfEratosthenes(100);
    }
}
