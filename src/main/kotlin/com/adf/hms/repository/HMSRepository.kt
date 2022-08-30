package com.adf.hms.repository

import com.adf.hms.entity.Patient
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface HMSRepository : JpaRepository<Patient, Int> {
}