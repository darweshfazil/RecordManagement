package com.adf.hms.graphql.mutation

import com.adf.hms.entity.Patient
import com.adf.hms.service.HMSService
import graphql.kickstart.tools.GraphQLMutationResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class RecordMutation : GraphQLMutationResolver{

    @Autowired
    lateinit var hmsService: HMSService

    fun insertRecord(patient: Patient): Patient? {
        return hmsService.insertRecord(patient)
    }

    fun updateRecord(patient: Patient): Patient?{
        return hmsService.updateRecord(patient)
    }

    fun deleteRecord(id: Int): String? {
        return hmsService.deleteRecord(id)
    }
}