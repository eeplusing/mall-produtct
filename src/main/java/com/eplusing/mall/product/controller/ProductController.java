package com.eplusing.mall.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eplusing.mall.product.bean.Product;
import com.eplusing.mall.product.mapper.ProductMapper;
import com.eplusing.mall.product.web.Response;

@RestController
public class ProductController {

	@Autowired
	private ProductMapper productMapper;

	@PostMapping("/soa/product/add")
	public Object add(Product product) {
		Integer result = productMapper.add(product);

		if (result != null) {
			return new Response("200", "ok");
		}

		return new Response("500", "fail");
	}

	@DeleteMapping("/soa/product/delete/{id}")
	public Object delete(@PathVariable("id") Integer id) {
		Integer result = productMapper.deleteById(id);

		return result == 1 ? new Response("200", "ok") : new Response("500", "fail");
	}

	@PutMapping("/soa/product/update")
	public Object update(Product product) {
		Integer result = productMapper.update(product);
		return result == 1 ? new Response("200", "ok") : new Response("500", "fail");
	}

	@GetMapping("/soa/product/{id}")
	public Object get(@PathVariable("id") Integer id) {
		Product product = productMapper.getById(id);
		return new Response("200", "ok", product);
	}

	@GetMapping("/soa/products")
	public Object lists() {
		List<Product> products = productMapper.queryByLists();
		return new Response("200", "ok", products);
	}

}
