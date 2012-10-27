import java.nio.file.*;

public class Path1 {
    public static void main(String[] args) {
        Path tmp = Paths.get("/tmp");
        System.out.println(tmp.getFileName());

        Path var = Paths.get("/var");
        System.out.println(var.getFileName());

        Path var_tmp = var.resolve(tmp.getFileName());
        System.out.println(var_tmp.toString());

        System.out.println(var_tmp.startsWith(var));
        System.out.println(var_tmp.endsWith(tmp.getFileName()));
        System.out.println(var_tmp.equals(Paths.get("/var/tmp")));
        System.out.println(var_tmp.toUri());
    }
}
