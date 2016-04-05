public class Euler5{
    public static void main(String[] args){
        int max = 1;
        while(true){
            int counter = 0;
            for(int i = 1; i <= 20; i++){
                if(max % i == 0){
                    counter++;
                }
            }
            if(counter == 20){
                break;
            }
            max++;
        }
        System.out.println(max);
    }
}
