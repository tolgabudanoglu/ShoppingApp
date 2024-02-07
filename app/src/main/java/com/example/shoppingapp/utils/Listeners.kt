package com.example.shoppingapp.utils

import android.view.View
import androidx.navigation.Navigation
import com.example.shoppingapp.R

object Listeners {

    fun loginToRegister(view: View):View{
        Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_registerFragment)
        return view
    }
    fun registerToLogin(view: View):View{
        Navigation.findNavController(view).navigate(R.id.action_registerFragment_to_loginFragment)
        return view
    }

}