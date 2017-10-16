package dev.tilegame.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.Reader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * Utility loader for worlds.
 * @author kaseystowell
 * @version 09.24.2017
 */
public class Utils {

    /**
     * Loads .txt file and turns into one large string.
     * @param path file path to .txt file.
     * @return combined string of .txt file.
     */
    public static String loadFileAsString(String path) {
        StringBuilder builder = new StringBuilder();
        try {
            InputStream in = new FileInputStream(path);
            Reader reader = new InputStreamReader(in, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null)
                builder.append(line + "\n");
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }

    /**
     * Changes a value from string to integer.
     * @param number string of a number.
     * @return integer value of the number.
     */
    public static int parseInt(String number) {
        try {
            return Integer.parseInt(number);
        } catch(NumberFormatException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
