import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    static final String TABLE_NAME = "DosData";

    public static void main(String[] args) throws IOException {

        List<String> columnNames[] = new ArrayList[2];
        columnNames[0] = new ArrayList<>();
        columnNames[1] = new ArrayList<>();

        columnNames[0].add("BILLING");
        columnNames[0].add("ORDER");
        columnNames[0].add("PRODUCT");
        columnNames[0].add("TOTAL");
        columnNames[0].add("");
        columnNames[0].add("31");
        columnNames[0].add("310158");

        columnNames[1].add("DATE");
        columnNames[1].add("FI_ID");
        columnNames[1].add("PRODUCT_TYPE_ID");
        columnNames[1].add("AMOUNT_BDT");
        columnNames[1].add("REPORTING_AREA");
        columnNames[1].add("31");
        columnNames[1].add("310158");

        /*Table<        Rows<Columns<              >>> data-structure
            ^^           ^^                             ^^                   */
        HashMap<String, List<HashMap<String, String>>> table = new HashMap<>();

        //Creating Column information:
        HashMap<String, String> columnsInfo = new HashMap<>();
        columnsInfo.put("DATE", "30-May-17");
        columnsInfo.put("FI_ID", "31");
        columnsInfo.put("PRODUCT_TYPE_ID", "11110000");
        columnsInfo.put("AMOUNT_BDT", "0");
        columnsInfo.put("REPORTING_AREA", "1000");
        columnsInfo.put("31", "GOVERNMENT");
        columnsInfo.put("310158", "");

        //Creating Row information:
        List<HashMap<String, String>> rowInfo = new ArrayList<>();

        rowInfo.add(columnsInfo);
        rowInfo.add(columnsInfo);
        rowInfo.add(columnsInfo);
        rowInfo.add(columnsInfo);
        rowInfo.add(columnsInfo);

        table.put(TABLE_NAME, rowInfo);

        new CsvConverter().writeToCsv(columnNames, table);
    }
}
