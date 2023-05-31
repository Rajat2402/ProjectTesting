package org.studyeasy.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.studyeasy.Dto.BrandDto;
import org.studyeasy.Service.BrandService;
import org.studyeasy.entity.Brands;

@RestController
@RequestMapping("/showroom")
public class Controling {

	@Autowired
	private BrandService brandService;

	private static final Logger logger = LoggerFactory.getLogger(Controling.class);

	//http://localhost/<Get Request>
	@GetMapping("/brands")
	public List<BrandDto> getList() {
		List<BrandDto> list = new ArrayList<BrandDto>();
		list = brandService.getList();
		logger.info("Received get request on /brands");
		return list;

	}

	@GetMapping("/brands/{brandId}")
	public BrandDto getBrand(@PathVariable("brandId") int brandId) {
		logger.info("Sending get request on /brands with / {}" + brandId + " to Service layer");
		BrandDto brand = brandService.getBrand(brandId);
		if (!(brand == null)) {
			logger.info("Received get request on /brands/ {}" + brandId);
		}
		return brand;
	}

	@PostMapping("/brands")
	public BrandDto createBrand(@RequestBody Brands brands) {
		System.out.println(brands.getBrandName());
		BrandDto brandDto = brandService.createBrand(brands);
		return brandDto;

	}
}
