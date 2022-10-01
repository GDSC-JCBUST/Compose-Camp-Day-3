package com.ai.game.composecampday3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ai.game.composecampday3.ui.theme.ComposeCampDay3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCampDay3Theme {
                // A surface container using the 'background' color from the theme
                DefaultPreview()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun TaskManager(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_task_completed),
            contentDescription = null
        )
        Text(
            text = "All Tasks Completed!",
            fontSize = 24.sp,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Nice Work.",
            fontSize = 16.sp
        )
    }
}

@Composable
fun GridApp(){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.weight(1.0f)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1.0f)
                    .background(Color.Green)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Text composable", fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp))
                Text(text = "Displays text and follows Material Design guidelines.", textAlign = TextAlign.Justify)
            }
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1.0f)
                    .background(Color.Yellow)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Image composable", fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp))
                Text(text = "Creates a composable that lays out and draws a given Painter class object", textAlign = TextAlign.Justify)
            }
        }
        Row(
            modifier = Modifier.weight(1.0f)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1.0f)
                    .background(Color.Cyan)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Row composable", fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp))
                Text(text = "A layout composable that places its children in a horizontal sequence.", textAlign = TextAlign.Justify)
            }
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1.0f)
                    .background(Color.LightGray)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Column composable", fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp))
                Text(text = "A layout composable that places its children in a vertical sequence.", textAlign = TextAlign.Justify)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeCampDay3Theme {
        GridApp()
    }
}