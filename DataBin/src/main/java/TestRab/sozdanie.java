package TestRab;

import java.io.*;

public class sozdanie {
    public static void fileCreate(String[] text, String str){
        try {
            FileWriter writer = new FileWriter(str, true);
            for(int i = 0; i < text.length; i++) {
                writer.append(text[i]);
                writer.append(" ");
            }
            writer.write("\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
