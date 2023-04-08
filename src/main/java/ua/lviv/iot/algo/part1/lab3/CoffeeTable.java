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

    public CoffeeTable(String name,
                       int height,
                       int width,
                       int length,
                       int numberOfShelves,
                       int numberOfSeats
    ) {
        super(name, height, width, length);
        this.numberOfShelves = numberOfShelves;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void adjustHeight(int centimeters) {
        System.out.println("You cannot increase the height of CoffeeTable");
    }

    @Override
    public void moveDown(int centimeters) {
        System.out.println("You cannot increase the height of CoffeeTable");
    }
}