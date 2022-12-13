package com.skyhigh.vehiclechain.repository;

import com.skyhigh.vehiclechain.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
    @Override
    Iterable<User> findAllById(Iterable<String> strings);
}
