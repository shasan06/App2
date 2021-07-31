//package com.example.archelocapp_1.source.database
//
//import android.content.Context
//import androidx.room.Database
//import androidx.room.Room
//import androidx.room.RoomDatabase
//import com.example.archelocapp_1.source.database.dao.AppDao
//import com.example.archelocapp_1.source.database.entities.App
//import com.example.archelocapp_1.source.database.entities.SampleTable
//
//@Database(entities = arrayOf(App::class), version = 1)
//abstract class AppDatabase : RoomDatabase() {
//    abstract fun appdao(): AppDao
//
//
//    companion object {
//        private var appDatabase: AppDatabase? = null
//        fun getInstance(context: Context): AppDatabase {
//            if (appDatabase == null) {
//                appDatabase = Room.databaseBuilder(
//                    context,
//                    AppDatabase::class.java, "database"
//                )
//                    .fallbackToDestructiveMigration()
//                    .build()
//            }
//            return appDatabase!!;
//        }
//
//    }
//
//
//}