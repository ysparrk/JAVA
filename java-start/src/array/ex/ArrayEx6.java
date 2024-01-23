package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int N = input.nextInt();
        int nums[] = new int[N];
        int minNum, maxNum;

        System.out.println("3개의 정수를 입력하세요: ");
        for (int i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }

        maxNum = nums[0];
        minNum = nums[0];

        for (int i = 0; i < N; i++) {
            //max 찾기
            if (nums[i] > maxNum) {
                maxNum = nums[i];
            }

            //min 찾기
            if (nums[i] < minNum) {
                minNum = nums[i];
            }
        }


        System.out.println("가장 작은 정수: " + minNum);
        System.out.println("가장 큰 정수: " + maxNum);
    }
}
