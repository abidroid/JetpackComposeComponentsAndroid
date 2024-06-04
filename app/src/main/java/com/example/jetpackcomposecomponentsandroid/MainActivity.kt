package com.example.jetpackcomposecomponentsandroid

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Checkbox
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposecomponentsandroid.ui.theme.JetpackComposeComponentsAndroidTheme

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
                    //MyButtons(name = "My Buttons", modifier = Modifier.padding(innerPadding))
                    //MyTextFields(name = "My TextFields", modifier = Modifier.padding(innerPadding))
                    //Dmc(name = "Dmc", modifier = Modifier.padding(innerPadding))
                    //MyImages(name = "My Images", modifier = Modifier.padding(innerPadding))
                    //MyCheckboxes(name = "My Checkboxes", modifier = Modifier.padding(innerPadding))
                    //MyRadioButtons(name = "My RadioButtons", modifier = Modifier.padding(innerPadding))
                    //MySwitch(name = "My Switch", modifier = Modifier.padding(innerPadding))
                    MyDropdownMenu(name = "My DropdownMenu", modifier = Modifier.padding(innerPadding))
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

    var bgColor = remember {
        mutableStateOf(Color.White)
    }

    Column(
        modifier = Modifier
            .background(color = bgColor.value)
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
        Spacer(modifier = Modifier.size(10.dp))

        OutlinedButton(onClick = {
            bgColor.value = Color.Red
        }) {
            Text(text = "Red")
        }
        Spacer(modifier = Modifier.size(10.dp))

        OutlinedButton(onClick = {
            bgColor.value = Color.Green
        }) {
            Text(text = "Green")
        }

        Spacer(modifier = Modifier.size(10.dp))
        OutlinedButton(onClick = {
            bgColor.value = Color.Blue
        }) {
            Text(text = "Blue")
        }

        TextButton(onClick = {
            bgColor.value = Color.White
        }) {
            Text(text = "Not Registered Yet? Sign up")
        }
    }
}

@Composable
fun MyTextFields(name: String, modifier: Modifier = Modifier) {

    var tf = remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "TextFields")
        Spacer(modifier = Modifier.size(10.dp))
        TextField(
            value = tf.value, onValueChange = {
                tf.value = it
            },
            label = { Text(text = "Enter your name", color = Color.White) },
            modifier = Modifier.fillMaxWidth()

        )
    }
}

