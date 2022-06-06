package io.hibernate.cycle.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "deployment")
public class Deployment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "deployment_id")
    private Integer deploymentId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @ManyToOne
    private AnimalDeployment animalDeployment;
}
//spring_hibernate_entity_ERD