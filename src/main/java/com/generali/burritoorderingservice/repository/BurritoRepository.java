package com.generali.burritoorderingservice.repository;

import com.generali.burritoorderingservice.models.BurritoOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BurritoRepository extends CrudRepository<BurritoOrder,Long>{

}
