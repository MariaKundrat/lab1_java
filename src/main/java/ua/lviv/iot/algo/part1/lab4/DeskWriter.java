package ua.lviv.iot.algo.part1.lab4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class DeskWriter {
    public static String defaultFileName = "result.csv";

    public String writeToFile(List<Desk> deskList) throws IOException {
        if (deskList == null || deskList.isEmpty()) {
            return null;
        } else {
            try (FileWriter writer = new FileWriter(defaultFileName)) {
                Collections.sort(deskList, Comparator.comparing((desk -> desk.getClass().getSimpleName())));
                Desk deskOne = deskList.get(0);
                writer.write(deskList.get(0).getHeaders());
                for (var desk : deskList) {
                    if (!deskOne.getClass().equals(desk.getClass())) {
                        deskOne = desk;
                        writer.write(desk.getHeaders());
                    }
                    writer.write(desk.toCSV() + "\n");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return defaultFileName;
        }
    }
}
