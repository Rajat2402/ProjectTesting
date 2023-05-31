package org.studyeasy.DaoImpl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.studyeasy.Dto.BrandDto;
import org.studyeasy.brandDao.BrandDao;
import org.studyeasy.entity.Brands;
import org.studyeasy.repository.CrudRepo;
import org.studyeasy.studentModelMapper.StudentMapper;

@Component
public class BrandDaoImpl implements BrandDao {

	private static final Logger logger = LoggerFactory.getLogger(BrandDao.class);
	@Autowired
	CrudRepo crudRepo;

	@Override
	public List<BrandDto> getList() {

		return null;
	}

	@Override
	public BrandDto getBrand(int brandId) {
		BrandDto dto = null;
		try {
			Optional<Brands> optionanBrand = crudRepo.findById(brandId);
			Brands brand = optionanBrand.get();
			if (brand != null) {
				logger.info("Getting request of operation getBrand to dataBase for result. Id is " + brandId);
				dto = StudentMapper.JpaToUser(brand);
			} else {
				logger.info("We are not able to proceed with the result with " + brandId + " sorry");
			}
		} catch (NoSuchElementException e) {
			System.out.println("Please Enter valid Id " + brandId + "is not present in database");
		}
		return dto;
	}

	@Override
	public BrandDto createBrand(Brands brands) {
		Brands savedBrand = crudRepo.save(brands);
		BrandDto brandDto = StudentMapper.JpaToUser(savedBrand);
		return brandDto;
	}

}
