package com.example.viewdata

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import java.util.Arrays
import com.example.viewdata.databinding.ActivityListviewBinding

class ListviewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var dataArray: Array<String> =
            resources.getStringArray(R.array.jurusan)
        Arrays.sort(dataArray)
        var adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, dataArray)
        binding.listView.adapter = adapter
    }
}