package org.adventofcode;

import java.util.List;

public class Solver {
    // Assuming rotations are properly formed
    public static int solve(List<String> rotations) {
        int landOnZero = 0;
        int lastPos = 50;

        for (String rotation : rotations) {
            int currentPos = lastPos;
            char direction = rotation.charAt(0);
            int value = Integer.parseInt(rotation.substring(1)) % 100;
            //System.out.printf("%d %s%d %d\n", currentPos, direction, value, landOnZero);

            if (direction == 'L') {
                currentPos -= value;
            } else if (direction == 'R') {
                currentPos += value;
            } else {
                throw new IllegalArgumentException("Invalid direction: " + direction);
            }

            currentPos = recalibrate(currentPos);
            if (currentPos == 0 ) {
                landOnZero++;
            }
            lastPos = currentPos;
        }
        //System.out.printf("Last pos: %s; Password: %d\n", lastPos, landOnZero);
        return landOnZero;
    }

    private static int recalibrate(int pos) {
        if (pos < 0) {
            return 100 + pos;
        } else if (pos > 100) {
            return pos - 100;
        }
        return pos % 100;
    }
}
