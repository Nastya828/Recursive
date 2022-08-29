package s01;

import java.util.LinkedList;


//3. расчёт длины списка, для которого разрешена только одна операция удаления первого элемента pop(0);
public class Task3 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 11; i++) {
            numbers.add(i);
        }
        System.out.println(sieListRec(numbers));
    }

    static public int sieListRec(LinkedList<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        numbers.pop();
        return 1 + sieListRec(numbers);
    }
}
