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

    public ComputerDesk(String name,
                        int height,
                        int width,
                        int length,
                        int numberOfDrawers,
                        String hasKeyboardTray,
                        int maxHeight
    ) {
        super(name, height, width, length);
        this.numberOfDrawers = numberOfDrawers;
        this.hasKeyboardTray = hasKeyboardTray;
        this.maxHeight = maxHeight;
    }

    @Override
    public void adjustHeight(int centimeters) {
        if (getHeight() + centimeters <= maxHeight) {
            setHeight(getHeight() + centimeters);
        }
    }

    @Override
    public void moveDown(int centimeters) {
        if (getHeight() - centimeters >= 0) {
            setHeight(getHeight() - centimeters);
        }
    }
}
