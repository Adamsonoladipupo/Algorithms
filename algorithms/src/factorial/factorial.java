package factorial;

public class factorial {
    public static void main(String[] args){
        System.out.println(getFactorial(10));
    }

    public static int getFactorial(int number) {
        int factorial = 1;
        for (int counter = number; counter > 0; counter--){
            factorial *= counter;
        }return factorial;
    }
}
