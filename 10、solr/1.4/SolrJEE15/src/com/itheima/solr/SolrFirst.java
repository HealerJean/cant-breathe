package com.itheima.solr;

import java.util.List;
import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

/**
 * 使用solrJ维护索引库
 */
public class SolrFirst {

	public static void main(String[] args) throws Exception {
	//	addDocument();
	//	deleteDocumentById();
	//	queryIndexSimple();
	 queryIndexFuza();
	}
	//添加文档
	@Test
	public static void addDocument() throws Exception {
		//创建和solr服务器的连接
		//参数就是solr服务器的url
		SolrServer server = new HttpSolrServer("http://127.0.0.1:8080/solr/core");
		//创建一个文档对象
		SolrInputDocument document = new SolrInputDocument();
		//向文档中添加域
		//第一个参数是域的名称，必须在schema.xml中定义
		//第二个参数是域的值
		document.addField("id", "solr001");
		document.addField("product_name", "小米手机");
		document.addField("product_price", "2000");
		//把文档添加到索引库
		server.add(document);
		server.commit();
	}
	
	//根据id删除
	@Test
	public static void deleteDocumentById() throws Exception {
		SolrServer server = new HttpSolrServer("http://127.0.0.1:8080/solr/core");
		//直接调用删除的方法
		server.deleteById("solr001");
		server.commit();
	}
	//根据查询删除文档
	@Test
	public static void deleteDocumentByQuery() throws Exception {
		SolrServer server = new HttpSolrServer("http://127.0.0.1:8080/solr/core");
		//调用删除方法
		server.deleteByQuery("*:*");
		server.commit();
	}
	
	//查询索引库
	@Test
	public static void queryIndexSimple() throws Exception {
		SolrServer server = new HttpSolrServer("http://127.0.0.1:8080/solr/core");
		//创建一个查询对象
		SolrQuery query = new SolrQuery();
		//添加查询条件.与下面的等价
		//query.setQuery("*:*");
		query.set("q", "*:*");
		//执行查询
		QueryResponse queryResponse = server.query(query);
		//遍历结果
		//取文档列表
		SolrDocumentList results = queryResponse.getResults();
		System.out.println("查询结果总数量：" + results.getNumFound());
		for (SolrDocument solrDocument : results) {
			System.out.println(solrDocument.get("id"));
			System.out.println(solrDocument.get("product_name"));
			System.out.println(solrDocument.get("product_price"));
			System.out.println(solrDocument.get("product_catalog_name"));
			System.out.println(solrDocument.get("product_picture"));
		}
	}
	//查询索引库，复杂查询
	@Test
	public static void queryIndexFuza() throws Exception {
		SolrServer server = new HttpSolrServer("http://127.0.0.1:8080/solr/core");
		//创建一个query对象
		SolrQuery query = new SolrQuery();
		//添加查询条件
		query.setQuery("2"); //默认搜索域之后，可以直接查询
		//过滤条件
		query.addFilterQuery("product_catalog_name:2", "product_price:[0 TO 3]");
		//排序条件
		query.setSort("product_price", ORDER.asc);
		//分页条件
		query.setStart(0);
		query.setRows(15);
		//设置返回结果中文档的域列表
		query.setFields("id", "product_name", "product_price", "product_catalog_name", "product_picture");
		//设置默认搜索域,如果没有这个，上面的setQuery则不能实现
		query.set("df", "product_name");
		//设置高亮
		query.setHighlight(true);
		//设置高亮显示的域
		query.addHighlightField("product_name");
		//高亮前缀
		query.setHighlightSimplePre("<em>");
		//高亮后缀
		query.setHighlightSimplePost("</em>");
		//执行查询
		QueryResponse queryResponse = server.query(query);
		//取文档列表
		SolrDocumentList documentList = queryResponse.getResults();
		System.out.println("一共查询到："+ documentList.getNumFound());
		for (SolrDocument solrDocument : documentList) {
			System.out.println(solrDocument.get("id"));
			//取高亮结果
			Map<String, Map<String, List<String>>> highlighting = queryResponse.getHighlighting();
			List<String> list = highlighting.get(solrDocument.get("id")).get("product_name");
			String productName = "";
			if (null != list && list.size() > 0) {
				productName = list.get(0);
			} else {
				productName = (String) solrDocument.get("product_name");
			}
			System.out.println(productName);
			System.out.println(solrDocument.get("product_price"));
			System.out.println(solrDocument.get("product_catalog_name"));
			System.out.println(solrDocument.get("product_picture"));
			
		}
	}
}
