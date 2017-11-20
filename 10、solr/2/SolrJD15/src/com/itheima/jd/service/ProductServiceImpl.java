package com.itheima.jd.service;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.jd.common.Global;
import com.itheima.jd.dao.ProductDao;
import com.itheima.jd.model.ResultModel;
/**
 * 商品查询Service实现类
 * <p>Title: ProductServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	传智.入云龙
 * @date	2015-6-23下午5:22:46
 * @version 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productDao;

	@Override
	public ResultModel queryProduct(String queryString, String catalog_name,
			String price, String sort, Integer page) throws Exception {

		//拼装查询条件
		SolrQuery query = new SolrQuery();
		//查询条件
		if (null != queryString && !"".equals(queryString)) {
			query.setQuery(queryString);
		} else {
			query.setQuery("*:*");
		}
		//商品类别过滤
		if (null != catalog_name && !"".equals(catalog_name)) {
			query.addFilterQuery("product_catalog_name:" + catalog_name);
		}
		//价格过滤
		if (null != price && !"".equals(price)) {
			String[] strings = price.split("-");
			query.addFilterQuery("product_price:["+strings[0]+" TO "+strings[1]+"]");
		}
		//排序条件
		if ("1".equals(sort)) {
			query.setSort("product_price", ORDER.desc);
		} else {
			query.setSort("product_price", ORDER.asc);
		}
		//分页处理
		if (null == page) page = 1;
		int start = (page - 1) * Global.PAGE_SIZE;
		query.setStart(start);
		query.setRows(Global.PAGE_SIZE);
		//设置默认搜索域
		query.set("df", "product_keywords");
		//高亮设置
		query.setHighlight(true);
		query.addHighlightField("product_name");
		query.setHighlightSimplePre("<span style=\"color:red\">");
		query.setHighlightSimplePost("</span>");
		
		//执行查询
		ResultModel resultModel = productDao.queryProduct(query);
		//计算总页数
		Long recordCount = resultModel.getRecordCount();
		int pages = (int) (recordCount / Global.PAGE_SIZE);
		if (recordCount % Global.PAGE_SIZE > 0) {
			pages++;
		}
		resultModel.setPageCount(pages);
		resultModel.setCurPage(page);
		
		return resultModel;
	}

}
