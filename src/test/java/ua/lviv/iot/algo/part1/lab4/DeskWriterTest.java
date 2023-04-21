package ua.lviv.iot.algo.part1.lab4;

import org.junit.jupiter.api.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeskWriterTest {
    private static final String RESULT_FILENAME = "result.csv";
    private static final String EXPECTED_FILENAME = "expected.csv";
    private final List<Desk> deskList = new LinkedList<>();
    private DeskWriter writer = new DeskWriter();

    @BeforeEach
    public void setUp() throws IOException {
        writer = new DeskWriter();
        Files.deleteIfExists(Path.of(RESULT_FILENAME));
    }

    @Test
    public void testEmptyWrite() throws IOException {
        writer.writeToFile(deskList);
        File file = new File(RESULT_FILENAME);
        assertFalse(file.exists());
    }

    @Test
    public void testWriteListOfDesks() throws IOException {
        deskList.add(new CoffeeTable("CoffeeTable small 1", 80, 100, 125, 2, 4));
        deskList.add(new KitchenTable("KitchenTable small 1", 105, 85, 265, "Iron"));
        deskList.add(new CoffeeTable());
        deskList.add(new WritingDesk("WritingDesk small 1", 70, 105, 145, 4, "Yes", 200));
        deskList.add(new WritingDesk());
        deskList.add(new ComputerDesk("ComputerDesk small 1", 85, 100, 155, 6, "Yes"));
        deskList.add(new ComputerDesk());
        deskList.add(new KitchenTable());
        writer.writeToFile(deskList);
        Path expected = new File(RESULT_FILENAME).toPath();
        Path result = new File(EXPECTED_FILENAME).toPath();
        System.out.println(Files.mismatch(expected, result));
        assertEquals(-1L, Files.mismatch(expected, result));
    }

    @Test
    public void testFileOverride() throws IOException {
        try (FileWriter file = new FileWriter(RESULT_FILENAME)) {
            file.write("Hello!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        testWriteListOfDesks();
    }
}
