package ua.lviv.iot.algo.part1.lab4.writer;

import ua.lviv.iot.algo.part1.lab4.models.Desk;

import java.io.FileWriter;
import java.util.List;
import java.util.Comparator;

public class DeskWriter {
    public static final String DEFAULT_FILE_NAME = "result.csv";

    public final String writeToFile(final List<Desk> deskList) {
        if (deskList == null || deskList.isEmpty()) {
            return null;
        }
        try (FileWriter writer = new FileWriter(DEFAULT_FILE_NAME)) {
            deskList.sort(Comparator.comparing(desk -> desk.getClass().getSimpleName()));
            Desk deskOne = deskList.get(0);
            writer.write(deskList.get(0).getHeaders());
            for (var desk : deskList) {
                if (!deskOne.getClass().equals(desk.getClass())) {
                    deskOne = desk;
                    writer.write(desk.getHeaders());
                }
                writer.write(desk.toCSV());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return DEFAULT_FILE_NAME;
    }
}
