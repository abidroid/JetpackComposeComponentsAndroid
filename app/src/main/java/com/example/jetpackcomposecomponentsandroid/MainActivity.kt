package com.example.jetpackcomposecomponentsandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposecomponentsandroid.ui.theme.JetpackComposeComponentsAndroidTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeComponentsAndroidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
                    //MyLayouts(name = "Android", modifier = Modifier.padding(innerPadding))

                    //MyAlignments(name = "Android", modifier = Modifier.padding(innerPadding))
                    MyButtons(name = "My Buttons", modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {


}

@Composable
fun MyLayouts(name: String, modifier: Modifier = Modifier) {
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

@Composable
fun MyAlignments(name: String, modifier: Modifier) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {

        Text(
            text = "Welcome",
            color = Color.White,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            modifier = Modifier
                .background(color = Color.Red)
                .padding(10.dp)
        )
        Spacer(modifier = Modifier.size(10.dp))
        Text(
            text = "To",
            color = Color.White,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            modifier = Modifier
                .background(color = Color.Red)
                .padding(10.dp)
        )
        Spacer(modifier = Modifier.size(10.dp))

        Text(
            text = "Compose",
            color = Color.White,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            modifier = Modifier
                .background(color = Color.Red)
                .padding(10.dp)
        )
    }
}

@Composable
fun MyButtons(name: String, modifier: Modifier = Modifier) {

    var txt = remember {
        mutableStateOf("Hello World !!!")
    }

    Column(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = txt.value)
        Spacer(modifier = Modifier.size(10.dp))
        Button(onClick = {
            txt.value = "Pakistan Zindabad"
        }) {
            Text(text = "Submit")

        }



    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeComponentsAndroidTheme {
        //Greeting("Android")
        //MyLayouts(name = "Android")
        //MyAlignments(name = "Android", modifier = Modifier)
        MyButtons(name = "My Buttons", modifier = Modifier)
    }
}