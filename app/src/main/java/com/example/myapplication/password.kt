package com.example.myapplication

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun password(/*navController: NavHostController*/) {
    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Пропустить", fontSize = 15.sp, color = Color(0xFF57A9FF),
            modifier = Modifier.padding(top = 50.dp, start = 265.dp, bottom = 50.dp)
        )
        Text(
            text = "Создайте пароль", fontSize = 24.sp, fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 3.dp, start = 100.dp, bottom = 10.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Для защиты ваших персональных данных",
            fontSize = 15.sp,
            color = Color(0xFF7E7E9A),
            modifier = Modifier.padding(top = 3.dp, start = 50.dp,  bottom = 0.dp,),
            textAlign = TextAlign.Center
        )
        Canvas(
            modifier = Modifier.fillMaxWidth()
        )
        {
            drawCircle(style = Stroke(3f), color =  Color(0xFF57A9FF), radius = 25f, center = Offset(400f,200f))
            drawCircle(color =  Color(0xFF57A9FF), radius = 25f, center = Offset(500f,200f))
            drawCircle(style = Stroke(3f), color =  Color(0xFF57A9FF), radius = 25f, center = Offset(600f,200f))
            drawCircle(style = Stroke(3f), color =  Color(0xFF57A9FF), radius = 25f, center = Offset(700f,200f))
        }

    }
}