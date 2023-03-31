package ua.lviv.iot.algo.part1.lab2;

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

    public KitchenTable(int height,
        int width,
        int length,
        String material,
        int maxHeight
    ) {
        super(height, width, length);
        this.material = material;
        this.maxHeight = maxHeight;
    }

    @Override
    public void adjustHeight(int centimeters) {
        if (this.height + centimeters <= maxHeight) {
            this.height += centimeters;
        }
    }

    @Override
    public void moveDown(int centimeters) {
        if (this.height - centimeters >= 0) {
            this.height -= centimeters;
        }
    }
}