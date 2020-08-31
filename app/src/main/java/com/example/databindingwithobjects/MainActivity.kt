package com.example.databindingwithobjects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingwithobjects.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.student = getStudent()

        //val student: Student = getStudent()
        //binding.nameText.text = student.name
        //binding.emailText.text = student.email
    }

    private fun getStudent(): Student{
        return Student(1, "Dinesh", "DannyNanda76@gmail.com")
    }
}