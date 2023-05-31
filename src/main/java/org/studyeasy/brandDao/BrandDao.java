package org.studyeasy.brandDao;

import java.util.List;

import org.studyeasy.Dto.BrandDto;
import org.studyeasy.entity.Brands;

public interface BrandDao {

	public List<BrandDto> getList();

	public BrandDto getBrand(int brandId);

	public BrandDto createBrand(Brands brands);


}
