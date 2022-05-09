package com.generali.burritoorderingservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name = "extras")
public class Extras {
    @Getter
    @Setter
    @Id
    @Column(name = "id")
    private Long id;

    @Getter
    @Setter
    private boolean avocado;

    @OneToOne(mappedBy = "extras")
    private BurritoOrder burritoOrder;
}
