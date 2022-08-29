package s01;

//возведение числа N в степень M;
public class Task1 {
    public static void main(String[] args) {

        int N = 6;
        int M = 0;

        System.out.println(multiRecursive(N, M));

    }

    static public int multiRecursive(int N, int M) {
        if (M == 0) {
            return 1;
        }
        return N * multiRecursive(N, M - 1);
    }
}
