package org.studyeasy.BrandServiceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.studyeasy.Dto.BrandDto;
import org.studyeasy.Service.BrandService;
import org.studyeasy.brandDao.BrandDao;

@Component
public class BrandServiceImpl implements BrandService{

	private static final Logger logger = LoggerFactory.getLogger(BrandService.class);
	
	@Autowired
	private BrandDao brandDao;
	
	
	@Override
	public List<BrandDto> getList() {
		
		return brandDao.getList();
	}


	@Override
	public BrandDto getBrand(int brandId) {
		logger.info("Sending getBrand Request to DTO layer with Id "+brandId);
		return brandDao.getBrand(brandId);
	}

}
