package study;

import org.apache.commons.collections.map.HashedMap;

import java.util.Map;

/**
 * Created by caibaolong on 2019/8/2.
 */
public class ListStudy {
    public static void main(String[] args) {
        Map<String, Object> map = new HashedMap();
        map.put("1", 123);
        System.out.println(map);
        int o = 0;
        if (map.get("1") instanceof Integer) {
            o = (int)map.get("1");
        }
        System.out.println(o);
    }
}
