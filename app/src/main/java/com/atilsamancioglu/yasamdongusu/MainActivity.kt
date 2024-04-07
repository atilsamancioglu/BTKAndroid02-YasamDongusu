package com.atilsamancioglu.yasamdongusu

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.atilsamancioglu.yasamdongusu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        println("onCreate çalıştırıldı")
    }

    override fun onStart() {
        super.onStart()
        println("onStart çalıştırıldı")
    }

    override fun onResume() {
        super.onResume()
        println("onResume çalıştırıldı")

    }

    override fun onPause() {
        super.onPause()
        println("onPause çalıştırıldı")

    }

    override fun onStop() {
        super.onStop()
        println("onStop çalıştırıldı")

    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy çalıştırıldı")

    }

    fun sonrakiSayfa(view : View) {


        val intent = Intent(this,SecondActivity::class.java)
        val kullaniciGirdisi = binding.editText.text.toString()
        intent.putExtra("isim",kullaniciGirdisi)
        startActivity(intent)


        //finish()

        //binding.textView.text = "İsim: ${kullaniciGirdisi}"
    }



}