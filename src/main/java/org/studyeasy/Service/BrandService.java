package org.studyeasy.Service;

import java.util.List;

import org.studyeasy.Dto.BrandDto;

public interface BrandService {

	List<BrandDto> getList();

	BrandDto getBrand(int brandId);

}
