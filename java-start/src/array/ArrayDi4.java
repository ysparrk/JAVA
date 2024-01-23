package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        // 2*3 2차원 배열, 초기화
        int[][] arr = new int[2][3];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;  //후위 증감 연산자
            }
        }

        
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
} 
