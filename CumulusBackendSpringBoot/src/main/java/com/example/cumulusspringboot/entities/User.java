package com.example.cumulusspringboot.entities;

import com.example.cumulusspringboot.entities.oubaid.Chat;
import lombok.*;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String username;
    String email;
    String password;
    @Enumerated(EnumType.STRING)
    Role role;
    String verificationToken;
    Boolean verified;
    Date expiryDate;
    String institution;
    String description;
    String address;
    @Lob
    private byte[] imagePath;


}
