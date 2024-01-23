package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int N = input.nextInt();
        int nums[] = new int[N];
        int sum = 0;
        double average;

        System.out.println("3개의 정수를 입력하세요: ");
        for (int i = 0; i < N; i++) {
            nums[i] = input.nextInt();
            sum += nums[i];
        }

        average = (double) sum / N;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
