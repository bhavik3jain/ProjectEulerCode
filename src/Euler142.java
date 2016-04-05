public class Euler142{
    public static boolean isPerfSq(long x){
        long root = (long) Math.sqrt(x);
        return (x == root * root);
    }

    public static void main(String[] args){
        long x, y, z;
        for(z = 1; z <= Long.MAX_VALUE; z++){
            for(y = 1; y <= Long.MAX_VALUE; y++){
                for(x = 1; x <= Long.MAX_VALUE; x++){
                    long one = x + y; long two = x - y;
                    long three = x + z; long four = x - z;
                    long five = y + z; long six = y - z;
                    if(isPerfSq(one) && isPerfSq(two) && isPerfSq(three) && isPerfSq(four) && isPerfSq(five) && isPerfSq(six)){
                        long sum = x + y + z;
                        System.out.println(sum);
                        System.exit(0);
                    }
                }
            }
        }
    }
}
