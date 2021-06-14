/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String word = "";
        int wordCount = 0;

        while (!StdIn.isEmpty()) {
            String newWord = StdIn.readString();
            wordCount++;

            if (wordCount == 0) {
                word = newWord;
            }
            else {
                if (StdRandom.bernoulli(1.0 / wordCount)) {
                    word = newWord;
                }
            }
        }
        StdOut.println(word);
    }
}
