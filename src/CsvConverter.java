import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CsvConverter {

    BufferedWriter writer = new BufferedWriter(new FileWriter("output.csv"));

    public CsvConverter() throws IOException {
    }

    void writeToCsv(List<HashMap<String, String>> stringListHashMap) throws IOException {

        for (int i = 0, sz = stringListHashMap.size(); i < sz; ++i) {
            boolean flag = false;
            HashMap<String, String> hashMap = stringListHashMap.get(i);

            for(String key: hashMap.keySet()){
                if (flag)
                    writer.write(",");
                flag = true;
                writer.write(hashMap.get(key));
            }
            writer.write("\n");
        }
        writer.close();
    }
}
