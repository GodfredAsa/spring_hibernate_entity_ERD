package io.hibernate.cycle.entity;
import lombok.Builder;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@Table(name = "animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer animalId;
    private String breed;

    @OneToMany(mappedBy = "animal")
    private List<AnimalDeployment> animalDeployment;

    public Animal() {
    }

    public Animal(Integer animalId, String breed, List<AnimalDeployment> animalDeployment) {
        this.animalId = animalId;
        this.breed = breed;
        this.animalDeployment = animalDeployment;
    }
}
