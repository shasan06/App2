package com.example.archelocapp_1.Models

//first declare the class
// this class is the login table
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "GeographicalData")
data class GeographicalDataTableModel (
    //this is the column for gps_longitude
    @ColumnInfo(name = "gps_longitude")
    var Gps_longitude: Float,

    //this is the column for gps_latitude
    @ColumnInfo(name = "gps_latitude")
    var Gps_latitude: Float,

    //this is the column for number_of_eggs
    @ColumnInfo(name = "number_of_eggs")
    var Number_of_eggs: Int,

    //this is the column for distance_to_sea
    @ColumnInfo(name = "distance_to_sea")
    var Distance_to_sea: Int,

    //this is the column for bottom_of_nest_depth
    @ColumnInfo(name = "bottom_of_nest_depth")
    var Bottom_of_nest_depth: Int,

    //this is the column for top_egg_depth
    @ColumnInfo(name = "top_egg_depth ")
    var Top_egg_depth : Int,

    //this is the column for reason_for_relocation
    @ColumnInfo(name = "reason_for_relocation ")
    var Reason_for_relocation : String,

    //this is the column relocated_to
    @ColumnInfo(name = "relocated_to ")
    var Relocated_to : String,

    //this is the column end_time
    @ColumnInfo(name = "end_time ")
    var End_time : String,

    //this is the column start_time
    @ColumnInfo(name = "start_time ")
    var Start_time : String,

    //this is the column date
    @ColumnInfo(name = "date ")
    var Date : String,

    @ColumnInfo(name = " nest ")
    var  Nest : Int,
) {

    @PrimaryKey(autoGenerate = true)//a userid is the primary key that will be automatically generated
    @ColumnInfo(name = "id")
    var Id: Int? = null

}
//class GeographicalDataTable {
//    var gps_longitude = 0.0
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
//    var id = 0
//}
