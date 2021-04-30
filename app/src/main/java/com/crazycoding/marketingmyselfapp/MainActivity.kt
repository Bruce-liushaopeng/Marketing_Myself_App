package com.crazycoding.marketingmyselfapp //This is the package name

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_main.* //all our findID and declaring variables are be in this import

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)// we can only findviewbyid after the setContentView



        button_preview.setOnClickListener {
            onPreviewClicked()
        }
    }
    private fun onPreviewClicked(){
        val contactName = edit_text_contact_name.text.toString()
        val contactNumber = edit_text_contact_number.text.toString()
        val myDisplayName = edit_text_my_display_name.text.toString()
        val includeJunior = check_box_junior.isChecked //boolean variable
        val jobTitle = spinner_job_title.selectedItem?.toString() //put a question mark, we make this safe. if it null, then make the whole line be null
        val immediateStart = check_box_immediate_start.isChecked
        val startDate = edit_text_start_date.text.toString()

        val testString = "Contact Name: $contactName, Contact Number: $contactNumber, My Display Name: $myDisplayName, Include Junior: $includeJunior, Job Title: $jobTitle, Immediate Start: $immediateStart, Start Date: $startDate"

        Toast.makeText(this,testString,Toast.LENGTH_LONG).show()

    }
}
