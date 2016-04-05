public class Fibonacci{
    public static int[] fibonacci(int n){
        int[] arr = new int[n];
        int counter = 2;
        int first = 0;
        int second = 1;
        arr[0] = first;
        if(n > 1){
            arr[1] = second;
        }

        while(counter < n){
            int temp = first + second;
            arr[counter] = temp;
            first = second;
            second = temp;
            counter++;
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = fibonacci(1);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
