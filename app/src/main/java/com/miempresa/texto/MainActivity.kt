package com.miempresa.texto

import android.graphics.ColorSpace
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.ImageBitmapConfig
import androidx.compose.ui.graphics.colorspace.ColorSpaces
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun Textito(){
    Column {
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
    }

}