package com.itheima.jd.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itheima.jd.dao.ProductDao;
import com.itheima.jd.model.ProductModel;
import com.itheima.jd.model.ResultModel;
/**
 * 商品dao实现类
 * <p>Title: ProductDaoImpl</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	传智.入云龙
 * @date	2015-6-23下午5:13:28
 * @version 1.0
 */
@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SolrServer solrServer;
	
	@Override
	public ResultModel queryProduct(SolrQuery query) throws Exception {
		//执行查询
		QueryResponse queryResponse = solrServer.query(query);
		//取商品列表
		SolrDocumentList solrDocumentList = queryResponse.getResults();
		//商品列表
		List<ProductModel> productList = new ArrayList<>();
		//遍历商品列表
		for (SolrDocument solrDocument : solrDocumentList) {
			ProductModel productModel = new ProductModel();
			productModel.setPid((String) solrDocument.get("id"));
			//取高亮显示
			Map<String, Map<String, List<String>>> highlighting = queryResponse.getHighlighting();
			List<String> list = highlighting.get(solrDocument.get("id")).get("product_name");
			String productName = "";
			if (null != list && list.size() > 0) {
				productName = list.get(0);
			} else {
				productName = (String) solrDocument.get("product_name");
			}
			productModel.setName(productName);
			productModel.setCatalog_name((String) solrDocument.get("product_catalog_name"));
			productModel.setPrice((float) solrDocument.get("product_price"));
			productModel.setPicture((String) solrDocument.get("product_picture"));
			//添加到商品列表
			productList.add(productModel);
		}
		//返回值对象
		ResultModel resultModel = new ResultModel();
		resultModel.setProductList(productList);
		resultModel.setRecordCount(solrDocumentList.getNumFound());
		return resultModel;
	}

}
