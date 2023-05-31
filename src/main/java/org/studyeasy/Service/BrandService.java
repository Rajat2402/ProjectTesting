package org.studyeasy.Service;

import java.util.List;

import org.studyeasy.Dto.BrandDto;
import org.studyeasy.entity.Brands;

public interface BrandService {

	List<BrandDto> getList();

	BrandDto getBrand(int brandId);

	BrandDto createBrand(Brands brands);

}
