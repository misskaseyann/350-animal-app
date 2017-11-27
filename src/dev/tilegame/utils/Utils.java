package dev.tilegame.utils;

import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Utility methods for basic IO.
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

    public static Font createFont(String path) {
        InputStream stream = null;
        Font ttf = null;
        Font pkmfont = null;
        try {
            stream = new BufferedInputStream(new FileInputStream(path));
            ttf = Font.createFont(Font.TRUETYPE_FONT, stream);
            pkmfont = ttf.deriveFont(Font.PLAIN, 12);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pkmfont;
    }
}
