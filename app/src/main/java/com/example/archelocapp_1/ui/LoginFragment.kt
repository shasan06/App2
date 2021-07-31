package com.example.archelocapp_1.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.archelocapp_1.databinding.ActivityMainBinding
import com.example.archelocapp_1.viewmodels.LoginViewModel

class LoginFragment  : Fragment() {

    private val TAG = "LoginFragment"
    private lateinit var binding: ActivityMainBinding
    private val loginViewModel: LoginViewModel by viewModels()
    //private val context: Context
    //lateinit var context: Context

    lateinit var strUsername: String
    lateinit var strPassword: String



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ActivityMainBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init(view)

    }

    private fun init(view: View) {
        binding.arrowBtn.setOnClickListener {

            with(loginViewModel) {
//               var userName = binding.UsernameBtn.text.toString()
//                var password = binding.PasswordBtn.text.toString()
//                if (userName.isEmpty()) userName = "shasan06"
//                if (password.isEmpty()) password = "^dusk|FULL|HIGH^"

                strUsername = binding.UsernameBtn.text.toString().trim()
                strPassword = binding.PasswordBtn.text.toString().trim()

                if (strUsername.isEmpty()) {//if username is empty
                    binding.UsernameBtn.error = "Please enter the username"
                } else if (strPassword.isEmpty()) {//if password is empty
                    binding.PasswordBtn.error = "Please enter the password"
                } else {//if both the username and password is entered then navigate to the next page NewSurveyFragment
                    loginViewModel.insertData(
                        context = view.context,
                        username = strUsername,
                        password = strPassword
                    )
                    Toast.makeText(
                        view.context,
                        "Login Success",
                        Toast.LENGTH_SHORT
                    ).show()
                    findNavController().navigate(LoginFragmentDirections.actionLoginFragmentPopIncludingNewSurveyFragment())


//                loginViewModel.addNest("BLABLA")


                }
            }
        }

        }

    }




