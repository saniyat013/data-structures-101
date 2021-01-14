package hashmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HashMap0102 {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> myMap = new LinkedHashMap();
//        Scanner scan = new Scanner(new File(System.getProperty("user.dir") + "/src/main/java/hashmap/nyc_weather.csv"));
//        scan.useDelimiter(",");
//        while(scan.hasNext()) {
//            System.out.print(scan.next() + ", ");
//        }
//        scan.close();

        String fileName = System.getProperty("user.dir") + "/src/main/java/hashmap/nyc_weather.csv";
        Path pathToFile = Paths.get(fileName);
        try {
            BufferedReader br = Files.newBufferedReader(pathToFile);

            String line = br.readLine();

            while (line != null) {
                line = br.readLine();
                if (line != null) {
                    String[] temp = line.split(",");
                    myMap.put(temp[0], Integer.parseInt(temp[1]));
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(HashMap0102.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(myMap);

        ArrayList<String> keys = new ArrayList(myMap.keySet());

//        What was the average temperature in first week of Jan
        int tempSum = 0;
        for (int i = 0; i < 7; i++) {
            tempSum += myMap.get(keys.get(i));
        }
        System.out.println("Avg temp in the first week: " + (tempSum / 7) + " degree");

//        What was the maximum temperature in first 10 days of Jan
        int maxTemp = 0;
        for (int i = 0; i < 10; i++) {
            if (maxTemp < myMap.get(keys.get(i))) {
                maxTemp = myMap.get(keys.get(i));
            }
        }
        System.out.println("Maximum temp in the first 10 days: " + maxTemp + " degree");

//        What was the temperature on Jan 9?
        System.out.println("Temp of January 9 was: " + myMap.get("Jan 9") + " degree");
//        What was the temperature on Jan 4?
        System.out.println("Temp of January 4 was: " + myMap.get("Jan 4") + " degree");
    }
}
