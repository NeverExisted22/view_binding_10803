package com.richard.view_binding_10803

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.richard.view_binding_10803.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding : ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val adapter = MainAdapter(TaskList.TaskList)
        binding?.taskRv?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}