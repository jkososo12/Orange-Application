package com.example.akbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
    }
}

@Composable
fun Design(){
    Column {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.images)
                , contentDescription = "ini gambar",
                modifier= Modifier.size(30.dp)
            )
            Text("Chico Lachowski",
                color = colorResource(R.color.white)
            )
        }
        Image(
            painter = painterResource(id = R.drawable.img)
            , contentDescription = "ini gambar",
            modifier= Modifier.size(150.dp)
        )
    }
}
@Composable
@Preview
fun Display(){
    Design()
}