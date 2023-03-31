

public class PrimeThread extends Thread {
    long minPrime;
    long maxPrime;

    PrimeThread(long minPrime, long maxPrime) {
        this.minPrime = minPrime;
        this.maxPrime = maxPrime;
    }

    boolean isPrime(long n){
        for(int i=2;i<n/2;i++){
            if(n%i==0){ return false;}
        }
        return true;
    }

    public void run() {
 // compute primes larger than minPrime
        System.out.println("Inside run  ");
        for(long i=minPrime; i<=maxPrime; i++) {
            if(isPrime(i)){
                System.out.printf("%d, ", i);
            }
        }
    }


}
