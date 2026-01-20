package se.lexicon.exercise8;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWritterApp {

    void main(){
        Path path = Paths.get("output.txt");
        String content = "Hello, World! uahfcbhvfhswvf hfbvhsvhywvav VGFKYUHV";

        try (BufferedWriter writer = Files.newBufferedWriter(path)){//open file for writing
            writer.write(content);// Write content to file
            System.out.println("Content written to file successfully: " + path.toAbsolutePath());

        }catch (IOException e){
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
