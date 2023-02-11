package ovh.aquarius.everdellforest.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileService {
    private static FileService instance;

    public static FileService getInstance(){
        if(instance == null){
            instance = new FileService();
        }
        return instance;
    }
    public void saveToFile(String element, String directoryName, String fileName){
        Path directory = getDirectoryPath(directoryName);
        Path fullPath = directory.resolve(fileName);
        try (FileWriter writer = new FileWriter(fullPath.toFile())) {
            writer.write(element);
            System.out.println("JSON data is saved to " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing JSON to file: " + e.getMessage());
        }
    }

    public List<File> getAllFilesFromADirectory(String directory)
    {
        File folder = new File(directory);
        File[] listOfFiles = folder.listFiles();
        return Arrays.stream(listOfFiles).filter(f -> f.isFile()).toList();
    }

    private Path getDirectoryPath(String directoryPath){
        Path path = Paths.get(directoryPath);
        if (!Files.exists(path)) {
            try {
                Files.createDirectory(path);
                return path;
            } catch (Exception e) {
                System.out.println("Directory not created");
                return null;
            }
        } else {
            return path;
        }
    }
}
