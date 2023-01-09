package com.revisionsapin.revisionsapin.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class SapinEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    boolean vendu;

    @ManyToMany
    public List <DecorationEntity> decorations;




}
