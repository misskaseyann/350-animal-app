package dev.tilegame.sound;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Music loader.
 * @author kaseystowell
 * @version 10.03.2017
 */
public class LoopLoader {
    /** stream for audio. */
    protected AudioStream stream;
    /** isplaying if its playing */
    protected boolean isPlaying;

    /**
     * LoopLoader constuctor.
     * Sets the value of isPlaying to false.
     */
    public LoopLoader() {
        isPlaying = false;
    }

    /**
     * Loads an audio stream from a string path.
     * @param path string path of .wav music.
     */
    public void load(final String path) {
        try {
            InputStream input = new FileInputStream(path);
            stream = new AudioStream(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (IOException error) {
            error.printStackTrace();
            System.exit(1);
        }
    }

    /**
     * Play music.
     */
    public void play() {
        AudioPlayer.player.start(stream);
        isPlaying = true;
    }

    /**
     * Stop music.
     */
    public void stop() {
        AudioPlayer.player.stop(stream);
        isPlaying = false;
    }

    /**
     * @return true if music is playing.
     */
    public boolean isPlaying() {
        return isPlaying;
    }

}
