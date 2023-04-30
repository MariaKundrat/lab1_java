package ua.lviv.iot.algo.part1.lab4.models;

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
    private String name = "Unknown";
    private int height;
    private int width;
    private int length;

    public String getHeaders() {
        return "name" + ", " + "height" + ", " + "width" + ", " + "length" + ", ";
    }

    public String toCSV() {
        return name + ", " + height + ", " + width + ", " + length + ", ";
    }

    public abstract void adjustHeight(int centimeters);

    public abstract void moveDown(int centimeters);
}
