package com.foo.bar.car.pojo;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashMap;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.Data;

@Data
@Entity
@Table(name="car")
public class Car   {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false, updatable = false)
    private Integer id;
    
    @Column(name="ksu_id")
    private String ksuId;

    @Column(name="title")
    private String title;

    @Column(name="subtitle")
    private String subTitle;
    
    @Column(name="card_image")
    private String cardImage;
}