@Composable
fun Dmc(name: String, modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState() // Create a ScrollState

    var eng = remember {
        mutableStateOf("")
    }
    var urdu = remember {
        mutableStateOf("")
    }
    var math = remember {
        mutableStateOf("")
    }
    var science = remember {
        mutableStateOf("")
    }
    var gk = remember {
        mutableStateOf("")
    }

    var obtainedMarks = remember {
        mutableStateOf("")
    }

    var percentage = remember {
        mutableStateOf("")
    }

    var grade = remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .background(color = Color.White)
            .verticalScroll(scrollState),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(text = "DMC")
        Spacer(modifier = Modifier.size(10.dp))
        TextField(
            value = eng.value, onValueChange = { eng.value = it },
            label = { Text(text = "English") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.size(10.dp))
        TextField(
            value = urdu.value, onValueChange = { urdu.value = it },
            label = { Text(text = "Urdu") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.size(10.dp))
        TextField(
            value = math.value, onValueChange = { math.value = it },
            label = { Text(text = "Math") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.size(10.dp))
        TextField(
            value = science.value, onValueChange = { science.value = it },
            label = { Text(text = "Science") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.size(10.dp))
        TextField(
            value = gk.value, onValueChange = { gk.value = it },
            label = { Text(text = "GK") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.size(10.dp))

        Row {
            Button(onClick = {
                eng.value = ""
                urdu.value = ""
                math.value = ""
                science.value = ""
                gk.value = ""
            }, modifier = Modifier.weight(1f)) {
                Text(text = "Clear")
            }
            Spacer(modifier = Modifier.size(10.dp))
            Button(onClick = {

                val obtMarks: Int = eng.value.toInt() + urdu.value.toInt() + math.value.toInt() + science.value.toInt() + gk.value.toInt()
                obtainedMarks.value = obtMarks.toString()

                val per: Double = (obtMarks / 500.0) * 100
                percentage.value = per.toString()

                if (per >= 80) {
                    grade.value = "A"
                }

                if (per >= 70 && per < 80) {
                    grade.value = "B"
                }

                if (per >= 60 && per < 70) {
                    grade.value = "C"

                }

                if (per >= 40 && per < 60) {
                    grade.value = "D"

                }

                if (per < 40) {
                    grade.value = "Fail"
                }
            }, modifier = Modifier.weight(1f)) {
                Text(text = "Calculate")
            }

        }
        Spacer(modifier = Modifier.size(10.dp))
        Text(text = obtainedMarks.value)
        Spacer(modifier = Modifier.size(10.dp))
        Text(text = percentage.value)
        Spacer(modifier = Modifier.size(10.dp))
        Text(text = grade.value)

    }
}

@Composable
fun MyImages(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(10.dp)
    ) {

        Image(
            painter = painterResource(id = R.drawable.abid),
            contentDescription = "Abid",
            modifier = Modifier.size(200.dp)
        )

        Spacer(modifier = Modifier.size(10.dp))

        Image(
            painter = painterResource(id = R.drawable.indopak),
            contentDescription = "Pakistan India",
            modifier = Modifier.size(200.dp),
            contentScale = ContentScale.Fit,
            alignment = Alignment.Center
        )
    }
}

@Composable
fun MyCheckboxes(name: String, modifier: Modifier = Modifier) {

    val cricket = remember { mutableStateOf(false) }
    val hockey = remember { mutableStateOf(false) }
    val football = remember { mutableStateOf(false) }
    val basketball = remember { mutableStateOf(false) }
    val badminton = remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.size(10.dp))
        Text(
            text = "Hobbies",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.size(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Checkbox(checked = cricket.value, onCheckedChange = {
                cricket.value = it
            })
            Text(text = "Cricket")
        }
        Spacer(modifier = Modifier.size(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Checkbox(checked = hockey.value, onCheckedChange = {
                hockey.value = it
            })
            Text(text = "Hockey")
        }

        Spacer(modifier = Modifier.size(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Checkbox(checked = football.value, onCheckedChange = {
                football.value = it
            })
            Text(text = "Football")
        }

        Spacer(modifier = Modifier.size(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Checkbox(checked = basketball.value, onCheckedChange = {
                basketball.value = it
            })
            Text(text = "Basketball")
        }

        Spacer(modifier = Modifier.size(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Checkbox(checked = badminton.value, onCheckedChange = {
                badminton.value = it
            })
            Text(text = "Football")
        }
    }
}


@Composable
fun MyRadioButtons(name: String, modifier: Modifier = Modifier) {


    val radioOptions = listOf("Red", "Green", "Blue", "Orange")
    val colorsList = listOf(Color.Red, Color.Green, Color.Blue, Color.Yellow)
    val selectedIndex = remember { mutableIntStateOf(0) }
    val bgColor = remember {
        mutableStateOf(Color.White)
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = bgColor.value)
            .padding(10.dp)
    ) {

        Spacer(modifier = Modifier.size(70.dp))
        radioOptions.forEachIndexed { index, text ->

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
                    .clickable { // make the entire Row clickable
                        selectedIndex.value = index
                        bgColor.value = colorsList[index]
                    },
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = selectedIndex.value == index,
                    onClick = {
                        selectedIndex.value = index
                        bgColor.value = colorsList[index]
                    }
                )
                Text(text)
            }
        }

    }
}


@Composable
fun MySwitch(name: String, modifier: Modifier = Modifier) {
    val switchState = remember { mutableStateOf(false) }
    val iconToDisplay = remember { mutableStateOf(Icons.Outlined.FavoriteBorder) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.padding(30.dp))
        Text(text = "Switch")
        Icon(
            imageVector = iconToDisplay.value, contentDescription = "Favorite",
            modifier = Modifier.size(200.dp),
            tint = Color.Red
        )

        Spacer(modifier = Modifier.size(10.dp))
        Switch(checked = switchState.value, onCheckedChange = {
            switchState.value = it

            if (switchState.value) {
                iconToDisplay.value = Icons.Outlined.Favorite
            } else {
                iconToDisplay.value = Icons.Outlined.FavoriteBorder

            }
        })
    }
}

@Composable
fun MyDropdownMenu(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .background(color = Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text("Dropdown Button")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeComponentsAndroidTheme {
        //Greeting("Android")
        //MyLayouts(name = "Android")
        //MyAlignments(name = "Android", modifier = Modifier)
        //MyButtons(name = "My Buttons", modifier = Modifier)
        //MyTextFields(name = "My TextFields", modifier = Modifier)
        //Dmc(name = "Dmc")
        //MyImages(name = "My Images", modifier = Modifier)
        //MyCheckboxes(name = "My Checkboxes", modifier = Modifier)
        //MyRadioButtons(name = "My RadioButtons", modifier = Modifier)
        //MySwitch(name = "My Switch", modifier = Modifier)
        MyDropdownMenu(name = "My DropdownMenu", modifier = Modifier)

    }
}