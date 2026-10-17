package facade;

public class VideoConverterClient {

    private final MediaConversionFacade facade;

    public VideoConverterClient() {
        this.facade = new MediaConversionFacade();
    }

    public void convertVideo(String fileName, String targetFormat) {
        System.out.println("Starting media conversion...");
        String result = facade.convert(fileName, targetFormat);
        System.out.println("Client received result: " + result);
    }
}
