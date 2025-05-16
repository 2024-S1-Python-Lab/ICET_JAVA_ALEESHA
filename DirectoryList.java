import java.io.File;

public class DirectoryList {
    public static void main(String[] args) {
        String dirPath = "C:\\Program Files";
        listDirectoryContents(dirPath);
    }

    public static void listDirectoryContents(String dirPath) {
        File directory = new File(dirPath);

        if (directory.exists() && directory.isDirectory()) {
            System.out.println("Listing subdirectories and files in: " + dirPath);
            File[] directoryContents = directory.listFiles();

            if (directoryContents != null) {
                for (File item : directoryContents) {
                    if (item.isDirectory()) {
                        System.out.println("Directory: " + item.getName());
                    } else {
                        System.out.println("File: " + item.getName());
                    }
                }
            }
        } else {
            System.out.println("Directory does not exist or is not a directory.");
        }
    }
}
