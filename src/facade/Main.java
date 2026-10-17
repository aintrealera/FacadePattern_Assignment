package facade;

public class Main {

    public static void main(String[] args) {
        VideoConverterClient client = new VideoConverterClient();

        client.convertVideo("movie.avi", "mp4");
    }
}
