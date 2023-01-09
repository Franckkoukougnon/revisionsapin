package com.revisionsapin.revisionsapin.Entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BonDeCommandeEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    private long id;
    private String adress;

    private int coutTotal;
    private int poidsTotal;



}
