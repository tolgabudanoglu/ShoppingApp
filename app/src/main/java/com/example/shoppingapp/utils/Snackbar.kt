package com.example.shoppingapp.utils

import android.view.View
import androidx.core.content.ContextCompat
import com.example.shoppingapp.R
import com.google.android.material.snackbar.Snackbar

fun View.showSnackBar(message: String, isError: Boolean) {
    val snackBar = Snackbar.make(this, message, Snackbar.LENGTH_LONG)
    val snackBarView = snackBar.view

    snackBarView.setBackgroundColor(
        ContextCompat.getColor(
            context,
            if (isError) R.color.colorSnackBarError else R.color.colorSnackBarSuccess
        )
    )

    snackBar.show()
}