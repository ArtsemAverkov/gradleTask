package ru.clevertec;


import org.junit.jupiter.api.Test;
import ru.clevertec.core.Utils;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AppTest {

    @Test
    public void testIsAllPositiveNumbers_AllPositive() {
        boolean result = Utils.isAllPositiveNumbers("12", "79");
        assertTrue(result);
    }

    @Test
    public void testIsAllPositiveNumbers_NegativeNumber() {
        boolean result = Utils.isAllPositiveNumbers("12", "-79");
        assertFalse(result);
    }
}
