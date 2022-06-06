package io.hibernate.cycle.entity;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer contactId;
    private Integer recordId;
    private LocalDateTime startDate;
    private Integer duration;
    private Integer receiverId;
    private Integer deployment;
    @OneToOne
    private AnimalDeployment animalDeployment;

    public Contact() {
    }

    public Contact(Integer contactId, Integer recordId, LocalDateTime startDate, Integer duration, Integer receiverId, Integer deployment, AnimalDeployment animalDeployment) {
        this.contactId = contactId;
        this.recordId = recordId;
        this.startDate = startDate;
        this.duration = duration;
        this.receiverId = receiverId;
        this.deployment = deployment;
        this.animalDeployment = animalDeployment;
    }

    //    deployment id


}
