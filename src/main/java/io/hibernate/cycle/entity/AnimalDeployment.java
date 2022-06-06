package io.hibernate.cycle.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "animal_deployment")
public class AnimalDeployment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "animal_deployment_id")
    private Integer animalDeploymentId;

    @OneToOne
    @JoinColumn(name = "animal_id")
    private Animal animal;


    @OneToOne
    @JoinColumn(name = "deployment_id")
    private Deployment deployment;

    @OneToOne
    @JoinColumn(referencedColumnName = "paddock_id")
    private Paddock paddock;

    @OneToOne
    private Collar collar;
    public AnimalDeployment() {
    }

    @OneToMany
    private List<Contact> contact;

    public AnimalDeployment(Integer animalDeploymentId, Animal animal, Deployment deployment, Paddock paddock, Collar collar, List<Contact> contact) {
        this.animalDeploymentId = animalDeploymentId;
        this.animal = animal;
        this.deployment = deployment;
        this.paddock = paddock;
        this.collar = collar;
        this.contact = contact;
    }
}
