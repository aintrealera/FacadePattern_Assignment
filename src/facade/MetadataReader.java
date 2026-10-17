package facade;

public class MetadataReader {

    public String readMetadata(String fileName) {
        if (fileName == null || fileName.isBlank()) {
            throw new IllegalArgumentException("File name cannot be empty.");
        }

        String extension = fileName.substring(fileName.lastIndexOf('.') + 1)
                .toLowerCase();

        System.out.println("Reading metadata from: " + fileName);
        System.out.println("Detected format: " + extension);

        return extension;
    }
}
