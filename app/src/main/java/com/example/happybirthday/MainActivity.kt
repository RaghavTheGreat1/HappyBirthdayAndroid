package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BirthdayGreetingText("Happy Birthday Android!", sender = "Raghav Joshi")
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingText(message: String, sender: String, modifier: Modifier = Modifier, ) {

    Column(
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(24.dp)
    ) {

        Text(
            text = message,
            modifier = modifier,
            fontSize = 48.sp,
            lineHeight = 58.sp,
            textAlign = TextAlign.Center,
        )
        Text(
            text = sender,
            modifier = modifier,
            fontSize = 24.sp,
            lineHeight = 29.sp,
            textAlign = TextAlign.End,
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BirthdayGreetingPreview() {
    HappyBirthdayTheme {
        BirthdayGreetingText("Happy Birthday Android!", sender = "Raghav Joshi",)
    }
}