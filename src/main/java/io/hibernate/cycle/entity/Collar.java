package io.hibernate.cycle.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "collar")
public class Collar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "collar_id")
    private Integer collarId;

    @OneToMany
    private List<AnimalDeployment> animalDeployment;

    public Collar() {
    }

    public Collar(Integer collarId, List<AnimalDeployment> animalDeployment) {
        this.collarId = collarId;
        this.animalDeployment = animalDeployment;
    }
}
