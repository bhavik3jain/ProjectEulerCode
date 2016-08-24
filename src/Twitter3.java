public class Twitter3 {
	public static void makeStar(int n){
		String val = "#";
		String fin = "";
		
		for(int i = 1; i <= n; i = i + 2){
			String temp = "";
			String space = "";
            while(temp.length() < i){
                temp = temp + val;
            }
            int t = 1;
            while(t <= ((n-i)/2)){
                space = space + " ";
                t++;
            }
            fin = fin + space + temp + '\n';
		}
		System.out.println(fin);
	}
	
	public static void main(String[] args){
		makeStar(9);
	}
}