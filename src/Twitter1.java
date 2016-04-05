public class Twitter1{
    public static long sumOfIntegers(int[] arr){
        long sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args){
        int[] arr = {1, 4, 6, 7, 9};

        System.out.println(sumOfIntegers(arr));
    }
}