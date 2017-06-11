import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class AppTest {
    @Test public void testAppCanDetermineARangeOfHappyNumbers() {
        App app = new App();
        Integer[] data = new Integer[] {
            1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 49, 68, 70, 79, 82,
            86, 91, 94, 97, 100, 103, 109, 129, 130, 133, 139, 167, 176,
            188, 190, 192, 193, 203, 208, 219, 226, 230, 236, 239, 262, 263,
            280, 291, 293, 301, 302, 310, 313, 319, 320, 326, 329, 331, 338,
            356, 362, 365, 367, 368, 376, 379, 383, 386, 391, 392, 397, 404,
            409, 440, 446, 464, 469, 478, 487, 490, 496, 536, 556, 563, 565,
            566, 608, 617, 622, 623, 632, 635, 637, 638, 644, 649, 653, 655,
            656, 665, 671, 673, 680, 683, 694, 700, 709, 716, 736, 739, 748,
            761, 763, 784, 790, 793, 802, 806, 818, 820, 833, 836, 847, 860,
            863, 874, 881, 888, 899, 901, 904, 907, 910, 912, 913, 921, 923,
            931, 932, 937, 940, 946, 964, 970, 973, 989, 998, 1000
        };
        ArrayList<Integer> expecteds = new ArrayList<Integer>(Arrays.asList(data));
        ArrayList<Integer> actuals = app.getHappyRange(1, 1000);
        assertEquals(expecteds, actuals);
    }

    @Test public void testSumDigits() {
        App app = new App();
        Integer expected = 10;
        Integer actual = app.sumDigits(new Integer[]{9, 1});
        assertEquals(expected, actual);
    }

    @Test public void testSquareDigits() {
        App app = new App();
        Integer[] expecteds = new Integer[]{9, 1};
        Integer[] actuals = app.squareDigits(new Integer[]{3, 1});
        assertArrayEquals(expecteds, actuals);
    }

    @Test public void testNumberToDigits() {
        App app = new App();
        Integer[] expecteds = new Integer[]{3, 1};
        Integer[] actuals = app.numberToDigits(31);
        assertArrayEquals(expecteds, actuals);
    }

    @Test public void testHappyNumberIsHappy() {
        App app = new App();
        assertTrue("31 should be a happy number", app.isHappy(31));
    }

    @Test public void testFinalUnhappyNumberIsNotHappy() {
        App app = new App();
        assertFalse("4 should not be a happy number", app.isHappy(4));
    }

    @Test public void testUnhappyNumberIsNotHappy() {
        App app = new App();
        assertFalse("738 should not be a happy number", app.isHappy(738));
    }
}
