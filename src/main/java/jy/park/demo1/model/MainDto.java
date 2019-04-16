package jy.park.demo1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="JYPARK_MAIN")
@IdClass(MainDtoPK.class)
public class MainDto {

    @Column(name="ID")
    private String id;

    @Column(name="NAME")
    private String name;

    @Column(name="DESCRIPTION")
    private String description;

    @Id
    @Column(name="SEQUENCE")
    @GeneratedValue
    private int sequence;

}
