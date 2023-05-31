package org.studyeasy.studentModelMapper;

import org.studyeasy.Dto.BrandDto;
import org.studyeasy.entity.Brands;

public class StudentMapper {

	public static Brands UserToJpa(BrandDto brandDto) {
		Brands brand = new Brands(brandDto.getId(), brandDto.getName());
		return brand;
	}

	public static BrandDto JpaToUser(Brands brands) {
		BrandDto brandDto = new BrandDto(brands.getBrandId(), brands.getBrandName());
		return brandDto;
	}
}
