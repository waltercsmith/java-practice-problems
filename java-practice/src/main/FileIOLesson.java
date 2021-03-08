package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileIOLesson {


    public static void main(String[] args) throws IOException {
//        Path filepath = Paths.get("languages.txt");
//        Files.createFile(filepath);

//        Files.write(filepath, List<String> lines["Javascript"]);
        List<String> languages = Arrays.asList("Javascript", "Java");
        Path Languages = Paths.get("languages.txt");
        Files.write(Languages,languages);

    }
}
