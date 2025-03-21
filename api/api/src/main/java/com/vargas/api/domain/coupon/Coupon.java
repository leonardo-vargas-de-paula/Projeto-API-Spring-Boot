package com.vargas.api.domain.coupon;

import com.vargas.api.domain.event.Event;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Table(name = "event-coupon")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {
    private UUID id;

    private Integer discount;

    private Date valid;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;


}
