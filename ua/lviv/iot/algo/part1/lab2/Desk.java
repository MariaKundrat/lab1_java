package ua.lviv.iot.algo.part1.lab2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public abstract class Desk {
    protected int height;
    protected int width;
    protected int length;

    public abstract void adjustHeight(int centimeters);

    public abstract void moveDown(int centimeters);
}