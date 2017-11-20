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
 * ʹ��solrJά��������
 */
public class SolrFirst {

	public static void main(String[] args) throws Exception {
	//	addDocument();
	//	deleteDocumentById();
	//	queryIndexSimple();
	 queryIndexFuza();
	}
	//����ĵ�
	@Test
	public static void addDocument() throws Exception {
		//������solr������������
		//��������solr��������url
		SolrServer server = new HttpSolrServer("http://127.0.0.1:8080/solr/core");
		//����һ���ĵ�����
		SolrInputDocument document = new SolrInputDocument();
		//���ĵ��������
		//��һ��������������ƣ�������schema.xml�ж���
		//�ڶ������������ֵ
		document.addField("id", "solr001");
		document.addField("product_name", "С���ֻ�");
		document.addField("product_price", "2000");
		//���ĵ���ӵ�������
		server.add(document);
		server.commit();
	}
	
	//����idɾ��
	@Test
	public static void deleteDocumentById() throws Exception {
		SolrServer server = new HttpSolrServer("http://127.0.0.1:8080/solr/core");
		//ֱ�ӵ���ɾ���ķ���
		server.deleteById("solr001");
		server.commit();
	}
	//���ݲ�ѯɾ���ĵ�
	@Test
	public static void deleteDocumentByQuery() throws Exception {
		SolrServer server = new HttpSolrServer("http://127.0.0.1:8080/solr/core");
		//����ɾ������
		server.deleteByQuery("*:*");
		server.commit();
	}
	
	//��ѯ������
	@Test
	public static void queryIndexSimple() throws Exception {
		SolrServer server = new HttpSolrServer("http://127.0.0.1:8080/solr/core");
		//����һ����ѯ����
		SolrQuery query = new SolrQuery();
		//��Ӳ�ѯ����.������ĵȼ�
		//query.setQuery("*:*");
		query.set("q", "*:*");
		//ִ�в�ѯ
		QueryResponse queryResponse = server.query(query);
		//�������
		//ȡ�ĵ��б�
		SolrDocumentList results = queryResponse.getResults();
		System.out.println("��ѯ�����������" + results.getNumFound());
		for (SolrDocument solrDocument : results) {
			System.out.println(solrDocument.get("id"));
			System.out.println(solrDocument.get("product_name"));
			System.out.println(solrDocument.get("product_price"));
			System.out.println(solrDocument.get("product_catalog_name"));
			System.out.println(solrDocument.get("product_picture"));
		}
	}
	//��ѯ�����⣬���Ӳ�ѯ
	@Test
	public static void queryIndexFuza() throws Exception {
		SolrServer server = new HttpSolrServer("http://127.0.0.1:8080/solr/core");
		//����һ��query����
		SolrQuery query = new SolrQuery();
		//��Ӳ�ѯ����
		query.setQuery("2"); //Ĭ��������֮�󣬿���ֱ�Ӳ�ѯ
		//��������
		query.addFilterQuery("product_catalog_name:2", "product_price:[0 TO 3]");
		//��������
		query.setSort("product_price", ORDER.asc);
		//��ҳ����
		query.setStart(0);
		query.setRows(15);
		//���÷��ؽ�����ĵ������б�
		query.setFields("id", "product_name", "product_price", "product_catalog_name", "product_picture");
		//����Ĭ��������,���û������������setQuery����ʵ��
		query.set("df", "product_name");
		//���ø���
		query.setHighlight(true);
		//���ø�����ʾ����
		query.addHighlightField("product_name");
		//����ǰ׺
		query.setHighlightSimplePre("<em>");
		//������׺
		query.setHighlightSimplePost("</em>");
		//ִ�в�ѯ
		QueryResponse queryResponse = server.query(query);
		//ȡ�ĵ��б�
		SolrDocumentList documentList = queryResponse.getResults();
		System.out.println("һ����ѯ����"+ documentList.getNumFound());
		for (SolrDocument solrDocument : documentList) {
			System.out.println(solrDocument.get("id"));
			//ȡ�������
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
