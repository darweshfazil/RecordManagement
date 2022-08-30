package com.adf.hms.entity

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import javax.persistence.*

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="patient")
class Patient {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null

    @Column(name="name")
    lateinit var name: String

    @Column(name="age")
    val age: Int? = null

    @Column(name="phone")
    lateinit var phone: String

    @Column(name="address")
    lateinit var address: String
}