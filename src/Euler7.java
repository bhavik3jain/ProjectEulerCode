public class Euler7{
    public static boolean isPrime(long x){
        if(x == 2){
            return true;
        }
        for(int i = 2; i < x; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int i = 2;
        int counter = 0;
        while(true){
            if(isPrime(i)){
                counter++;
            }
            if(counter == 10001){
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}
