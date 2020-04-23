import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
/**
 * Параметризованный тест. В качестве параметров у нас массив из ожидаемого boolean результата
 * и исходных массивов для теста.
 */
@RunWith(Parameterized.class)
public class CheckArrayMassTest {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {true, new int[]{1, 4, 1, 4, 1, 4}},
                {true, new int[]{1, 1, 1, 1, 1, 4}},
                {true, new int[]{4, 1, 1, 1, 1, 1}},
                {false, new int[]{1, 1, 1, 1, 1, 1}},
                {false, new int[]{4, 4, 4, 4, 4, 4}},
                {false, new int[]{1, 4, 0}}
        });
    }

    private boolean result;
    private int[] input;

    // Здесь распределим где резульаты , а где исходные данные
    public CheckArrayMassTest(boolean result, int[] input) {
        this.result = result;
        this.input = input;
    }

    private CheckArray checkArray;

    @Before
    public void setUp() {
        checkArray = new CheckArray();
    }

    @Test
    public void findNumbers() {
        Assert.assertEquals(result, checkArray.findNumbers(input));
    }
}