package s01;

import java.util.ArrayList;
import java.util.List;

//7. нахождение второго максимального числа в списке
// (с учётом, что максимальных может быть несколько, если они равны);
public class Task7 {


    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(57);
        for (int i = 0; i < 18; i++) {
            numbersList.add(i);
        }

        System.out.println(numbersList);
        System.out.println("result =  " + searchSecondMax(numbersList));
    }

    static Integer searchSecondMax(List<Integer> inputList) {
        int max = Math.max(inputList.get(0), inputList.get(1));
        int index = 0;
        return initParam(max, max, index, inputList);
    }


    static Integer initParam(int max, int maxSecond, int index, List<Integer> inputList) {
        if (index >= inputList.size()) {
            return maxSecond;
        }

        if (inputList.get(index) > max) {
            maxSecond = max;
            max = inputList.get(index);
        }

        if ((inputList.get(index) < max) && (inputList.get(index) > maxSecond || maxSecond == max)) {
            maxSecond = inputList.get(index);

        }

        return initParam(max, maxSecond, index + 1, inputList);
    }



}
