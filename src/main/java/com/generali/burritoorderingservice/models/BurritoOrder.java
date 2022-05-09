package com.generali.burritoorderingservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "burritoOrders")
public class BurritoOrder {

    public BurritoOrder(){}

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private Tortilla tortilla;
    private Protein protein;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vegetables_id", referencedColumnName = "id")
    private  Vegetables vegetables;

    private  Salsa salsa;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "extras_id", referencedColumnName = "id")
    private  Extras extras;
}
