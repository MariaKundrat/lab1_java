package ua.lviv.iot.algo.part1.lab4.models;

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
    private static final int MAX_HEIGHT = 160;

    @Override
    public final String getHeaders() {
        return super.getHeaders() + "material" + "\n";
    }

    @Override
    public final String toCSV() {
        return super.toCSV() + material + "\n";
    }

    public KitchenTable(final String name,
                        final int height,
                        final int width,
                        final int length,
                        final String material
    ) {
        super(name, height, width, length);
        this.material = material;
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
