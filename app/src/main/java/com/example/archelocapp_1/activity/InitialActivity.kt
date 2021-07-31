package com.example.archelocapp_1.activity

import android.Manifest.permission
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.archelocapp_1.R
import com.example.archelocapp_1.viewmodels.LoginViewModel

class InitialActivity : AppCompatActivity(R.layout.activity_initial){
    private  val TAG = "InitialActivity"

    lateinit var loginViewModel: LoginViewModel

    lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        context = this@InitialActivity

        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)


        ActivityCompat.requestPermissions(this, arrayOf(
                permission.CAMERA,
                permission.READ_EXTERNAL_STORAGE,
                permission.ACCESS_FINE_LOCATION,
                permission.ACCESS_COARSE_LOCATION
            ), 100)


    }

    override fun onBackPressed() {
        super.onBackPressed()

        Log.d(TAG, "onBackPressed: " + findNavController(R.id.fragment).currentDestination?.id)




    }



}