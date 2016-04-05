public class Euler3{
    public static boolean isPrime(long x){
        for(int i = 3; i < x; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primeFactors(long x){
        if(x == 1){
            System.exit(1);
        }
        long i;
        for(i = 2; i <= x; i++){
            if(x % i == 0){
                System.out.println(i);
                break;
            }
        }
        primeFactors(x/i);
    }

    public static void main(String[] args){
        primeFactors(600851475143L);
    }
}
