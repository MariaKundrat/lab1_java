package ua.lviv.iot.algo.part1.lab3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeskManagerTest {

    private DeskManager deskManager;

    @BeforeEach
    public void setUp() {
        deskManager = new DeskManager();
        deskManager.addDesk(new CoffeeTable("CoffeeTable small №1", 80, 100, 125, 2, 4));
        deskManager.addDesk(new CoffeeTable());
        deskManager.addDesk(new WritingDesk("WritingDesk small №1", 70, 105, 145, 4, "Yes", 200));
        deskManager.addDesk(new WritingDesk());
        deskManager.addDesk(new ComputerDesk("ComputerDesk small №1", 85, 100, 155, 6, "Yes"));
        deskManager.addDesk(new ComputerDesk());
        deskManager.addDesk(new KitchenTable("KitchenTable small №1", 105, 85, 265, "Iron"));
        deskManager.addDesk(new KitchenTable());
    }

    @Test
    public void testFindAllTablesHigherThan() {
        List<Desk> desks = deskManager.findAllTablesHigherThan(80);
        assertEquals(2, desks.size());
        for (var desk : desks) {
            Assertions.assertTrue(desk.getHeight() > 80);
        }
    }

    @Test
    public void testFindAllWithLengthGreaterThan() {
        List<Desk> desks = deskManager.findAllWithLengthGreaterThan(150);
        assertEquals(2, desks.size());
        for (var desk : desks) {
            Assertions.assertTrue(desk.getLength() > 150);
        }
    }

    @Test
    public void testAddDesk() {
        List<Desk> desks = new LinkedList<>();
        Desk coffeeTable = new CoffeeTable("CoffeeTable small №1", 80, 100, 125, 2, 4);
        desks.add(coffeeTable);
        assertEquals(1, desks.size());
        Assertions.assertTrue(desks.contains(coffeeTable));
    }
}