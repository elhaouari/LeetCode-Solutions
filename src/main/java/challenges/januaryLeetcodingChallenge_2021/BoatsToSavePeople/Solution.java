package challenges.januaryLeetcodingChallenge_2021.BoatsToSavePeople;

import java.util.Arrays;

/**
 * https://leetcode.com/explore/challenge/card/january-leetcoding-challenge-2021/580/week-2-january-8th-january-14th/3602/
 */
public class Solution {

    public int numRescueBoats(int[] people, int limit) {

        int boats = 0;

        Arrays.sort(people);
        if (people[people.length-1]+people[people.length-2] <= limit)
            return (1+people.length)/2;
        int lightest = 0;
        int heaviest = people.length-1;

        while (heaviest >= lightest) {
            boats++;
            if (people[heaviest--]+people[lightest] <= limit)
                lightest++;
        }

        return boats;
    }
}
