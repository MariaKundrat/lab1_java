package ua.lviv.iot.algo.part1.lab4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerDeskTest {
    private ComputerDesk computerDesk;

    @BeforeEach
    public void setUp() {
        computerDesk = new ComputerDesk("ComputerDesk small №1", 85, 100, 155, 6, "Yes");
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
    public void testAdjustHeightExceedsMaxHeight() {
        computerDesk.adjustHeight(500);
        assertEquals(130, computerDesk.getHeight());
    }

    @Test
    public void testMoveDownHeightBelowZero() {
        computerDesk.moveDown(86);
        assertEquals(0, computerDesk.getHeight());
    }
}