package ua.lviv.iot.algo.part1.lab3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerDeskTest {
    private ComputerDesk computerDesk;

    @BeforeEach
    public void setUp() {
        computerDesk = new ComputerDesk("ComputerDesk small №1", 85, 100, 155, 6, "Yes", 110);
    }

    @Test
    public void testToString() {
        ComputerDesk computerDesk = new ComputerDesk("ComputerDesk small №1", 85, 100, 155, 6, "Yes", 110);
        assertEquals("ComputerDesk(super=Desk(name=ComputerDesk small №1, height=85, width=100, length=155), numberOfDrawers=6, hasKeyboardTray=Yes, maxHeight=110)", computerDesk.toString());
    }

    @Test
    void testAdjustHeight() {
        computerDesk.adjustHeight(20);
        assertEquals(105, computerDesk.getHeight());
    }

    @Test
    public void testMoveDown() {
        computerDesk.moveDown(10);
        assertEquals(75, computerDesk.getHeight());
    }

    @Test
    public void testAdjustHeight_ExceedsMaxHeight() {
        computerDesk.adjustHeight(500);
        assertEquals(110, computerDesk.getHeight());
    }

    @Test
    public void testMoveDown_HeightBelowZero() {
        computerDesk.moveDown(86);
        assertEquals(0, computerDesk.getHeight());
    }

    @Test
    public void testSetNumberOfShelves() {
        computerDesk.setNumberOfDrawers(6);
        int actual = computerDesk.getNumberOfDrawers();
        assertEquals(6, actual);
    }
}