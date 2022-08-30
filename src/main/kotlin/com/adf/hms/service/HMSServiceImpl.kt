package com.adf.hms.service

import com.adf.hms.entity.Patient
import com.adf.hms.repository.HMSRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class HMSServiceImpl: HMSService {

    @Autowired
    private val hmsRepository: HMSRepository? = null

    override fun getRecords(): MutableList<Patient>? {
        return hmsRepository?.findAll()
    }
    override fun getRecord(id: Int): Patient? {
        return hmsRepository?.findById(id)?.orElse(null)
    }

    override fun insertRecord(patient: Patient): Patient? {
        return hmsRepository?.save(patient)
    }

    override fun deleteRecord(id: Int): String {
        hmsRepository?.deleteById(id)
        return "Record Successfully Deleted"
    }

    override fun updateRecord(patient: Patient): Patient? {
        return hmsRepository?.saveAndFlush(patient)
    }
}