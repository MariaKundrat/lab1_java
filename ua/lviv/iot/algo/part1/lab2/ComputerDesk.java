package ua.lviv.iot.algo.part1.lab2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString(callSuper = true)
public class ComputerDesk extends Desk {
    private int numberOfDrawers;
    private String hasKeyboardTray = "Unknown";
    private int maxHeight = 130;

    public ComputerDesk(int height,
        int width,
        int length,
        int numberOfDrawers,
        String hasKeyboardTray,
        int maxHeight
    ) {
        super(height, width, length);
        this.numberOfDrawers = numberOfDrawers;
        this.hasKeyboardTray = hasKeyboardTray;
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
