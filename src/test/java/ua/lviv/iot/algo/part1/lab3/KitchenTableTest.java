package ua.lviv.iot.algo.part1.lab3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KitchenTableTest {
    private KitchenTable kitchenTable;

    @BeforeEach
    public void setUp() {
        kitchenTable = new KitchenTable("KitchenTable small №1", 105, 85, 265, "Iron", 150);
    }

    @Test
    public void testToString() {
        KitchenTable kitchenTable = new KitchenTable("KitchenTable small №1", 105, 85, 265, "Iron", 150);
        assertEquals("KitchenTable(super=Desk(name=KitchenTable small №1, height=105, width=85, length=265), material=Iron, maxHeight=150)", kitchenTable.toString());
    }

    @Test
    public void testAdjustHeight() {
        kitchenTable.adjustHeight(10);
        assertEquals(115, kitchenTable.getHeight());
    }

    @Test
    public void testAdjustHeight_ExceedsMaxHeight() {
        kitchenTable.adjustHeight(500);
        assertEquals(150, kitchenTable.getHeight());
    }

    @Test
    public void testMoveDown() {
        kitchenTable.moveDown(10);
        assertEquals(95, kitchenTable.getHeight());
    }

    @Test
    public void testMoveDown_HeightBelowZero() {
        kitchenTable.moveDown(106);
        assertEquals(0, kitchenTable.getHeight());
    }

    @Test
    public void testSetNumberOfShelves() {
        kitchenTable.setMaterial("Iron");
        String actual = kitchenTable.getMaterial();
        assertEquals("Iron", actual);
    }
}
