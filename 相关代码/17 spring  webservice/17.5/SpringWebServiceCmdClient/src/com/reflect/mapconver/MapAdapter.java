package com.reflect.mapconver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;


/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��10��30�� ����2:02:38 
 * ��˵�� 
 */
public class MapAdapter extends XmlAdapter<MapConvertor, Map<String, Object>> {

	/**
	 * unmarshal�������л����� Data ����תΪ Map ����
	 */
    @Override
    public Map<String, Object> unmarshal(MapConvertor data) throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        for (MapConvertor.MapEntry entry : data.getList()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }
    
    /**
     * marshal�����л����� Map ����תΪ Data ����
     */
    @Override
    public MapConvertor marshal(Map<String, Object> map) throws Exception {
        MapConvertor data = new MapConvertor();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            data.addMapEntry(entry.getKey(), entry.getValue());
        }
        return data;
    }


}