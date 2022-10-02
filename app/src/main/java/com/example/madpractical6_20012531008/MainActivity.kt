package com.example.madpractical6_20012531008


import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.WindowCompat
import com.example.madpractical6_20012531008.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        videoplayer()
        binding.btnSwitch.setOnClickListener{
            Intent(this,YoutubeActivity::class.java).also {startActivity(it)}
        }
    }
    private fun videoplayer(){
        val mediacontroller = MediaController(this)
        val uri:Uri = Uri.parse("android.resource://"+packageName+"/"+R.raw.thestoryoflight)
        binding.myvideoview.setMediaController(mediacontroller)
        // mediacontroller.setVolumeTo(binding.myvideoview)
        mediacontroller.setAnchorView(binding.myvideoview)
        binding.myvideoview.setVideoURI(uri)
        binding.myvideoview.requestFocus()
        binding.myvideoview.start()
    }
}