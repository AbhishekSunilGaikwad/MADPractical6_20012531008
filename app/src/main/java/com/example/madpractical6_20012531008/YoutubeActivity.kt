package com.example.madpractical6_20012531008


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import com.example.madpractical6_20012531008.databinding.ActivityMainBinding
import com.example.madpractical6_20012531008.databinding.ActivityYoutubeBinding

class YoutubeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityYoutubeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityYoutubeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        inityoutubeplayer()
        binding.btnSwitch.setOnClickListener {
            Intent(this,MainActivity::class.java).also {startActivity(it)}
        }
    }
    private val youtubeid ="XRRaB1tgXUQ"
    private fun inityoutubeplayer(){
        val webSettings: WebSettings = binding.youtube.settings
        webSettings.javaScriptEnabled=true
        webSettings.loadWithOverviewMode=true
        webSettings.useWideViewPort = true
        binding.youtube.loadUrl("https://www.youtube.com/embed/$youtubeid")
    }
}