package ua.lviv.iot.algo.part1.lab2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class WritingDesk extends Desk {
    private int numberOfDrawers;
    private String hasKeyboardTray = "Unknown";
    private int maxWeightCapacity;
    private int maxHeight = 100;

    public WritingDesk(int height,
    int width,
    int length,
    int numberOfDrawers,
    String hasKeyboardTray,
    int maxWeightCapacity,
    int maxHeight
    ) {
        super(height, width, length);
        this.numberOfDrawers = numberOfDrawers;
        this.hasKeyboardTray = hasKeyboardTray;
        this.maxWeightCapacity = maxWeightCapacity;
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
