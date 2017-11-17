package com.reflect.util;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBElement;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*		
<select id="selectByExample" resultMap="BaseResultMap" parameterType="org.dicp.core.model.entity.WsDestEOCriteria" >
   select
   <if test="distinct" >
     distinct
   </if>
   <include refid="Base_Column_List" />
   from T_WS_DEST
   <if test="_parameter != null" >
     <include refid="Example_Where_Clause" />
   </if>
   <if test="orderByClause != null" >
     order by ${orderByClause}
   </if>
 </select>
 
insert into t_ws_dest (PK_WS_DEST, DEST_NAME, IS_ACTIVE, WSDL_ADDR, NAMESPACE, SERVICE_NAME, PORT_NAME, OBJ_FACY, USER_CODE, PASSWORD, MEMO, TS)
values ('trustee_healerjean', '����ϵͳְҵ����ͷ���', 'Y', 'http://localhost:8080/dicp/services/BusinessReceiveServices?wsdl', 'http://webservice.dtcp.picc.com/', 'BusinessReceiveServices', 'BusinessReceiveServicesPort', 'client.trustee.ObjectFactory', 'dicp', 'dicp', '', '23-12��-13 09.42.34.000000 ����');


 */

@Service
public class WsServiceImp implements IWsService {
	
	private List<WsDestInfo> wsDestInfos = new ArrayList<WsDestInfo>();

	/**
	 * ��ʼ��
	 * @author :HealerJean: 
	 * @date   :2017��11��17�� ����4:44:48 
	 * @Description:    
	 * void
	 */
	@SuppressWarnings("null")
	@PostConstruct
	public void init() {

		
		List<WsDestEO> wsDestEOs = new ArrayList<WsDestEO>();
		WsDestEO wsDestEOOne = new WsDestEO(
				"trustee_healerjean", 
				"����ϵͳְҵ����ͷ���",
				"Y", 
				"http://localhost:8080/SpringWebService/services/CommonService?wsdl", 
			 	"http://healerjean/", 
				"CommonWSInter", 
				"CommonWSInterPort", 
				"com.hlj.client.ObjectFactory", 
				"dicp",
				"dicp", 
				" ", 
				new Date()); 
		WsDestEO wsDestEOTwo = new WsDestEO(
				"trustee_healerjean2", 
				"����ϵͳְҵ����ͷ���",
				"N", 
				"http://localhost:8080/SpringWebService/services/CommonService?wsdl", 
				"http://healerjean/", 
				"BusinessReceiveServices", 
				"BusinessReceiveServicesPort", 
				"com.reflect.client.ObjectFactory", 
				"dicp",
				"dicp", 
				" ", 
				new Date()); 
		wsDestEOs.add(wsDestEOOne);
		for (WsDestEO wsDestEO : wsDestEOs) {
			try {
				WsDestInfo wsDestInfo = new WsDestInfo();
				wsDestInfo.setWsDestEO(wsDestEO);
				wsDestInfo.init(); // ��ʼ��Dispatch����
				wsDestInfos.add(wsDestInfo);
			} catch (Exception e) {
				e.printStackTrace();
				// ��ӡ��Ե��쳣����֤������������
			}
		}
	}
	
	@Override
	public WsDestInfo getWsDestInfoByKey(String key) {
		for (WsDestInfo wsDestInfo : wsDestInfos) {
			if (wsDestInfo.getWsDestEO().getPkWsDest().equals(key)) {
				return wsDestInfo;
			}
		}
		return null;
	}
	
}
