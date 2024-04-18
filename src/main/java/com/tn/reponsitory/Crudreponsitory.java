package com.tn.reponsitory;


import com.tn.Crud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Crudreponsitory extends JpaRepository<Crud, Integer> {
}
