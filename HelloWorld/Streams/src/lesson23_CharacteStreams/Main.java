package lesson23_CharacteStreams;

import java.io.*;

/**
    lesson 8
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("test_tesson_23.txt");

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8"));
        writer.write("\n\tСтрока " + Math.random());
        writer.flush();
        writer.close();

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));

        String line;
        do {
            line = reader.readLine();
            if (line != null) {
                System.out.println(line);
            }
        } while (line != null);
        reader.close();
    }
}
