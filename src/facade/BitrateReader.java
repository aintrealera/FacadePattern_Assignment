package facade;

public class BitrateReader {

    public String read(String fileName, String codec) {
        System.out.println("Reading media data using codec: " + codec);
        return "MediaData(" + fileName + ")";
    }

    public String convert(String mediaData, String targetCodec) {
        System.out.println("Converting media data to codec: " + targetCodec);
        return mediaData + " -> Converted(" + targetCodec + ")";
    }

}
