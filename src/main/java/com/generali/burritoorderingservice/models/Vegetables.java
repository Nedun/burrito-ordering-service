package com.generali.burritoorderingservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name = "vegetables")
public class Vegetables {

    @Getter
    @Setter
    @Id
    @Column(name = "id")
    private Long id;


    @Getter
    @Setter
    private boolean cabbage;

    @Getter
    @Setter
    private boolean corn;

    @Getter
    @Setter
    private boolean jalapenos;

    @OneToOne(mappedBy = "vegetables")
    private BurritoOrder burritoOrder;
}
