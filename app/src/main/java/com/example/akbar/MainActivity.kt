package com.example.akbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Design()
        }
    }
}

@Composable
fun Design() {
    val ubahText = remember { mutableListOf("Align Start") }
    val posisi = remember { mutableListOf(Arrangement.Start) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(50.dp),
            modifier = Modifier
                .padding(50.dp)
                .fillMaxWidth()
        ) {
            repeat(3){ index ->
                Row(
                    horizontalArrangement = when(index){
                        1 -> Arrangement.Center
                        2 -> Arrangement.End
                        else -> posisi[index]
                    },
                    modifier = Modifier
                        .fillMaxWidth()
//                        .border(1.dp, color = Color.Black)
                ) {
                    Text(
                        text = when (index) {
                            1 -> "Align Center"
                            2 -> "Align End"
                            else -> ubahText[index]
                        },
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = colorResource(R.color.orange)
                    )
                }
            }
        }
    }
}

@Composable
@Preview
fun Display() {
    Design()
}
