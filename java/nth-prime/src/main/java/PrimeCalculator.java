public class PrimeCalculator {

    int nth(int nth){

        if(nth==0)
            throw new IllegalArgumentException();
        int primeCount = 0;
        int currentNumber = 1;

        while (primeCount < nth) {
            currentNumber++;
            if (isPrime(currentNumber)) {
                primeCount++;
            }
        }

        return currentNumber;
    }

    public static boolean isPrime(int num) {
        int count=0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if(count!=2) {
            return false;
        }
        return true;
    }

}