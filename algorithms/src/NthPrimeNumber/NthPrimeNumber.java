package NthPrimeNumber;

public class NthPrimeNumber {
    public static void main(String[] args) {
        System.out.println(getNthPrimeNumber(8));
    }
    public static int getNthPrimeNumber(int number){
        if(number <= 0) return 0;
        int numberOfPrimes = 0; int checkPrime = 2;
            for(checkPrime = 2; checkPrime > 0; checkPrime++){
                if(isPrime(checkPrime)) numberOfPrimes++;
                if (numberOfPrimes == number) break;
            }
        return checkPrime;
    }
    public static boolean isPrime(int number){
        for (int count = 2; count < number; count++){
            if (number % count == 0) return false;
        }return true;
    }
}
