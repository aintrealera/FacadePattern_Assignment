package facade;

public class MediaConversionFacade {

    private final MetadataReader metadataReader;
    private final CodecFactory codecFactory;
    private final BitrateReader bitrateReader;
    private final AudioMixer audioMixer;

    public MediaConversionFacade() {
        this.metadataReader = new MetadataReader();
        this.codecFactory = new CodecFactory();
        this.bitrateReader = new BitrateReader();
        this.audioMixer = new AudioMixer();
    }

    public String convert(String fileName, String targetFormat) {
        if (fileName == null || fileName.isBlank()) {
            throw new IllegalArgumentException("File name cannot be empty.");
        }

        if (targetFormat == null || targetFormat.isBlank()) {
            throw new IllegalArgumentException("Target format cannot be empty.");
        }

        String sourceFormat = metadataReader.readMetadata(fileName);
        String normalizedTarget = targetFormat.toLowerCase();

        if (sourceFormat.equals(normalizedTarget)) {
            throw new IllegalArgumentException(
                    "Source and target formats are identical."
            );
        }

        String sourceCodec = codecFactory.getCodec(sourceFormat);
        String targetCodec = codecFactory.getCodec(normalizedTarget);

        String mediaData = bitrateReader.read(fileName, sourceCodec);
        String convertedData = bitrateReader.convert(mediaData, targetCodec);
        String processedData = audioMixer.mix(convertedData);

        String outputFile = fileName.substring(
                0, fileName.lastIndexOf('.')
        ) + "_converted." + normalizedTarget;

        System.out.println("Conversion completed successfully!");
        System.out.println("Output file: " + outputFile);

        return outputFile;
    }

}
