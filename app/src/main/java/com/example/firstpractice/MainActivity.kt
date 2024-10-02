package com.example.firstpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstpractice.ui.theme.FirstPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ThreeColors()
            FourColors()


        }
    }
}

@Composable
fun ThreeColors() {
    Surface(modifier = Modifier.background(color = Color.White).fillMaxSize()) {
        Row(verticalAlignment = Alignment.Top, horizontalArrangement = Arrangement.Start) {
            Box(modifier = Modifier.fillMaxWidth().height(425.dp).background(color = Color.Red)){

            }
        }
        Row(verticalAlignment = Alignment.Bottom) {
           Column(verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.Start) {
               Box (modifier = Modifier

                   .width(196.dp)
                   .height(425.dp)
                   .background(color = Color.Blue)
                   ){

               }
           }
            Column(verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.End) {
                Box (modifier = Modifier

                    .width(196.dp)
                    .height(425.dp)
                    .background(color = Color.Green)
                ){

                }}

        }

    }



}


@Composable
fun FourColors() {
    Surface(modifier = Modifier.background(color = Color.White).fillMaxSize()) {
        Row(verticalAlignment = Alignment.Top) {
            Column(verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.Start) {
                Box (modifier = Modifier

                    .width(196.dp)
                    .height(425.dp)
                    .background(color = Color.Blue)
                ){

                }
            }

            Column(verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.End) {
                Box (modifier = Modifier

                    .width(196.dp)
                    .height(425.dp)
                    .background(color = Color.Green)
                ){

                }
            }

        }
        Row(verticalAlignment = Alignment.Bottom) {
            Column(verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.Start) {
                Box (modifier = Modifier

                    .width(196.dp)
                    .height(425.dp)
                    .background(color = Color.Red)
                ){

                }
            }
            Column(verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.End) {
                Box (modifier = Modifier

                    .width(196.dp)
                    .height(425.dp)
                    .background(color = Color.Yellow)
                ){

                }
            }
        }
    }
}

@Composable
@Preview
fun AppPreview(){
    ThreeColors()

}
@Composable
@Preview
fun AppPreview1(){
    FourColors()

}