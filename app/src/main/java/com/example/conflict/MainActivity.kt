package com.example.conflict

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.conflict.ui.theme.ConflictTheme

class User{
    val userName = "ThaoLT"
    val date = "12/12"
    val address = "Hoai duc"
    val isHuman = true
    val age = 22
    val phoneNumber = "09123123"
    val email = "asgwaf@gmail.com"
    val password = "123123"
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
