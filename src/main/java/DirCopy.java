// 3. Написать программу для копирования всех файлов из одного каталога в другой

import java.io.File;
import org.apache.commons.io.FileUtils;
import java.io.IOException;

public class DirCopy {
    public static void main(String[] args) throws IOException {
        File src = new File("G:/Dir1");
        File dest = new File("G:/Dir2");
        FileUtils.copyDirectory(src, dest);
    }
}
