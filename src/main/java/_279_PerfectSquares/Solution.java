package _279_PerfectSquares;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.stream.IntStream;

public class Solution {

    public int numSquares(final int n) {
        Set<Integer> perfectSquares = new HashSet<>();
        Queue<int[]> queue = new LinkedList<>();

        IntStream.rangeClosed(1, (int) Math.sqrt(n))
                .forEach(x -> {
                    queue.offer(new int[]{x * x, 1});
                    perfectSquares.add(x * x);
                });

        boolean[] visited = new boolean[n + 1];
        while (!queue.isEmpty()) {
            int[] pair = queue.poll();
            if (pair[0] == n) {
                return pair[1];
            }
            perfectSquares
                    .stream()
                    .map(s -> pair[0] + s)
                    .filter(x -> x <= n)
                    .filter(x -> !visited[x])
                    .forEach(x -> {
                        queue.offer(new int[]{x, pair[1] + 1});
                        visited[x] = true;
                    });
        }
        return -1;
    }
}
