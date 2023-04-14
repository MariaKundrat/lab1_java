package ua.lviv.iot.algo.part1.lab3;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CoffeeTableTest {
    private CoffeeTable coffeeTable;

    @BeforeEach
    public void setUp() {
        coffeeTable = new CoffeeTable("CoffeeTable small №1", 80, 100, 125, 2, 4);
    }

    @Test
    public void testAdjustHeight() {
        assertDoesNotThrow(() -> coffeeTable.adjustHeight(10));
        assertEquals(80, coffeeTable.getHeight());
        assertDoesNotThrow(() -> coffeeTable.adjustHeight(200));
        assertEquals(80, coffeeTable.getHeight());
    }

    @Test
    public void testMoveDown() {
        assertDoesNotThrow(() -> coffeeTable.moveDown(10));
        assertEquals(80, coffeeTable.getHeight());
        assertDoesNotThrow(() -> coffeeTable.moveDown(200));
        assertEquals(80, coffeeTable.getHeight());
    }
}