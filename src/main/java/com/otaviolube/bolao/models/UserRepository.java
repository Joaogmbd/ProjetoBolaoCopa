package com.otaviolube.bolao.models;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {
    @Override
    default Optional<UserModel> findById(Long id) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }
}
