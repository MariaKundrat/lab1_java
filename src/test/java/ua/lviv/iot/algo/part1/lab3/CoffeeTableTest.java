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
    public void testToString() {
        CoffeeTable coffeeTable = new CoffeeTable("CoffeeTable small №1", 80, 100, 125, 2, 4);
        assertEquals("CoffeeTable(super=Desk(name=CoffeeTable small №1, height=80, width=100, length=125), numberOfShelves=2, numberOfSeats=4)", coffeeTable.toString());
    }

    @Test
    public void testAdjustHeight() {
        int expectedHeight = coffeeTable.getHeight();
        coffeeTable.adjustHeight(10);
        int actualHeight = coffeeTable.getHeight();
        assertEquals(expectedHeight, actualHeight);
    }

    @Test
    public void testMoveDown() {
        assertDoesNotThrow(() -> coffeeTable.moveDown(10));
        assertEquals(80, coffeeTable.getHeight());
        assertDoesNotThrow(() -> coffeeTable.moveDown(200));
        assertEquals(80, coffeeTable.getHeight());
    }

    @Test
    public void testSetNumberOfShelves() {
        coffeeTable.setNumberOfShelves(2);
        int actual = coffeeTable.getNumberOfShelves();
        assertEquals(2, actual);
    }
}