package org.adventofcode;

import java.nio.file.Path;
import java.util.List;

// https://adventofcode.com/2025/day/1
public class Main {
    public static void main(String[] args) {
        Path path = Path.of("./problem-1/src/main/resources/puzzle.txt"); // answer = 1084
        List<String> rotations = RotationsReader.getRotationsFromFile(path);
        System.out.println("Password: " + Solver.solve(rotations));
    }
}