import java.util.Arrays;

public class GetArray {
    public int[] getAfterNum (int[] array) {
        // Отслеживаемое в массиве число
        int numberAfter = 4;
        int index = -1;
        // Найдем индекс последнего отслеживаемого числа в массиве
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberAfter) {
                index = i;
            }
        }
        // Если такое число есть и индекс найден - вернём массив чисел после отслеживаемого числа
        // Если отслеживаемого числа нет - выбросим RuntimeException
        if (index != -1) {
            int[] arrayResult = new int[array.length - index - 1];
            System.arraycopy(array, index + 1, arrayResult, 0, arrayResult.length );
            return arrayResult;
        } else {
            throw new RuntimeException("ERROR! " + numberAfter + " is not found");
        }
    }
}

// Проверил как оно работает
class GetArrayDemo {
    public static void main(String[] args) {
        GetArray getArray = new GetArray();
        System.out.println(Arrays.toString(getArray.getAfterNum(new int[]{1, 2, 3, 4, 5, 6, 7})));
    }
}