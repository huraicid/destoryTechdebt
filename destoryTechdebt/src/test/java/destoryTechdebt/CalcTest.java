package destoryTechdebt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcTest extends Calc {

    @Test
    @DisplayName("testAdd用のテスト")
    public void testAdd() {
        int actual = Calc.add(1, 2);
        assertEquals(actual, 3);
    }

}
