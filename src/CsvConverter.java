import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CsvConverter {

    final String TABLE_NAME = "DosData";

    BufferedWriter writer = new BufferedWriter(new FileWriter("output.csv"));

    public CsvConverter() throws IOException {
    }

    void writeToCsv(List<String> columnNames[], HashMap<String, List<HashMap<String, String>>> tableData) throws IOException {

        //Generate Column names:
        int totalRows = columnNames.length;
        for (int r = 0; r < totalRows; ++r) {
            boolean flag = false;

            int totalColumns = columnNames[r].size();
            for (int c = 0; c < totalColumns; ++c) {
                if (flag)
                    writer.write(",");
                writer.write(columnNames[r].get(c));
                flag = true;
            }
            writer.write("\n");
        }

        //Getting Table:
        if (tableData.containsKey(TABLE_NAME)) {
            //Getting rows:
            List<HashMap<String, String>> rowsInfo = tableData.get(TABLE_NAME);

            for (int i = 0, sz = rowsInfo.size(); i < sz; ++i) {
                boolean flag = false;

                //Getting Columns:
                HashMap<String, String> columnsInfo = rowsInfo.get(i);

                //Generating Columns values:
                for (int j =0, colSz = columnNames[1].size(); j < colSz; ++j){
                    if (flag)
                        writer.write(",");
                    flag = true;
                    writer.write(columnsInfo.get(columnNames[1].get(j)));
                }
                writer.write("\n");
            }
        }

        writer.close();
    }
}
