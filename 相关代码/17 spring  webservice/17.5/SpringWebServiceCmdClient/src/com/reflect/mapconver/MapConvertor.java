package com.reflect.mapconver;

import java.util.ArrayList;
import java.util.List;


/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��10��30�� ����2:59:44 
 * ��˵�� 
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