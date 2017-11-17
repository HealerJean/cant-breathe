package com.reflect.mapconver;

import java.util.ArrayList;
import java.util.List;


/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年10月30日 下午2:59:44 
 * 类说明 
 */
public  class MapConvertor {

    private List<MapEntry> list = new ArrayList<MapEntry>();

    public void addMapEntry(String fieldName, Object fieldValue) {
        MapEntry MapEntry = new MapEntry();
        MapEntry.setKey(fieldName);
        MapEntry.setValue(fieldValue);
        list.add(MapEntry);
    }

    public List<MapEntry> getList() {
        return list;
    }

    public void setList(List<MapEntry> list) {
        this.list = list;
    }

    public static class MapEntry {

        private String key;
        private Object value;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }
    }
}