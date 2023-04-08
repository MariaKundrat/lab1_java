package ua.lviv.iot.algo.part1.lab3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class KitchenTable extends Desk {
    private String material = "Unknown";
    private int maxHeight = 160;

    public KitchenTable(String name,
                        int height,
                        int width,
                        int length,
                        String material,
                        int maxHeight
    ) {
        super(name, height, width, length);
        this.material = material;
        this.maxHeight = maxHeight;
    }

    @Override
    public void adjustHeight(int centimeters) {
        if (getHeight() + centimeters <= maxHeight) {
            setHeight(getHeight() + centimeters);
        }
        else {
            setHeight(maxHeight);
        }
    }

    @Override
    public void moveDown(int centimeters) {
        if (getHeight() - centimeters >= 0) {
            setHeight(getHeight() - centimeters);
        }
        else {
            setHeight(0);
        }
    }
}