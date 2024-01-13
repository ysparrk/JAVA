package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        // 작은 범위 -> 큰범위 형변환
        longValue = intValue;  //int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue;  //double -> int
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
