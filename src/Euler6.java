public class Euler6{
    public static void main(String[] args){
        long sumSq = 0;
        long sqSum = 0;
        for(int i = 1; i <= 100; i++){
            sumSq = sumSq + (i*i);
            sqSum = sqSum + i;
        }

        sqSum = sqSum * sqSum;

        System.out.println(Math.abs(sumSq - sqSum));
    }
}
