package com.example.archelocapp_1.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.archelocapp_1.Models.GeographicalDataTableModel
import com.example.archelocapp_1.Models.LoginTableModel

//interface is the abstraction to hide the implementation of these functions in the class
@Dao
interface DAOAccess {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun InsertData(loginTableModel: LoginTableModel)

    @Query("SELECT * FROM Login WHERE Username =:username")
    fun getLoginDetails(username: String?) : LiveData<LoginTableModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun InsertData(geographicalDataTableModel: GeographicalDataTableModel)

    @Query("SELECT * FROM GeographicalData WHERE Gps_longitude =:gps_longitude")
    fun getGeographicalDetails(gps_longitude: Float?,
                               gps_latitude: Float?,
                               number_of_eggs: Int?,
                               distance_to_sea: Int?,
                               bottom_of_nest_depth: Int?,
                               top_egg_depth: Int?,
                               reason_for_relocation: String?,
                               relocated_to: String?,
                               end_time: String?,
                               start_time: String?,
                               date: String?,
                               nest: Int?
                               ) : LiveData<GeographicalDataTableModel>

}