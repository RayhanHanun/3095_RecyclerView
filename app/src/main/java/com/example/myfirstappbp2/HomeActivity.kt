package com.example.myfirstappbp2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
// HAPUS import LinearLayoutManager
// import androidx.recyclerview.widget.LinearLayoutManager

// TAMBAHKAN import GridLayoutManager
import androidx.recyclerview.widget.GridLayoutManager

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val dataList = arrayListOf(
            Mahasiswa("Fahmi", "23.12.2973"),
            Mahasiswa("Yujin", "23.12.2978"),
            Mahasiswa("Chaewon", "23.12.2983"),
            Mahasiswa("Kazuha", "23.12.2889"),
            Mahasiswa("seolhyun", "23.12.2877")
        )
        val rv_mahasiswa: RecyclerView = findViewById(R.id.rv_mahasiswa)

        rv_mahasiswa.layoutManager = GridLayoutManager(this, 2)

        val adapter = MahasiswaAdapter(dataList)

        rv_mahasiswa.adapter = adapter
    }
}