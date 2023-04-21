package ua.lviv.iot.algo.part1.lab3;

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
    private static final int MAX_HEIGHT = 130;

    public ComputerDesk(final String name,
                        final int height,
                        final int width,
                        final int length,
                        final int numberOfDrawers,
                        final String hasKeyboardTray
    ) {
        super(name, height, width, length);
        this.numberOfDrawers = numberOfDrawers;
        this.hasKeyboardTray = hasKeyboardTray;
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