package s01;

//2. вычисление суммы цифр числа;
public class Task2 {
    public static void main(String[] args) {
        int digit = 1234;
        System.out.println(sumRecurs(digit));
    }

    static public int sumRecurs(int digit) {
        if (digit == 0) {
            return 0;
        }
        return digit % 10 + sumRecurs(digit / 10);
    }
}
