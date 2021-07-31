package com.example.archelocapp_1.repository

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.archelocapp_1.Models.GeographicalDataTableModel
import com.example.archelocapp_1.room.GeographicalDatabase
import com.example.archelocapp_1.room.LoginDatabase
import com.example.archelocapp_1.utils.AuthListener
//import com.example.room.archelocapp_1.Models.LoginTableModel
//import com.example.room.archelocapp_1.room.LoginDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class GeographicalRepository {

    companion object {

        var geographicalDatabase: GeographicalDatabase? = null

        var geographicalDataTableModel: LiveData<GeographicalDataTableModel>? = null

        fun initializeDB(context: Context) : GeographicalDatabase {
            return GeographicalDatabase.getDataseClient(context)
        }

        fun insertData(context: Context, gps_longitude: Float, gps_latitude: Float, number_of_eggs: Int,
                       distance_to_sea: Int, bottom_of_nest_depth: Int, top_egg_depth: Int, reason_for_relocation: String,
                       relocated_to: String, end_time: String, start_time: String, date: String, nest: Int) {

            geographicalDatabase = initializeDB(context)

            CoroutineScope(IO).launch {
                val geographicalDetails = GeographicalDataTableModel(gps_longitude, gps_latitude, number_of_eggs,
                    distance_to_sea, bottom_of_nest_depth, top_egg_depth, reason_for_relocation, relocated_to, end_time,
                    start_time, date, nest)
                geographicalDatabase!!.geographicalDao().InsertData(geographicalDetails)
            }

        }

        fun getGeographicalDetails(context: Context, gps_longitude: Float, gps_latitude: Float, number_of_eggs: Int,
                                   distance_to_sea: Int, bottom_of_nest_depth: Int, top_egg_depth: Int, reason_for_relocation: String,
                                   relocated_to: String, end_time: String, start_time: String, date: String, nest: Int) : LiveData<GeographicalDataTableModel>? {

            geographicalDatabase = initializeDB(context)

            geographicalDataTableModel = geographicalDatabase!!.geographicalDao().getGeographicalDetails(gps_longitude, gps_latitude, number_of_eggs,
                distance_to_sea, bottom_of_nest_depth, top_egg_depth, reason_for_relocation, relocated_to, end_time,
                start_time, date, nest)

            return geographicalDataTableModel
        }

    }
}

//var gps_longitude = 0.0
//    var gps_latitude = 0.0
//    var number_of_eggs = 0
//    var distance_to_sea = 0
//    var bottom_of_nest_depth = 0
//    var top_egg_depth = 0
//    var reason_for_relocation: String? = null
//    var relocated_to: String? = null
//    var end_time: String? = null
//    var start_time: String? = null
//    var date: String? = null
//    var nest = 0