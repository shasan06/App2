package com.example.archelocapp_1.Models


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Nest")
data class NestTableModel (
    //this is the column for photo_id
    @ColumnInfo(name = "general_comments")
    var General_comments: String,

    //this is the column for comments
    @ColumnInfo(name = "excavation_comments")
    var Excavation_comments: String,

    //this is the column for number_of_eggs
    @ColumnInfo(name = "live_hatchlings_in_nest")
    var Live_hatchlings_in_nest: Int,

    //this is the column for distance_to_sea
    @ColumnInfo(name = "dead_hatchlings_in_nest")
    var Dead_hatchlings_in_nest: Int,

    //this is the column for bottom_of_nest_depth
    @ColumnInfo(name = "live_embryos_in_unhatched_eggs")
    var Live_embryos_in_unhatched_eggs: Int,

    //this is the column for top_egg_depth
    @ColumnInfo(name = "dead_embryos_in_unhatched_eggs_late ")
    var Dead_embryos_in_unhatched_eggs_late : Int,

    //this is the column for reason_for_relocation
    @ColumnInfo(name = "dead_embryos_in_unhatched_eggs_middle ")
    var Dead_embryos_in_unhatched_eggs_middle : Int,

    //this is the column relocated_to
    @ColumnInfo(name = "dead_embryos_in_unhatched_eggs_early ")
    var Dead_embryos_in_unhatched_eggs_early : Int,

    //this is the column end_time
    @ColumnInfo(name = "dead_embryos_in_unhatched_eggs_eye_spot ")
    var Dead_embryos_in_unhatched_eggs_eye_spot: Int,

    //this is the column start_time
    @ColumnInfo(name = "no_embryos_in_unhatched_eggs ")
    var No_embryos_in_unhatched_eggs : Int,

    //this is the column date
    @ColumnInfo(name = "pipped_live_hatchlings ")
    var Pipped_live_hatchlings : Int,

    @ColumnInfo(name = " pipped_dead_hatchlings ")
    var  Pipped_dead_hatchlings : Int,

    @ColumnInfo(name = " hatched_eggs ")
    var  Hatched_eggs : Int,

    @ColumnInfo(name = " excavation_bottom_of_nest_depth ")
    var  Excavation_bottom_of_nest_depth : Int,

    @ColumnInfo(name = " excavation_date ")
    var  Excavation_date : String,

    @ColumnInfo(name = " affected_by_light_pollution ")
    var  Affected_by_light_pollution : Boolean,

    @ColumnInfo(name = " predated_during_hatching ")
    var  Predated_during_hatching : Boolean,

    @ColumnInfo(name = " inundated_during_hatching ")
    var  Inundated_during_hatching : Boolean,

    @ColumnInfo(name = " date_of_last_hatching ")
    var  Date_of_last_hatching : String,

    @ColumnInfo(name = " date_of_first_hatching ")
    var  Date_of_first_hatching : String,

    @ColumnInfo(name = " predated_during_incubation ")
    var  Predated_during_incubation : Boolean,

    @ColumnInfo(name = " inundated_during_incubation ")
    var  Inundated_during_incubation : Boolean,

    @ColumnInfo(name = " protection_measures ")
    var  Protection_measures : String,

    @ColumnInfo(name = "   subsector ")
    var  Subsector : String,

    @ColumnInfo(name = "    sector ")
    var  Sector : String,

    @ColumnInfo(name = "    beach ")
    var  Beach : String,

    @ColumnInfo(name = "    nest_code ")
    var  Nest_code : String,

) {

    @PrimaryKey(autoGenerate = true)//a userid is the primary key that will be automatically generated
    @ColumnInfo(name = "id")
    var Id: Int? = null

}



//class NestTable {
//    var general_comments: String? = null

//    var excavation_comments: String? = null

//    var live_hatchlings_in_nest = 0

//    var dead_hatchlings_in_nest = 0

//    var live_embryos_in_unhatched_eggs = 0

//    var dead_embryos_in_unhatched_eggs_late = 0

//    var dead_embryos_in_unhatched_eggs_middle = 0

//    var dead_embryos_in_unhatched_eggs_early = 0

//    var dead_embryos_in_unhatched_eggs_eye_spot = 0

//    var no_embryos_in_unhatched_eggs = 0

//    var pipped_live_hatchlings = 0

//    var pipped_dead_hatchlings = 0

//    var hatched_eggs = 0

//    var excavation_bottom_of_nest_depth = 0

//    var excavation_date: String? = null

//    var affected_by_light_pollution = false

//    var predated_during_hatching = false

//    var inundated_during_hatching = false

//    var date_of_last_hatching: String? = null

//    var date_of_first_hatching: String? = null

//    var predated_during_incubation = false

//    var inundated_during_incubation = false

//    var protection_measures: String? = null

//    var subsector: String? = null

//    var sector: String? = null

//    var beach: String? = null

//    var nest_code: String? = null

//    var id = 0
//}