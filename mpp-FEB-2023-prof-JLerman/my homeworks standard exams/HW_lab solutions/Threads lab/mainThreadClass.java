

public class mainThreadClass {


    public static boolean isPrime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0){ return false;}
        }
        return true;
    }

    public static void main( String[] args ) {

//        create 5 thread to print all prime numbers between 1 and 1,000,000
        System.out.println("Inside main  ");        
        long startTime = System.currentTimeMillis();

        PrimeThread pThread1 = new PrimeThread(1, 100_000);
        PrimeThread pThread2 = new PrimeThread(100_001, 200_000);
        PrimeThread pThread3 = new PrimeThread(300_001, 600_000);
        PrimeThread pThread4 = new PrimeThread(400_001, 500_000);
        PrimeThread pThread5 = new PrimeThread(500_001, 600_000);
        PrimeThread pThread6 = new PrimeThread(600_001, 700_000);
        PrimeThread pThread7 = new PrimeThread(700_001, 800_000);
        PrimeThread pThread8 = new PrimeThread(800_001, 900_000);
        PrimeThread pThread9 = new PrimeThread(900_001, 1_000_000);

        pThread1.run();
        pThread2.run();
        pThread3.run();
        pThread4.run();
        pThread5.run();
        pThread6.run();
        pThread7.run();
        pThread8.run();
        pThread9.run();


        /**
        for(int i=2; i<=1_000_000; i++){
            if(isPrime(i)){
                System.out.printf("%d, ", i);
            }
        }
         **/
        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal Time:"+ (endTime-startTime) +"ms");
//        Total Time:88_973-ms (without multi thread) 76_941
//        Total Time:224_144-ms --  218_409-ms
        //        PrimeThread p = new PrimeThread(143);
        //        p.start();

    }
}
