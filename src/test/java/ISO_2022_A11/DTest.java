package ISO_2022_A11;

import org.junit.Assert;
import org.junit.Test;

public class DTest {

    @Test
    public void testIsLeap() {
        // Test a leap year
        Date leapYear = new Date(2, 29, 2020);
        Assert.assertTrue(leapYear.isLeap());

        // Test a non-leap year
        Date nonLeapYear = new Date(2, 28, 2021);
        Assert.assertFalse(nonLeapYear.isLeap());

        // Test a year divisible by 400
        Date divisibleBy400 = new Date(2, 28, 2000);
        Assert.assertTrue(divisibleBy400.isLeap());

        // Test a year divisible by 100 but not by 400
        Date divisibleBy100 = new Date(2, 28, 1900);
        Assert.assertFalse(divisibleBy100.isLeap());

        // Test a year divisible by 4 but not by 100
        Date divisibleBy4 = new Date(2, 29, 2024);
        Assert.assertTrue(divisibleBy4.isLeap());
    }

    @Test
    public void testInvalidDateParameters() {
        // Test negative day parameter
        try {
            new Date(2, -1, 2022);
            Assert.fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            // Exception was thrown as expected
        }

        // Test negative month parameter
        try {
            new Date(-1, 15, 2022);
            Assert.fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            // Exception was thrown as expected
        }

        // Test negative year parameter
        try {
            new Date(2, 15, -2022);
            Assert.fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            // Exception was thrown as expected
        }
    }
}
