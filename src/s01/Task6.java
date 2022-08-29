package s01;

import java.util.ArrayList;

//6. печать элементов списка с чётными индексами;
public class Task6 {
    public static void main(String[] args) {
        ArrayList<String> listForTask6 = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) {
                listForTask6.add(i + " even ");
            } else {
                listForTask6.add(i + " odd ");
            }
        }

        printEvenIndex(listForTask6);
    }

    static void printEvenIndex(ArrayList<String> stringArrayList) {
        if (stringArrayList.isEmpty()) {
            return;
        }

        System.out.print(stringArrayList.get(0) + " ");
        stringArrayList.remove(0);
        if (!stringArrayList.isEmpty()) {
            stringArrayList.remove(0);
        }

        printEvenIndex(stringArrayList);
    }

}
