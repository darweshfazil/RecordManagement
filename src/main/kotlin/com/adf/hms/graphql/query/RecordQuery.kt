package com.adf.hms.graphql.query

import com.adf.hms.entity.Patient
import com.adf.hms.service.HMSService
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class RecordQuery : GraphQLQueryResolver{

    @Autowired
    lateinit var hmsService: HMSService

    fun getRecords(): MutableList<Patient>? {
        return hmsService.getRecords()
    }

    fun getRecordById(id: Int): Patient?{
        return hmsService.getRecord(id)
    }
}