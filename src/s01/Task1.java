package s01;

//1. возведение числа N в степень M;
public class Task1 {
    public static void main(String[] args) {

        int N = -2;
        int M = 5;

        System.out.println(multiRecursive(N, M));

    }

    static public int multiRecursive(int N, int M) {
        if (M == 0) {
            return 1;
        }
        return N * multiRecursive(N, M - 1);
    }
}
