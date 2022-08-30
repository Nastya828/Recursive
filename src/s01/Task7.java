package s01;

import java.util.ArrayList;
import java.util.List;

//7. нахождение второго максимального числа в списке
// (с учётом, что максимальных может быть несколько, если они равны);
public class Task7 {
    static Integer maxFirst;
    static Integer maxSecond;


    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(4);
        for (int i = 0; i < 16; i++) {
            numbersList.add(5);
        }
        numbersList.add(4);

        System.out.println(numbersList);
        maxFirst = Math.max(numbersList.get(0), numbersList.get(1));
        maxSecond = Math.min(numbersList.get(0), numbersList.get(1));
        System.out.println("result =  " + searchSecondMax(numbersList));
    }

    static Integer searchSecondMax(List<Integer> inputList) {

        if (inputList.isEmpty()) {
            return null;
        }
        boolean changeBoth = inputList.get(0) > maxFirst;
        boolean changeSecond = inputList.get(0) < maxFirst &&
                (inputList.get(0) > maxSecond || maxSecond.equals(maxFirst));

        if (changeBoth) {
            maxSecond = maxFirst;
            maxFirst = inputList.get(0);
        } else if (changeSecond) {
            maxSecond = inputList.get(0);
        }

        searchSecondMax(inputList.subList(1, inputList.size()));

        return maxSecond;
    }
}
