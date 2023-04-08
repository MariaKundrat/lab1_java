package ua.lviv.iot.algo.part1.lab3;

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

    public WritingDesk(String name,
                       int height,
                       int width,
                       int length,
                       int numberOfDrawers,
                       String hasKeyboardTray,
                       int maxWeightCapacity,
                       int maxHeight
    ) {
        super(name, height, width, length);
        this.numberOfDrawers = numberOfDrawers;
        this.hasKeyboardTray = hasKeyboardTray;
        this.maxWeightCapacity = maxWeightCapacity;
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