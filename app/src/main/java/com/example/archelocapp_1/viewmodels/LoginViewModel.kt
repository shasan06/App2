package com.example.archelocapp_1.viewmodels

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.archelocapp_1.Models.LoginTableModel
import com.example.archelocapp_1.repository.LoginRepository

//import kotlinx.coroutines.launch

class LoginViewModel : ViewModel() {

    var liveDataLogin: LiveData<LoginTableModel>? = null

    fun insertData(
        context: Context,
        username: String,
        password: String
    ) {
        LoginRepository.insertData(context, username, password)
    }

    fun getLoginDetails(context: Context, username: String) : LiveData<LoginTableModel>? {
        liveDataLogin = LoginRepository.getLoginDetails(context, username)
        return liveDataLogin
    }
}

////
////
//    private val TAG = "LoginViewModel"
//    private var repository = Repository()
//    private var isLogin = MutableLiveData<Boolean>(false)
//
//
//    fun get() = isLogin
//
//    fun login(userName: String, password: String, listener: AuthListener<Boolean>) {
//        viewModelScope.launch {
//            ServiceBuilder.KEY = ""
//            val data = repository.login(userName, password)
//            if (data.isSuccessful) {
//                listener.onSuccess(true)
//                val login = data.body() as LoginTableModel
//                ServiceBuilder.KEY = "Token ${login.key}"
//            } else {
//                listener.onSuccess(false)
//            }
//
//        }
//    }
//
//
//
//}

