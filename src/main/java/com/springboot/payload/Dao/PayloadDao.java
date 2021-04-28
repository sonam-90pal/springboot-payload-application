package com.springboot.payload.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.payload.entity.Load;

@Repository
public interface PayloadDao extends JpaRepository<Load, Integer> {

}
