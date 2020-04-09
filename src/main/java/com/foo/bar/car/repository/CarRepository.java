package com.foo.bar.car.repository;

import com.foo.bar.car.pojo.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Car, Integer> {

}
