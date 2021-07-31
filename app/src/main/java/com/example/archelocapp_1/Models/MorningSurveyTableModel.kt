package com.example.archelocapp_1.Models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "MorningSurvey")
data class MorningSurveyTableModel (
    //this is the column for photo_id
    @ColumnInfo(name = "photo_id")
    var Photo_id: String,

    //this is the column for comments
    @ColumnInfo(name = "comments")
    var Comments: String,

    //this is the column for number_of_eggs
    @ColumnInfo(name = "tags")
    var Tags: String,

    //this is the column for distance_to_sea
    @ColumnInfo(name = "gps_longitude")
    var Gps_longitude: Float,

    //this is the column for bottom_of_nest_depth
    @ColumnInfo(name = "gps_latitude")
    var Gps_latitude: Float,

    //this is the column for top_egg_depth
    @ColumnInfo(name = "non_nesting_attempts ")
    var Non_nesting_attempts : Int,

    //this is the column for reason_for_relocation
    @ColumnInfo(name = "track_type ")
    var Track_type : String,

    //this is the column relocated_to
    @ColumnInfo(name = "distance_to_sea ")
    var Distance_to_sea : Int,

    //this is the column end_time
    @ColumnInfo(name = "nest ")
    var Nest: Int,

    //this is the column start_time
    @ColumnInfo(name = "emergence_event ")
    var Emergence_event : String,

    //this is the column date
    @ColumnInfo(name = "subsector ")
    var Subsector : String,

    @ColumnInfo(name = " sector ")
    var  Sector : String,

    @ColumnInfo(name = " beach ")
    var  Beach : String,

    @ColumnInfo(name = " area ")
    var  Area : String,

    @ColumnInfo(name = " date ")
    var  Date : String,
) {

    @PrimaryKey(autoGenerate = true)//a userid is the primary key that will be automatically generated
    @ColumnInfo(name = "id")
    var Id: Int? = null

}




//class MorningSurveyTable {
//    var photo_id: String? = null
//    var comments: String? = null
//    var tags: String? = null
//    var gps_longitude = 0.0
//    var gps_latitude = 0.0
//    var non_nesting_attempts = 0
//    var track_type: String? = null
//    var distance_to_sea = 0
//    var nest = 0
//    var emergence_event: String? = null
//    var subsector: String? = null
//    var sector: String? = null
//    var beach: String? = null
//    var area: String? = null
//    var date: String? = null
//    var id = 0
//}