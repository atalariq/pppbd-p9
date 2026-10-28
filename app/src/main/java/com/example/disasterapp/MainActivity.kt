package com.example.disasterapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.disasterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapterDisaster = DisasterAdapter(generateDummy())

        with(binding) {
            rvDisaster.apply {
                adapter = adapterDisaster
                layoutManager = LinearLayoutManager(this@MainActivity)
            }
        }
    }

    fun generateDummy(): List<Disaster> {
        return listOf(
            Disaster(name = "Tsunami", type = "Natural"),
            Disaster(name = "Volcanic Eruption", type = "Natural"),
            Disaster(name = "Earthquake", type = "Natural"),
            Disaster(name = "Flood", type = "Natural"),
            Disaster(name = "Fire", type = "Natural"),
            Disaster(name = "Nuclear Accident", type = "Man-made "),
            Disaster(name = "Terrorist Attack", type = "Man-made "),
            Disaster(name = "War", type = "Man-made")
        )
    }
}