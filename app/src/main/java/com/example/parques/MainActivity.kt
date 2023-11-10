package com.example.parques

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.parques.ui.theme.ParquesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ParquesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ParchisBoard()
                }
            }
        }
    }
}

@Composable
fun ParchisBoard() {
    Row(

    ) {
        Column {
            Column(
            ) {
                Box(
                    modifier = Modifier
                        .width(120.dp)
                        .height(120.dp)
                        .background(Color.Blue)
                ) {

                }
                repeat(3) {
                    Row(
                    ) {
                        repeat(8) {
                            Box(
                                modifier = Modifier
                                    .width(15.dp)
                                    .height(45.dp)
                                    .border(0.5.dp, Color.Black, RectangleShape)
                                    .background(Color.Blue)
                            ) {

                            }
                        }
                    }
                }
                Box(
                    modifier = Modifier
                        .width(120.dp)
                        .height(120.dp)
                        .background(Color.Blue)
                ) {

                }
            }
        }
        Column(
        ){
            repeat(8) {
                Row(
                ) {
                    repeat(3) {
                        Box(
                            modifier = Modifier
                                .width(45.dp)
                                .height(15.dp)
                                .border(0.5.dp, Color.Black, RectangleShape)
                                .background(Color.Blue)
                        ) {

                        }
                    }
                }
            }
            Box(
                modifier = Modifier
                    .width(135.dp)
                    .height(135.dp)
                    .background(Color.Blue)
            ) {

            }
            repeat(8) {
                Row(
                ) {
                    repeat(3) {
                        Box(
                            modifier = Modifier
                                .width(45.dp)
                                .height(15.dp)
                                .border(0.5.dp, Color.Black, RectangleShape)
                                .background(Color.Blue)
                        ) {

                        }
                    }
                }
            }
        }
        Column {
            Column(
            ) {
                Box(
                    modifier = Modifier
                        .width(120.dp)
                        .height(120.dp)
                        .background(Color.Blue)
                ) {

                }
                repeat(3) {
                    Row(
                    ) {
                        repeat(8) {
                            Box(
                                modifier = Modifier
                                    .width(15.dp)
                                    .height(45.dp)
                                    .border(0.5.dp, Color.Black, RectangleShape)
                                    .background(Color.Blue)
                            ) {

                            }
                        }
                    }
                }
                Box(
                    modifier = Modifier
                        .width(120.dp)
                        .height(120.dp)
                        .background(Color.Blue)
                ) {

                }
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun ParchisBoardPreview() {
    ParchisBoard()
}