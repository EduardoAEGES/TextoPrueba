package com.miempresa.texto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Textito()
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun Textito(){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Texto en Compose",
            color = Color.Blue,

            )
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color(12, 28, 121, 255))
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "")
                Text(text = "Agregar")
        }

        Image(painter = painterResource(id = R.drawable.imagennueva), contentDescription = "")
        Spacer(modifier = Modifier.height(20.dp))
        Card(
            modifier= Modifier.size(80.dp),
            shape = CircleShape,
            elevation = CardDefaults.cardElevation(8.dp)
        ) {
            Image(painter = rememberAsyncImagePainter(
                "https://i.pinimg.com/474x/af/e1/32/afe13258ac46e8f96d7aa68357fbcab4.jpg"),
                contentDescription = "",
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(
            modifier= Modifier.size(150.dp),
            shape = RectangleShape,
            elevation = CardDefaults.cardElevation(5.dp)
        ) {
            AsyncImage(
                model = "https://lafrikileria.com/blog/wp-content/uploads/2022/02/aniversario-dragon-ball-886x506.jpg",
                contentDescription = "Translated description of what the image contains",
                contentScale = ContentScale.FillBounds
            )
        }


    }

}