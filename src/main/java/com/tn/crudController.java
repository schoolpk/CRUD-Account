package com.tn;


import com.tn.reponsitory.Crudreponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class crudController {

    @Autowired
    private Crudreponsitory crudRepo;


    @GetMapping("getAll")
    public ResponseEntity<?> getAll() {
        List<Crud> cruds =  crudRepo.findAll();

        return new ResponseEntity<>(cruds, HttpStatus.OK);
    }
}
