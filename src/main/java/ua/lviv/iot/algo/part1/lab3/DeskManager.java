package ua.lviv.iot.algo.part1.lab3;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DeskManager {
    private final List<Desk> deskList = new LinkedList<>();

    public final void addDesk(final Desk desks) {
        this.deskList.add(desks);
    }

    public final List<Desk> findAllTablesHigherThan(final int value) {
        return deskList.stream()
                .filter(desks -> desks.getHeight() > value)
                .collect(Collectors.toList());
    }

    public final List<Desk> findAllWithLengthGreaterThan(final int value) {
        return deskList.stream()
                .filter(desks -> desks.getLength() > value)
                .collect(Collectors.toList());
    }
}
