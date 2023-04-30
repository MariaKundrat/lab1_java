package ua.lviv.iot.algo.part1.lab4.models;

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
    private static final int MAX_HEIGHT = 100;

    @Override
    public final String getHeaders() {
        return super.getHeaders() + "numberOfDrawers" + ", " + "hasKeyboardTray" + ", " + "maxWeightCapacity" + "\n";
    }

    @Override
    public final String toCSV() {
        return super.toCSV() + numberOfDrawers + ", " + hasKeyboardTray + ", " + maxWeightCapacity + "\n";
    }

    public WritingDesk(final String name,
                       final int height,
                       final int width,
                       final int length,
                       final int numberOfDrawers,
                       final String hasKeyboardTray,
                       final int maxWeightCapacity
    ) {
        super(name, height, width, length);
        this.numberOfDrawers = numberOfDrawers;
        this.hasKeyboardTray = hasKeyboardTray;
        this.maxWeightCapacity = maxWeightCapacity;
    }

    @Override
    public final void adjustHeight(final int centimeters) {
        if (getHeight() + centimeters <= MAX_HEIGHT) {
            setHeight(getHeight() + centimeters);
        } else {
            setHeight(MAX_HEIGHT);
        }
    }

    @Override
    public final void moveDown(final int centimeters) {
        if (getHeight() - centimeters >= 0) {
            setHeight(getHeight() - centimeters);
        } else {
            setHeight(0);
        }
    }
}
