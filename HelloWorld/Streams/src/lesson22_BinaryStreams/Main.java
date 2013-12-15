package lesson22_BinaryStreams;

/**
 * lesson 7
 */

import java.io.*;
import java.nio.*;

public class Main {
    public static void main(String[] args) throws IOException {
        WorkWithInputOutputFileMethod(false, false);
        WorkWithInputOutputFileMethod(true, true);
        randomAccessFile();
    }

    private static void WorkWithInputOutputFileMethod(boolean isBuffered, boolean isAppend) throws IOException {
        CreateFileDirectoryMethod("test.txt");
        //Все потоки в java являются наследниками от InputStream and OutputStream

        OutputStream fileOutputStream = new FileOutputStream("test.txt", isAppend);

        fileOutputStream.write("HWsdfadfasdfadfsdadf".getBytes());
        InputStream fileInputStream;

        if (isBuffered) {
            fileInputStream = new BufferedInputStream(new FileInputStream("test.txt"));
        } else {
            fileInputStream = new FileInputStream("test.txt");
        }

        byte[] buffer = new byte[16];
        int readLen = 0;

        while ((readLen = fileInputStream.read(buffer)) != -1) {
            byte[] iterationBuffer = new byte[readLen];
            for (int i = readLen; i < 16; i++) {
                buffer[i] = 0;
            }
            System.out.println(new String(buffer));
        }
    }
    private static void CreateFileDirectoryMethod(String filename) throws IOException {
        File file = new File(filename);
        if (file.exists()) {
            System.out.println("Файл существует");
        } else {
            System.out.println("Файл не существует");
            file.createNewFile();
        }

        if (file.isDirectory()) {
            System.out.println("Это директория");
        }

        if (file.isFile()) {
            System.out.println("Это файл");
        }

        File directory = new File("tempdir");
        directory.mkdir();
    }
    private static void randomAccessFile() throws IOException {
        CreateFileDirectoryMethod("ra.txt");
        RandomAccessFile file = new RandomAccessFile("ra.txt", "rw");
        file.write("ABCDEF".getBytes());
        file.seek(0);
        byte firstChar = file.readByte();
        System.out.println("first char is - " + new String(new byte[]{firstChar}));
        System.out.println("current pos - " + file.getFilePointer());
        file.length();
    }
}
