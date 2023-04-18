package ua.lviv.iot.algo.part1.lab4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KitchenTableTest {
    private KitchenTable kitchenTable;

    @BeforeEach
    public void setUp() {
        kitchenTable = new KitchenTable("KitchenTable small №1", 105, 85, 265, "Iron");
    }

    @Test
    public void testAdjustHeight() {
        kitchenTable.adjustHeight(10);
        assertEquals(115, kitchenTable.getHeight());
    }

    @Test
    public void testAdjustHeightExceedsMaxHeight() {
        kitchenTable.adjustHeight(500);
        assertEquals(160, kitchenTable.getHeight());
    }

    @Test
    public void testMoveDown() {
        kitchenTable.moveDown(10);
        assertEquals(95, kitchenTable.getHeight());
    }

    @Test
    public void testMoveDownHeightBelowZero() {
        kitchenTable.moveDown(106);
        assertEquals(0, kitchenTable.getHeight());
    }
}
