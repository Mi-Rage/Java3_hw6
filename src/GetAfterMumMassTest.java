import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Параметризованный тест. В качестве параметров у нас двумерный массив из желаемых результатов
 * и входящих данных.
 * В последнем наборе данных будем ловить требуемое исключение RuntimeException
 */
@RunWith(Parameterized.class)
public class GetAfterMumMassTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {new int[] {5, 6, 7}, new int[] {1, 2, 3, 4, 5, 6, 7}},
                {new int[] {0, 0, 0, 0}, new int[] {4, 0, 4, 0, 0, 0, 0}},
                {new int[] {5}, new int[] {40, 1, 2, 4, 5}},
                {null, new int[] {40, 1, 2, 3, 5}}
        });
    }
    private final int[] result;
    private final int[] input;

    // Здесь распределим где резульаты , а где исходные данные
    public GetAfterMumMassTest(int[] result, int[] input) {
        this.result = result;
        this.input = input;
    }

    private GetArray getArray;

    @Before
    public void StartTest() {
        getArray = new GetArray();
    }

    @Test
    public void getAfterNum() {
        try {
            Assert.assertArrayEquals(result, getArray.getAfterNum(input));
        } catch (RuntimeException e) {
            System.out.println("Well done, found Exception");
        }
    }
}
