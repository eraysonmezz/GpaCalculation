package com.example.ilkprojekurulum

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ilkprojekurulum.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonHesapla.setOnClickListener {
            if(binding.editTextNumber1.text.isNotEmpty()&&binding.editTextNumber2.text.isNotEmpty()){
                var sinav1=binding.editTextNumber1.text.toString().toInt()
                var sinav2=binding.editTextNumber2.text.toString().toInt()
                var ortalama:Double=(sinav1+sinav2)/2.toDouble()
                if(ortalama>=50){
                    binding.sonucText.text = ortalama.toString()+" "+"Geçtiniz"
                    binding.sonucText.setTextColor(getColor(R.color.green))
                }
                else{
                    binding.sonucText.text = ortalama.toString()+" "+"Kaldınız"
                    binding.sonucText.setTextColor(getColor(R.color.red))
                }
            }
            else{
                binding.sonucText.text="Sınav Notunuzu Giriniz"
                binding.sonucText.setTextColor(getColor(R.color.red))
            }
        }
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

    }
}