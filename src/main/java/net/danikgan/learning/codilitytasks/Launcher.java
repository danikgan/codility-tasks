package net.danikgan.learning.codilitytasks;

import lombok.extern.slf4j.Slf4j;
import net.danikgan.learning.codilitytasks.lesson1.BinaryGap;
import net.danikgan.learning.codilitytasks.lesson6.Distinct;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@Slf4j
public class Launcher {
    public Launcher() {
        lesson1();
        lesson6();
    }

    private void lesson1() {
        log.info("");
        log.info("Lesson 1 (all done):");

        int[] testValues = new int[]{9,529,20,15,32,1041};
        int[] answerValues = new int[testValues.length];
        for (int i = 0; i < testValues.length; i++) {
            BinaryGap binaryGap = new BinaryGap(testValues[i]);
            answerValues[i] = binaryGap.getLength();
        }

        log.info(Arrays.toString(testValues));
        log.info(Arrays.toString(answerValues));
    }

    private void lesson6() {
        log.info("");
        log.info("Lesson 6:");

        int[] testValues = new int[]{2,1,1,2,3,1};
        Distinct distinct = new Distinct(testValues);
        int answer = distinct.getDistinctValues();

        log.info(String.valueOf(answer));
    }
}
