import java.util.HashSet;

public class TwitterInterview{
	public static void getPairs2(int[] arr){
		String pairs = "";
		int counter = 0;
		for(int i = 0; i < arr.length; i++){
			for(int j = i; j < arr.length; j++){
				if((arr[i]+arr[j]) == 0 && i != j){
					counter++;
					pairs = pairs + "(" + arr[i] + ", " + arr[j] + ")" + " ";
				}
			}
		}
		System.out.println(counter + " pairs: " + pairs);
	}
	
	public static void getPairs2Hash(int[] arr){
		int counter = 0;
		
		HashSet hS = new HashSet();
		
		for(int i = 0; i < arr.length; i++){
			hS.add(arr[i]);
		}
		
		for(int i = 0; i < arr.length; i++){
			int val = -1 * arr[i];
			if(hS.contains(val)){
				counter++;
				hS.remove(val);
				hS.remove(arr[i]);
			}
			else{
				hS.remove(arr[i]);
			}
		}
		System.out.println(counter);
	}
	
	public static void getPairs3(int[] arr){
		int counter = 0;
		
		for(int i = 0; i < arr.length; i++){
			for(int j = i; j < arr.length; j++){
				for(int k = j; k < arr.length; k++){
					if((arr[i]+arr[j]+arr[k]) == 0 && i != j && i != k && j != k){
						counter++;
					}
				}
			}
		}
		System.out.println(counter);
	}
	
	public static void getPairs3Hash(int[] arr){
		int counter = 0;
		
		HashSet hS = new HashSet();
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
				if(i != j){
					int sum = arr[i] + arr[j];
					if(!hS.contains(sum)){
						hS.add(sum);
						System.out.println(sum);	
					}
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++){
			int val = -1 * arr[i];
			if(hS.contains(val)){
				counter++;
				hS.remove(val);
				hS.remove(arr[i]);
			}
			else{
				hS.remove(arr[i]);
			}
		}
		System.out.println(counter);
	}
	
	public static void main(String[] args){
		int[] a = {1, 2, -1, -3, 5, -5, 10, 11, -21};
		
		getPairs3Hash(a);
	}
}