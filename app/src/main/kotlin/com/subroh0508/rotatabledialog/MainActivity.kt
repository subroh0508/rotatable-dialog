package com.subroh0508.rotatabledialog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.subroh0508.core.Sample

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        Sample.build(this).show()
    }
}
