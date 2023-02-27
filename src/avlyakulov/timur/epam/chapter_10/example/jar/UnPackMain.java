package avlyakulov.timur.epam.chapter_10.example.jar;

public class UnPackMain {
    public static void main(String[] args) {
        // Location and archive name
        String nameJar = "example.jar";
        // directory to which the files will be unpacked
        String destinationPath = "d:\\tmp\\";
        new UnPackJar().unpack(destinationPath,nameJar);
    }
}
