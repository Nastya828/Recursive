package s01;
//8. поиск всех файлов в заданном каталоге, включая файлы, расположенные в подкаталогах произвольной вложенности.

import java.io.File;

public class Task8 {

    public static void main(String[] args) {
        File file = new File(".");
        searchFiles(file);
    }

    static void searchFiles(File file) {
        if (file.isFile()) {
            return;
        }
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                searchFiles(f);
            } else {
                System.out.println(f.getName());
            }
        }
    }
}
