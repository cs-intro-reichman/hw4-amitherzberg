public class Primes {
    public static void main(String[] args) {
    
        int n = Integer.parseInt(args[0]); 
        
        boolean[] isPrime = new boolean[n+1]; 

        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        isPrime[0] = false;
        isPrime[1] = false;

        // int i = 2;
        boolean isFirstPrime = true;

        for (int i = 2; i < n+1; i++){
            for (int j = i+1; j < n+1; j++){
                if (j % i == 0){
                    isPrime[j] = false;
                }
            }
        }
        
        System.out.println("Prime numbers up to " + n + ":");

        double primesCounter = 0;
        for (int k = 0; k < n+1; k++) {
            if (isPrime[k]) {
                System.out.println(k);
                primesCounter++;
            }
        }
    
        double primePrecentage = primesCounter / n * 100;
        System.out.println("There are "+ (int)primesCounter + " primes between " + "2" + " and " + n + " (" + Math.round(primePrecentage) + "% are primes)"); 
    }
}
