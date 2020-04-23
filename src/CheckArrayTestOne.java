import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Первая группа тестов для метода findNumbers в классе CheckArray
 * Самая простая реализация, три теста с контролем true и три на проверку false.
 */
public class CheckArrayTestOne {

    CheckArray checkArray;

    @Before
    public void setUp() {
        checkArray = new CheckArray();
    }

    @Test
    public void findNumbers1() {
        assertTrue(checkArray.findNumbers(new int[]{1, 4, 1, 4, 1, 4}));
    }

    @Test
    public void findNumbers2() {
        assertTrue(checkArray.findNumbers(new int[]{1, 1, 1, 1, 1, 4}));
    }

    @Test
    public void findNumbers3() {
        assertTrue(checkArray.findNumbers(new int[]{4, 1, 1, 1, 1, 1}));
    }

    @Test
    public void findNumbers4() {
        assertFalse(checkArray.findNumbers(new int[]{1, 1, 1, 1, 1, 1}));
    }

    @Test
    public void findNumbers5() {
        assertFalse(checkArray.findNumbers(new int[]{4, 4, 4, 4, 4, 4}));
    }

    @Test
    public void findNumbers6() {
        assertFalse(checkArray.findNumbers(new int[]{1, 4, 0}));
    }
}