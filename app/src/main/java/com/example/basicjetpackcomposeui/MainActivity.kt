package com.example.basicjetpackcomposeui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Draw
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.engine.geometry.Offset
import androidx.ui.foundation.DrawImage
import androidx.ui.graphics.Paint
import androidx.ui.graphics.imageFromResource
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            myStoryBoard()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun myStoryBoard() {
    val image = +imageResource(R.drawable.profile_pic)
    Column(
            modifier = Spacing(10.dp, 15.dp, 0.dp, 0.dp)
    ) {
        Container(modifier = Height(180.dp) wraps Expanded) {
            DrawImage(image)
        }



        Text("Imtiaz Uddin Ahmed")
        Text("Software Engineer at Portonics Ltd")
    }
}

@Preview
@Composable
fun DefaultPreview() {
    myStoryBoard()
}