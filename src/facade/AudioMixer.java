package facade;

public class AudioMixer {

    public String mix(String mediaData) {
        System.out.println("Applying final audio processing...");
        return mediaData + " -> Processed";
    }

}
