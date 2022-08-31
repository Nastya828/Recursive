package s01;

import java.util.ArrayList;
import java.util.List;

//7. нахождение второго максимального числа в списке
// (с учётом, что максимальных может быть несколько, если они равны);
public class Task7 {


    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(25);
        for (int i = 0; i < 18; i++) {
            numbersList.add(i);
        }



        System.out.println(numbersList);
        System.out.println("result =  " + searchSecondMax(numbersList, 0, 0, 0));
    }

    static Integer searchSecondMax(List<Integer> inputList, int index, int max, int maxSecond) {

        if (index >= inputList.size()) {
            return maxSecond;
        }
        if (index == 0) {
            max = inputList.get(index);
            maxSecond = inputList.get(index);

        }
        if (inputList.get(index) > max) {
            maxSecond = max;
            max = inputList.get(index);

        }
        if ((inputList.get(index) < max) && (inputList.get(index) > maxSecond || maxSecond == max)) {
            maxSecond = inputList.get(index);

        }

        return searchSecondMax(inputList, index + 1, max, maxSecond);

    }
}
