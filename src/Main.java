import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<HashMap<String, String>> stringListHashMap = new ArrayList<>();

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("DATE", "31-May-17");
        hashMap.put("FI_ID", "31");
        hashMap.put("PRODUCT_TYPE_ID", "11110000");
        hashMap.put("AMOUNT_BDT", "0");
        hashMap.put("REPORTING_AREA", "1000");
        hashMap.put("31", "GOVERNMENT");
        hashMap.put("310158", "");
        stringListHashMap.add(hashMap);
        stringListHashMap.add(hashMap);
        stringListHashMap.add(hashMap);
        stringListHashMap.add(hashMap);
        stringListHashMap.add(hashMap);

//        //DATE:
//        for (int i = 0; i < 5; ++i)
//            value.add("31-May-17");
//        System.out.println("List SZ: " + value.size());
//        stringListHashMap.put("DATE", value);
//        value.clear();

//        //FI_ID:
//        for (int i = 0; i < 5; ++i)
//            value.add("31");
//        stringListHashMap.put("FI_ID", value);
//        value.clear();
//
//        //PRODUCT_TYPE_ID:
//        for (int i = 0; i < 5; ++i)
//            value.add("11110000");
//        stringListHashMap.put("PRODUCT_TYPE_ID", value);
//        value.clear();
//
//        //AMOUNT_BDT:
//        for (int i = 0; i < 5; ++i)
//            value.add("0");
//        stringListHashMap.put("AMOUNT_BDT", value);
//        value.clear();
//
//        //REPORTING_AREA:
//        for (int i = 0; i < 5; ++i)
//            value.add("1000");
//        stringListHashMap.put("REPORTING_AREA", value);
//        value.clear();
//
//        //31:
//        for (int i = 0; i < 5; ++i)
//            value.add("GOVERNMENT");
//        stringListHashMap.put("31", value);
//        value.clear();
//
//        //310158:
//        for (int i = 0; i < 5; ++i)
//            value.add("GOVERNMENT");
//        stringListHashMap.put("310158", value);
//        value.clear();

        new CsvConverter().writeToCsv(stringListHashMap);
    }
}
