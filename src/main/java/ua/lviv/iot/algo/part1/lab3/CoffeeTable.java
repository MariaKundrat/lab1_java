package ua.lviv.iot.algo.part1.lab3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class CoffeeTable extends Desk {
    private int numberOfShelves;
    private int numberOfSeats;

    public CoffeeTable(final String name,
                       final int height,
                       final int width,
                       final int length,
                       final int numberOfShelves,
                       final int numberOfSeats
    ) {
        super(name, height, width, length);
        this.numberOfShelves = numberOfShelves;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public final void adjustHeight(final int centimeters) {
        System.out.println("You cannot increase the height of CoffeeTable");
    }

    @Override
    public final void moveDown(final int centimeters) {
        System.out.println("You cannot increase the height of CoffeeTable");
    }
}
