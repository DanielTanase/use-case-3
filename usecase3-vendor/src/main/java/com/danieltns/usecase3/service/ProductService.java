package com.danieltns.usecase3.service;

import java.util.List;

import com.danieltns.usecase3.dto.ProductDto;

public interface ProductService extends CrudService<ProductDto, Long> {
	
	List<ProductDto> findByIdList(List<Long> productIdList);
	
	List<ProductDto> findByNameContaining(String keyword);
}
