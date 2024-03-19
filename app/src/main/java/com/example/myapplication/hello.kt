package com.example.myapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun hello(/*navController: NavHostController*/) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 100.dp, start = 0.dp, end = 0.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Добро пожаловать!", fontSize = 24.sp, fontWeight = FontWeight.Bold
        )

        // Image(painter = painterResource(id = R.drawable.hi), contentDescription = "", contentScale = ContentScale.FillWidth, modifier = Modifier.size(32.dp, 32.dp))

    }
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(start = 30.dp, top = 100.dp)
    ) {
        //Spacer(modifier = Modifier.height(100.dp))
        /*Row(
            verticalAlignment = Alignment.CenterVertically
        ) {*/
        Image(
            painter = painterResource(id = R.drawable.hi),
            contentDescription = "",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.size(32.dp, 32.dp)
        )

    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 150.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Войдите, чтобы пользоваться функциями",
            fontSize = 15.sp,
            modifier = Modifier.fillMaxWidth(4f).padding(start = 30.dp, top = 10.dp),
            textAlign = TextAlign.Start
        )
        Text(
            text = "приложения",
            fontSize = 15.sp,
            modifier = Modifier.fillMaxWidth(4f).padding(start = 30.dp, top = 10.dp),
            textAlign = TextAlign.Start
        )

    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 300.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "    Вход по E-mail",
            fontSize = 15.sp,
            color = Color(0xFF7E7E9A),
            modifier = Modifier.fillMaxWidth(4f),
            textAlign = TextAlign.Start
        )
        /*TextField(value = "example@gmail.com", onValueChange = {},
             colors = TextFieldDefaults.outlinedTextFieldColors(
             focusedBorderColor= Color.Green,
             unfocusedBorderColor = Color.LightGray
             )*/
        // )


        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth(0.95f)
                .padding(top = 15.dp, start = 0.dp, end = 10.dp),
            shape = MaterialTheme.shapes.medium,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFC9D4FB),
                contentColor = Color.White

            )
        )
        {
            Text("Далее", fontSize = 25.sp)
        }
        //color = Color(0xFFC9D4FB)
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 600.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Или войдите с помощью", fontSize = 15.sp, color = Color(0xFF7E7E9A)
        )
        Button(

            onClick = {},
            border = BorderStroke(3.dp, Color.DarkGray),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black,
            )
        )
        {
            Text("Войти с Яндекс", fontSize = 25.sp)
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize(),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(" ")
    }

}