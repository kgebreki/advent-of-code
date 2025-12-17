package org.adventofcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class RotationsReader {

    public static List<String> getRotationsFromFile(Path path) {
        List<String> rotations = new ArrayList<>();
        try (InputStream inputStream = Files.newInputStream(path)) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.isEmpty()) {
                    rotations.add(line);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return rotations;
    }
}
