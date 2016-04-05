public class Euler2{
    public static void main(String[] args){
        int first = 1;
        int second = 2;
        int max = first + second;
        int sum = 2;
        while(max < 10){
            first = second;
            second = max;
            max = first + second;
        }
        System.out.println(sum);
    }
}
