package tr.edu.maltepe.oop;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Cat {
    private String name;
    private int age;

    // Constructor
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Meow method with sound
    public void meow() {
        System.out.println(name + " says: Meow!");
        playMeowSound();
    }

    private void playMeowSound() {
        try {
            File soundFile = new File("C:\\Users\\busea\\IdeaProjects\\my-cat-class-buseakgl\\module1\\src\\tr\\edu\\maltepe\\oop\\cat_meowing_1_ZAj_Dgz.wav"); // Ses dosyanın yolu
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println("Error playing the sound: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Creating objects

    }
}

