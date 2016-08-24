/**
 * Created by Bhavik Jain on 3/18/2016.
 */
public class Twitter {
    public static void makeStairs(int n){
        String val = "#";
        String fin = "";

        for(int i = 1; i <= n; i++){
            String temp = "";
            while(temp.length() < i){
                temp = temp + val;
            }
            while(temp.length() < n){
                temp = temp + " ";
            }
            fin = fin + temp + '\n';
        }
        System.out.println(fin);
    }

    public static void main(String[] args){
        makeStairs(5);
    }
}
