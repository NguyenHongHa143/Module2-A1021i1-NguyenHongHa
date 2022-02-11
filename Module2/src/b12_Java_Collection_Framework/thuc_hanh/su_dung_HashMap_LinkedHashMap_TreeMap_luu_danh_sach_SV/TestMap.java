package b12_Java_Collection_Framework.thuc_hanh.su_dung_HashMap_LinkedHashMap_TreeMap_luu_danh_sach_SV;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> mapStudent = new HashMap<>();
        mapStudent.put("Smith", 30);
        mapStudent.put("Anderson", 31);
        mapStudent.put("Lewis", 29);
        mapStudent.put("Cook", 29);
        System.out.println(mapStudent);

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.putAll(mapStudent);
        System.out.println(treeMap);

        Map<String,Integer> linkedMap = new LinkedHashMap<>(16,0.75f,false);
        linkedMap.putAll(mapStudent);
        System.out.println(linkedMap);

    }
}
