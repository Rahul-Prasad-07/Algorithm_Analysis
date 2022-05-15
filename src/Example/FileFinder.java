package Example;

import java.io.File;

public class FileFinder {
    public void findFile(String fileName, String inputPath) {
        File directory = new File(inputPath);
        if (directory.isDirectory()) {
            File[] list = directory.listFiles();
            for (File file : list) {
                findFile(fileName, file.getAbsolutePath());
            }
        }   else if (fileName.equals(directory.getName())) {
            System.out.println(inputPath + "/" + fileName + "found");
        }
    }

    public static void main(String args[]) {
        String projectPath = System.getProperty("user.dir");
        FileFinder fileFinder = new FileFinder();
        fileFinder.findFile("Algorithms.iml", projectPath);
    }

}

/*
You can use recursion to search for a file in its directory.
First, pass the file that you are looking for and the file directory path(folder path) where you want to start the search to the recursive function.
Then, follow these steps inside the recursive function:
1. List all the contents of the file directory that are passed to the function.
2. Loop through the content inside the file directory.
a. If any part of the content is another file directory(folder), recursively call the function and pass the file directory(folder) and its path through.
b. If the content is a file, check whether it matches the file you are searching for. If it does, then return 'file is found' with the file path.
 */
