class MusicPlayer {
    // Base method
    void play() {
        System.out.println("Playing generic audio...");
    }

    // Overloaded methods (same name, different parameters)
    void play(String songName) {
        System.out.println("Playing song: " + songName);
    }

    void play(String songName, String artist) {
        System.out.println("Playing song: " + songName + " by " + artist);
    }
}
class SpotifyPlayer extends MusicPlayer {
    @Override
    void play() {
        System.out.println("Streaming from Spotify...");
    }
}

class AppleMusicPlayer extends MusicPlayer {
    @Override
    void play() {
        System.out.println("Streaming from Apple Music...");
    }
}

class LocalPlayer extends MusicPlayer {
    @Override
    void play() {
        System.out.println("Playing from local storage...");
    }
}
public class MusicApp {
    public static void main(String[] args) {
        // Polymorphism with overriding
        MusicPlayer p1 = new SpotifyPlayer();
        MusicPlayer p2 = new AppleMusicPlayer();
        MusicPlayer p3 = new LocalPlayer();

        p1.play(); // Streaming from Spotify...
        p2.play(); // Streaming from Apple Music...
        p3.play(); // Playing from local storage...

        // Method overloading
        MusicPlayer genericPlayer = new MusicPlayer();
        genericPlayer.play("Shape of You"); 
        genericPlayer.play("Blinding Lights", "The Weeknd");
    }
}