package com.itheima.jd.service;

import com.itheima.jd.model.ResultModel;

/**
 * 商品查询Service
 * 
 * <p>
 * Title: ProductService
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 * 
 * @author 传智.入云龙
 * @date 2015-6-23下午5:22:00
 * @version 1.0
 */
public interface ProductService {

	ResultModel queryProduct(String queryString, String catalog_name,
			String price, String sort, Integer page) throws Exception;
}
