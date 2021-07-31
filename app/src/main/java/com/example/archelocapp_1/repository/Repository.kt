package com.example.archelocapp_1.repository

import com.example.archelocapp_1.source.api.ServiceBuilder
import com.example.archelocapp_1.source.database.dao.AppDao
import java.util.*
//import javax.inject.Inject
//import javax.inject.Singleton
//class Repository @Inject constructor(private val appDao: AppDao)
abstract class Repository {

    //abstract val appDao: AppDao


    suspend fun login(userName: String, password: String) =
        ServiceBuilder.getClient().getData(userName, password)

    suspend fun addNest(data: HashMap<String, Any>) = ServiceBuilder.getClient().addNest(data)

    suspend fun addGeographicalData(data: HashMap<String, Any>) =
        ServiceBuilder.getClient().addGeographicalData(data)

    suspend fun addMorningSurvey(data: HashMap<String, Any>) =
        ServiceBuilder.getClient().addMorningSurvey(data)


}