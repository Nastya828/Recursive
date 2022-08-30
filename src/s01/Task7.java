package s01;

import java.util.ArrayList;

//7. нахождение второго максимального числа в списке
// (с учётом, что максимальных может быть несколько, если они равны);
public class Task7 {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            numbersList.add(i);
        }


        System.out.println(numbersList);
        System.out.println(searchSecondMax(numbersList));
    }

    static Integer searchSecondMax(ArrayList<Integer> inputList) {
        if (inputList.isEmpty()) {
            return null;
        }

        if (inputList.size() < 3) {
            return Math.min(inputList.get(0), inputList.get(1));
        }


        if (inputList.get(0) <= inputList.get(2) && !inputList.get(1).equals(inputList.get(2))) {
            inputList.remove(0);
        } else if (inputList.get(1) <= inputList.get(2)) {
            inputList.remove(1);
        } else {
            inputList.remove(2);
        }
        return searchSecondMax(inputList);
    }
}
