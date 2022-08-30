package com.adf.hms.service

import com.adf.hms.entity.Patient
import org.springframework.stereotype.Service

@Service
interface HMSService {

    fun getRecords(): MutableList<Patient>?
    fun getRecord(id: Int): Patient?
    fun insertRecord(patient: Patient): Patient?
    fun deleteRecord(id: Int): String
    fun updateRecord(patient: Patient): Patient?
}