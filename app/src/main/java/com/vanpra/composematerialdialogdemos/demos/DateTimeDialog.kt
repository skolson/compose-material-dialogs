package com.vanpra.composematerialdialogdemos.demos

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import com.vanpra.composematerialdialogdemos.DialogAndShowButton
import com.vanpra.composematerialdialogs.datetime.ViewPager

//import com.vanpra.composematerialdialogdemos.DialogAndShowButton
//import com.vanpra.composematerialdialogs.datetime.datepicker
//import com.vanpra.composematerialdialogs.datetime.datetimepicker
//import com.vanpra.composematerialdialogs.datetime.timepicker

/**
 * @brief Date and Time Picker Demos
 */
@Composable
fun DateTimeDialogDemo() {
//    DialogAndShowButton(buttonText = "Time Picker Dialog") {
//        title("Select a time", center = true)
//        timepicker()
//    }
//
    DialogAndShowButton(buttonText = "Date Picker Dialog") {
//        title("Select a date", center = true)
//        datepicker()

        ViewPager {
            Text(index.toString(), style = TextStyle(color = MaterialTheme.colors.onBackground))
        }
    }
//
//    DialogAndShowButton(buttonText = "Date and Time Picker Dialog") {
//        // Date time picker has a custom title as it needs to show a back icon
//        datetimepicker("Select a date and time")
//    }
}

fun datepicker() {
    TODO("Not yet implemented")
}
