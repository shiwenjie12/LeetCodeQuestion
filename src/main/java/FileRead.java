import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileRead {
    public static void main(String[] args) {
        Path path = Paths.get("data/subdir/logging-moved.properties");

        try {
            Files.delete(path);
        } catch (IOException e) {
            // 删除文件失败
            e.printStackTrace();
        }
    }
}
