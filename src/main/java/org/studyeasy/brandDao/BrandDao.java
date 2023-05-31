package org.studyeasy.brandDao;

import java.util.List;

import org.studyeasy.Dto.BrandDto;

public interface BrandDao {

	public List<BrandDto> getList();

	public BrandDto getBrand(int brandId);


}
