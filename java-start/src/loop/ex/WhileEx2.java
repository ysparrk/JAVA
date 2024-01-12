package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 2;
        int cnt = 1;

        while (cnt <= 10) {
            System.out.println(num);
            num += 2;
            cnt += 1;
        }
    }
}
