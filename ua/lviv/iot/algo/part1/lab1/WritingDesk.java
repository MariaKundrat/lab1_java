package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WritingDesk {
    private int numberOfDrawers;
    private String hasKeyboardTray;
    private int maxWeightCapacity;
    private int currentHeight;
    private final int maxHeight = 150;

    private static WritingDesk instance;
    private static WritingDesk defaultWritingDesk = new WritingDesk();

    public static WritingDesk getInstance() {
        return defaultWritingDesk;
    }

    public void adjustHeight(int centimeters) {
        if (currentHeight + centimeters <= maxHeight) {
            currentHeight += centimeters;
        }
    }

    public void moveDown(int centimeters) {
        if (currentHeight - centimeters >= 0) {
            currentHeight -= centimeters;
        }
    }

    public static void main(String... args) {
        WritingDesk[] writingdesk = new WritingDesk[4];
        writingdesk[0] = new WritingDesk();
        writingdesk[1] = new WritingDesk(5, "yes", 150, 80);
        writingdesk[2] = WritingDesk.getInstance();
        writingdesk[3] = WritingDesk.getInstance();

        for (WritingDesk Writingdesk : writingdesk) {
            System.out.println(Writingdesk);
        }
    }
}