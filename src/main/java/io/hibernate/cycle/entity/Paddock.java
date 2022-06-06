package io.hibernate.cycle.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "paddock")
public class Paddock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "paddock_id")
    private Integer paddockId;

    public Paddock() {
    }

    @OneToMany(mappedBy = "paddock")
    private List<AnimalDeployment> animalDeployments;

    public Paddock(Integer paddockId, List<AnimalDeployment> animalDeployments) {
        this.paddockId = paddockId;
        this.animalDeployments = animalDeployments;
    }
}
