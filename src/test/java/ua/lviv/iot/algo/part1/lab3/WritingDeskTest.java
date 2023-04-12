package ua.lviv.iot.algo.part1.lab3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WritingDeskTest {
    private WritingDesk writingDesk;

    @BeforeEach
    public void setUp() {
        writingDesk = new WritingDesk("WritingDesk small №1", 70, 105, 145, 4, "Yes", 200);
    }

    @Test
    public void testAdjustHeight() {
        writingDesk.adjustHeight(10);
        assertEquals(80, writingDesk.getHeight());
    }

    @Test
    public void testAdjustHeightExceedsMaxHeight() {
        writingDesk.adjustHeight(50);
        assertEquals(100, writingDesk.getHeight());
    }

    @Test
    public void testMoveDown() {
        writingDesk.moveDown(10);
        assertEquals(60, writingDesk.getHeight());
    }

    @Test
    public void testMoveDownHeightBelowZero() {
        writingDesk.moveDown(100);
        assertEquals(0, writingDesk.getHeight());
    }
}