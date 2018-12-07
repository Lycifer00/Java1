public class Prime {
    public static void main(String[] args){
        for (int i = 1; i < 100; i++){
            if (isPrimeNumber(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrimeNumber(int x){
        if (x < 2){
            return false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(x); i++){
                if (x % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
