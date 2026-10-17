package facade;

public class CodecFactory {

    public String getCodec(String format) {
        switch (format.toLowerCase()) {
            case "mp4":
                return "H.264";
            case "mp3":
                return "MP3";
            case "wav":
                return "PCM";
            case "avi":
                return "Xvid";
            default:
                throw new IllegalArgumentException(
                        "Unsupported format: " + format
                );
        }
    }

}
