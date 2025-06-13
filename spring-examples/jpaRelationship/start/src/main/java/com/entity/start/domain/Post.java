package com.entity.start.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    private String text;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users users;

}
