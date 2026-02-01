import java.util.Arrays;

public class MatrixTranspose {
    public static void main(){
        int[][] array = {{1,2}, {9, -2}};
        int[][] array2 = {{1,2,3}, {-1,-2,-3}, {5,6,7}};
        System.out.println(Arrays.deepToString(getTranspose(array2)));
    }
    public static int[][] getTranspose(int[][] twoDArray){
        int[][] newArray = new int[twoDArray.length][twoDArray.length];
        for(int check = 0; check < twoDArray.length; check++){
            for (int count = 0; count < newArray.length; count++){
                newArray[count][check] = twoDArray[check][count];
            }
        }
        return newArray;
    }
}
