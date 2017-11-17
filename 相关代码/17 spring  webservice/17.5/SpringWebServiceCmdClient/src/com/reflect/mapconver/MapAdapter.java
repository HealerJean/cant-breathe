package com.reflect.mapconver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;


/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年10月30日 下午2:02:38 
 * 类说明 
 */
public class MapAdapter extends XmlAdapter<MapConvertor, Map<String, Object>> {

	/**
	 * unmarshal：反序列化，将 Data 对象转为 Map 对象。
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
     * marshal：序列化，将 Map 对象转为 Data 对象。
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