package s01;

import java.util.LinkedList;

//5 печать только чётных значений из списка
public class Task5 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 0; i <= 20; i++) {
            numbers.add(i);
        }
        printEvenNumbers(numbers);

    }

    static void printEvenNumbers(LinkedList<Integer> numbers) {
        if (numbers.isEmpty()) {
            return;
        }
        int nextValue = numbers.pop();

        if (nextValue % 2 == 0) {
            System.out.print(nextValue + " ");
        }
        printEvenNumbers(numbers);
    }

}
