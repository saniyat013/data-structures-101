package hashmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HashMap03 {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> myMap = new LinkedHashMap();

        String fileName = System.getProperty("user.dir") + "/src/main/java/hashmap/poem.txt";
        Path filePath = Paths.get(fileName);
        try {
            BufferedReader br = Files.newBufferedReader(filePath);

            String line = "";

            while (line != null) {
                line = br.readLine();
                if (line != null && !line.equals("")) {
                    String temp[] = line.split(",\\s|\\.|,|;|\\s|!|—");
                    for (String temp1 : temp) {
                        if (myMap.containsKey(temp1)) {
                            myMap.replace(temp1, myMap.get(temp1) + 1);
                        } else {
                            myMap.put(temp1, 1);
                        }
                    }
                } else {
                }
            }
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(HashMap03.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "'" + " : " + "'" + entry.getValue() + "'");
        }
    }
}
