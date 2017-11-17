package com.reflect.sender;

import javax.xml.namespace.QName;

import org.springframework.stereotype.Component;

import com.hlj.client.SetMapParam;
import com.hlj.client.SetMapParamResponse;
import com.reflect.bean.WsInvokeResult;
import com.reflect.bean.WsResponse;
import com.reflect.bean.YesOrNo;
import com.reflect.util.WsDestInfo;


/** 
 * @author : HealerJean
 * @date   ： 2017年11月17日 上午9:26:02 
 * @Description: 渠道调用受托的服务。用来交给受托进行代理人发来数据的业务校验
 */
@Component
public class SetMapParamSender  extends WsSender<SetMapParam>{

	
	@Override
	public WsDestInfo getWsDestInfo() {

		return wsService.getWsDestInfoByKey("trustee_healerjean");
	}

	@Override
	public QName getOperationQName() {
		return new QName(getWsDestInfo().getWsDestEO().getNamespace(), "setMapParam");
	}
	
	
	@Override
	protected WsResponse handleInvokeResult(WsInvokeResult wsInvokeResult) {

		WsResponse response = new WsResponse();
		if (YesOrNo.YES.getCode().equals(wsInvokeResult.getInvokeResult())) {
			SetMapParamResponse setMapParamResponse = (SetMapParamResponse) wsInvokeResult.getReturnObject();
		/*	String result = "01".equals(setMapParamResponse.getReturn()) ? YesOrNo.YES.getCode() : YesOrNo.NO.getCode();
			String respInfo = YesOrNo.YES.getCode().equals(result) ? "处理成功" : "处理失败：" + receiveDataOrFeedbackFromInteResponse.getReturn().getMsg();
			response.setRespResult(result);
			response.setRespInfo(respInfo);*/
			response.setReturnObject(setMapParamResponse);

		} else {
			response.setRespResult(YesOrNo.NO.getCode());
			response.setRespInfo("调用失败：" + wsInvokeResult.getInvokeInfo());
		}
		return response;
	}

}
