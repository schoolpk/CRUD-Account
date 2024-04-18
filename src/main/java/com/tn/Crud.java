package com.tn;


import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
@Table(name = "crud")
public class Crud {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String password;

}
