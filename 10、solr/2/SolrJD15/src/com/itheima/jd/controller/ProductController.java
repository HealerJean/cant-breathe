package com.itheima.jd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itheima.jd.model.ResultModel;
import com.itheima.jd.service.ProductService;
/**

1、查询条件：String queryString
2、过滤条件，商品分类名称：String catalog_name
3、价格区间的过滤条件，价格区间格式：0-10，11-20，21-30，30-*：String price
4、排序条件，根据价格排序，可以只传递排序方式0：升序 1：降序：String sort
5、分页条件，只需要得到页码即可，每页显示商品的数量定义常量：Integer page

 * @author HealerJean
 *
 */
@Controller
public class ProductController {
	
	@Autowired
	private ProductService service;

	@RequestMapping("/list")
	public String queryProduct(String queryString, String catalog_name, String price,
			String sort, Integer page, Model model) {
		//执行查询
		ResultModel resultModel = null;
		try {
			resultModel = service.queryProduct(queryString, catalog_name, price, sort, page);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//把查询结果传递到页面
		model.addAttribute("result", resultModel);
		//参数回显
		model.addAttribute("queryString", queryString);
		model.addAttribute("catalog_name", catalog_name);
		model.addAttribute("price", price);
		model.addAttribute("sort", sort);
		model.addAttribute("page", page);
		//返回jsp的名称
		///WEB-INF/jsp/ + product_list + .jsp
		return "product_list";
	}
}
