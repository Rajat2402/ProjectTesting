package org.studyeasy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.studyeasy.entity.Brands;

@Repository
public interface CrudRepo extends CrudRepository<Brands, Integer> {

}
