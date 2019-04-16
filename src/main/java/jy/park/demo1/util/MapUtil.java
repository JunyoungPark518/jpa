package jy.park.demo1.util;

import java.lang.reflect.Field;
import java.util.*;

public class MapUtil {

    public static Map convertToMapForDto(Class dtoName, String param) {
        return new HashMap(){{
            int[] index = {0};
            Arrays.asList(param.split(",")).forEach(str -> {
                put(dtoName.getDeclaredFields()[index[0]++].getName(), str);
            });
        }};
    }



    public static List convertToList(String param) {
        return new ArrayList(){{
            add(param.split(","));
        }};
    }

    public static List convertToList(String param, String regex) {
        return new ArrayList(){{
            add(param.split(regex));
        }};
    }
}
