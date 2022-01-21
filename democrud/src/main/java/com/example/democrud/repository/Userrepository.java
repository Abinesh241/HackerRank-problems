package com.example.democrud.repository;

import com.example.democrud.entity.Userentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userrepository extends JpaRepository<Userentity,Integer> {

}
