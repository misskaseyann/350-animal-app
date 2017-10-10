package dev.tilegame.sound;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author kaseystowell
 * @version 10.03.2017
 */
public class LoopLoader {
    private AudioPlayer audioPlayer;
    //ContinuousAudioDataStream loop = null;
    AudioStream stream;
    boolean isPlaying;

    public LoopLoader() {
        isPlaying = false;
    }

    public void load(String path) {
        audioPlayer = AudioPlayer.player;
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

    public void play() {
        AudioPlayer.player.start(stream);
        isPlaying = true;
    }

    public void stop() {
        AudioPlayer.player.stop(stream);
        isPlaying = false;
    }

    public void setPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

}