package com.entity.start.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Profiles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bio;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users users;
}
