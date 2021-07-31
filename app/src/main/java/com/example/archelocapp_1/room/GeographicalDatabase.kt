package com.example.archelocapp_1.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.archelocapp_1.Models.GeographicalDataTableModel



@Database(entities = arrayOf(GeographicalDataTableModel::class), version = 1, exportSchema = false)
abstract class GeographicalDatabase: RoomDatabase() {

    abstract fun geographicalDao() : DAOAccess

    companion object {

        @Volatile
        private var INSTANCE: GeographicalDatabase? = null

        fun getDataseClient(context: Context) : GeographicalDatabase {

            if (INSTANCE != null) return INSTANCE!!

            synchronized(this){

                INSTANCE = Room
                    .databaseBuilder(context, GeographicalDatabase::class.java, "GEOGRAPHICAL_DATABASE")
                    .fallbackToDestructiveMigration()
                    .build()

                return INSTANCE!!
            }
        }
    }


}