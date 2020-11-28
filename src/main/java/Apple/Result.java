package Apple;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


/**
 * Problem link: https://codewithluv.in/apple-online-coding-round-2020-questions
 */
public class Result {

    public static int minTime(List<Integer> processorTime, List<Integer> taskTime) {

        List<Integer> processorTimeMutable = new ArrayList<>(processorTime);
        List<Integer> taskTimeMutable = new ArrayList<>(taskTime);
        Collections.sort(processorTimeMutable);
        Collections.sort(taskTimeMutable, Collections.reverseOrder());

        int ans = 0;
        int curTask = 0;
        for (int proctime : processorTimeMutable) {
            for (int i = 0; i < 4; ++i) {
                int completionTime = taskTimeMutable.get(curTask) + proctime;
                curTask++;
                ans = Math.max(ans, completionTime);
            }
        }
        return ans;

    }

}
