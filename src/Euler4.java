public class Euler4{
    public static boolean isPalindrom(int x){
        String a = x + "";
        String b = x + "";
        int j = a.length() - 1;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != b.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }

    public static void main(String[] args){
        int max = 0;
        for(int i = 1; i <= 999; i++){
            for(int j = 1; j <= 999; j++){
                int val = i * j;
                if(isPalindrom(val)){
                    if(val >= max){
                        max = val;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
