package dev.tilegame.sound;

import sun.applet.Main;
import sun.audio.AudioStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;

/**
 * @author kaseystowell
 * @version 10.13.2017
 */
public class ClipLoader {

    Clip clip;

    public ClipLoader() {

    }

    public void load(String path) {
        try {
            URL url = this.getClass().getClassLoader().getResource(path);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(url);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void play() {
        clip.start();
    }
}
