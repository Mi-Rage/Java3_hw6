import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Первая группа тестов для метода getAfterNum в классе GetArray
 * Самая простая реализация, три теста с контролем правильности возвращаемого результата и один на проверку исключения.
 */
public class GetAfterNumTestOne {
    GetArray getArray;

    @Before
    public void setUp() {
        getArray = new GetArray();
    }

    @Test
    public void getAfterNum1() {
        Assert.assertArrayEquals(new int[] {5, 6, 7}, getArray.getAfterNum(new int[] {1, 2, 3, 4, 5, 6, 7}));
    }

    @Test
    public void getAfterNum2() {
        Assert.assertArrayEquals(new int[] {0, 0, 0, 0}, getArray.getAfterNum(new int[] {4, 0, 4, 0, 0, 0, 0}));
    }

    @Test
    public void getAfterNum3() {
        Assert.assertArrayEquals(new int[] {5}, getArray.getAfterNum(new int[] {40, 1, 2, 4, 5}));
    }

    @Test (expected = RuntimeException.class)
    public void getAfterGumException() {
        Assert.assertArrayEquals(null, getArray.getAfterNum(new int[] {40, 1, 2, 3, 5}));
    }
}