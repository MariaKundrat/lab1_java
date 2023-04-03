package ua.lviv.iot.algo.part1.lab2;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DeskManager {
    private final List<Desk> deskList = new LinkedList<>();

    private void addDesk(Desk desks) {
        this.deskList.add(desks);
    }

    public List<Desk> findAllTablesHigherThan(int value) {
        return deskList.stream()
                .filter(desks -> desks.getHeight() > value)
                .collect(Collectors.toList());
    }

    public List<Desk> findAllWithLengthGreaterThan(int value) {
        return deskList.stream()
                .filter(desks -> desks.getLength() > value)
                .collect(Collectors.toList());
    }

    public static void main(String... args) {
        DeskManager deskManager = new DeskManager();
        deskManager.addDesk(new CoffeeTable("CoffeeTable small №1", 80, 100, 125, 2, 4));
        deskManager.addDesk(new CoffeeTable());
        deskManager.addDesk(new WritingDesk("WritingDesk small №1", 70, 105, 145, 4, "Yes", 200, 100));
        deskManager.addDesk(new WritingDesk());
        deskManager.addDesk(new ComputerDesk("ComputerDesk small №1", 85, 100, 155, 6, "Yes", 110));
        deskManager.addDesk(new ComputerDesk());
        deskManager.addDesk(new KitchenTable("KitchenTable small №1", 105, 85, 265, "Iron", 150));
        deskManager.addDesk(new KitchenTable());
        System.out.println("Desks: ");
        deskManager.deskList.forEach(System.out::println);
        System.out.println("\n");
        System.out.println("All desks with height greater than 75: ");
        deskManager.findAllTablesHigherThan(75).forEach(desks -> System.out.println(desks.getName() + " " + desks.getHeight()));
        System.out.println("\n");
        System.out.println("All desks with length greater than 150: ");
        deskManager.findAllWithLengthGreaterThan(150).forEach(desks -> System.out.println(desks.getName() + " " + desks.getLength()));
    }
}