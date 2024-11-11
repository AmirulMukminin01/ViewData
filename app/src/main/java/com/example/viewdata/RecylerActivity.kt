package com.example.viewdata

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.viewdata.BuahAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.viewdata.databinding.ActivityRecylerBinding

class RecylerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecylerBinding
    //deklarasi
    private var dataBuah = arrayOf("Alpukat","Durian","Jambu Air","Manggis","Strawberry")
        private var dataGambar= arrayOf(
            R.drawable.alpukat,
            R.drawable.durian,
            R.drawable.jambuair,
            R.drawable.manggis,
            R.drawable.strawberry)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecylerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //custom adapter, nnt dibuatkan constructor nnti akan di buat contrut di custom adpater
        val adapter = BuahAdapter(this, dataBuah, dataGambar)

        //buat layout manaager
        val layoutManager = LinearLayoutManager(applicationContext)

        //manggil listnya
        binding.recylerView.adapter = adapter
        binding.recylerView.layoutManager = layoutManager
    }
}