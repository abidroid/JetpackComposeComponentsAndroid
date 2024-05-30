package com.example.jetpackcomposecomponentsandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecomponentsandroid.ui.theme.JetpackComposeComponentsAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeComponentsAndroidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Column {

        Row {
            Text(
                text = "Hello $name!",
                modifier = modifier
            )
            Text(
                text = "yes"
            )
        }

        Box(
            modifier = Modifier
                .background(color = Color.Red)
                .width(300.dp)
                .height(300.dp)
        ) {
            Box(
                modifier = Modifier
                    .background(color = Color.Green)
                    .width(200.dp)
                    .height(200.dp)
            ) {
                Box(
                    modifier = Modifier
                        .background(color = Color.Blue)
                        .width(100.dp)
                        .height(100.dp)
                ) {

                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeComponentsAndroidTheme {
        Greeting("Android")
    }
}