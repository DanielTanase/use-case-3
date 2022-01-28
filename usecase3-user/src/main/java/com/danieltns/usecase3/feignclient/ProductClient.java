package com.danieltns.usecase3.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.danieltns.usecase3.dto.productclient.ProductDto;
import com.danieltns.usecase3.utils.AppConstants;

@FeignClient(name = AppConstants.VENDOR_SERVICE_URL + AppConstants.VENDOR_PRODUCT_CONTROLLER)
public interface ProductClient {
	
	@GetMapping(AppConstants.VENDOR_SEARCH_PRODUCT)
	public List<ProductDto> getAllByKeyword(@RequestParam String keyword);
	
	@GetMapping(AppConstants.VENDOR_LIST_PRODUCT)
	public List<ProductDto> getByIdList(@RequestBody List<Long> productIdList);
}
