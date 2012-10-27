import java.nio.file.*;


class DirectoryStream1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Need directory argument.");
            System.exit(1);
        }

        Path dirpath = FileSystems.getDefault().getPath(args[0]);

        try (DirectoryStream<Path> dirstream
                = Files.newDirectoryStream(dirpath)) {
            for (Path file: dirstream) {
                System.out.println(file.getFileName());
            }
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}

