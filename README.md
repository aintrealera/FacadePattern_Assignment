
# Facade Pattern — Media Conversion

## Overview
This project demonstrates the Facade structural design pattern using Java 17.

The application simulates media conversion from one format to another. The `MediaConversionFacade` provides a simple interface that coordinates several subsystem classes.

## Project Structure

- `MetadataReader` — reads the source file metadata and detects its format.
- `CodecFactory` — selects the codec for the source and target formats.
- `BitrateReader` — simulates reading and converting media data.
- `AudioMixer` — simulates final media processing.
- `MediaConversionFacade` — coordinates the subsystem classes through a single method.
- `VideoConverterClient` — interacts with the application through the facade.
- `Main` — runs the application.

## Technologies
- Java 17
- IntelliJ IDEA
- Git and GitHub

## How to Run
1. Open the project in IntelliJ IDEA.
2. Make sure Java 17 is configured.
3. Open `src/facade/Main.java`.
4. Run the `main()` method.

## Example
The application simulates converting `movie.avi` to `mp4`.

Expected output includes the detected format, selected codecs, simulated conversion steps, and output filename.

## Design Pattern
The Facade pattern simplifies access to a complex subsystem by providing a single, unified interface. The client uses `MediaConversionFacade` instead of coordinating the subsystem classes directly.

## Limitations
This project demonstrates the conversion workflow using simulated media data. It does not create or convert actual audio or video files.
EOF