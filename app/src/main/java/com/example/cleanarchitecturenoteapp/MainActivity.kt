package com.example.cleanarchitecturenoteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.cleanarchitecturenoteapp.ui.theme.CleanArchitectureNoteAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CleanArchitectureNoteAppTheme {

            }
        }
    }
}
