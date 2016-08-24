public class Twitter1{
    public static long sumOfIntegers(int[] arr){
        long sum = 0;
        for(int i = 0; i < arr.length; i++){
        	if(arr[i] % 2 != 0){
        		sum = sum + arr[i];	
        	}
        }
        return sum;
    }
    
    public static void selectSort(int[] numbers){
    	for(int i = 0; i < numbers.length; i++)
    	{
            int min;
            min = numbers[i];
            for (int j = i + 1; j < numbers.length; j++)
            {
                if (numbers[j] > min)
                {
                    numbers[i] = numbers[j];
                    numbers[j] = min;
                    min = numbers[i];
                }
            }
    	}
    }

    public static void main(String[] args){
        int[] arr = {1, 6, 4, 7, 9, 2, 8, 7};
        
        selectSort(arr);

        for(int i = 0; i < arr.length; i++){
        	System.out.println(arr[i]);
        }
    }
}