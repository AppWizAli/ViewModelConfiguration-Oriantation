package com.socialmarkaz.callbackhandlingviewmodel

import androidx.lifecycle.ViewModel

class ViewModelclass:ViewModel() {



    var counter=0
    fun getcurrentcounter():Int{
        return counter
    }

    fun updatecounter():Int
    {
        return ++counter
    }
}