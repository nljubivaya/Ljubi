import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.myapplication.R




/*class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Start()
            Second()
        }
    }
}*/


@Preview
@Composable
fun Start() {
    Box(
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        Color(161, 202, 255),
                        Color(77, 156, 255),
                        Color(161, 202, 255)
                    ),
                    start = Offset(0f, Float.POSITIVE_INFINITY),
                    end = Offset(Float.POSITIVE_INFINITY, 0f)
                )
            )
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(116, 200, 228),
                        Color(115, 213, 188),
                        Color(116, 200, 228)
                    )
                )
            )
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(98, 105, 240).copy(alpha = 0.05f),
                        Color(55, 64, 245).copy(alpha = 0.65f),
                        Color(34, 84, 245).copy(alpha = 1f),
                        Color(55, 64, 245,).copy(alpha = 0.65f),
                        Color(98, 105, 240,).copy(alpha = 0.05f)
                    )
                )
            )
    ) {
        Canvas(modifier = Modifier
            .fillMaxSize()
            .blur(radius = 100.dp))
        {
            drawCircle(color = Color(0xFF4460C1), radius = 500f, center = Offset(80f, 100f))
            drawCircle(color = Color(0xFF4460C1), radius = 500f, center = Offset(1000f, 2350f))
        }
        Column(
            modifier = Modifier.fillMaxSize(2f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        )
        {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.width(263.dp)
            )
        }

    }
}


@Composable
@Preview(showBackground = true)
fun Second(/*navController: NavHostController*/) {
    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = "Пропустить", fontSize = 20.sp, color = Color(0xFF57A9FF),
                modifier = Modifier.padding(top = 30.dp, bottom = 50.dp, start = 25.dp)
            )
            Image(painter = painterResource(id = R.drawable.plus), contentDescription = "", contentScale = ContentScale.FillWidth, modifier = Modifier.size(167.dp, 163.dp))
        }

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Анализы", fontSize = 20.sp, color = Color(0xFF00B712)            )
            Text(
                text = "Экспресс сбор и получение проб", fontSize = 14.sp, color = Color(0xFF939396),
                modifier = Modifier.padding(top = 33.dp)
            )
            Canvas(
                modifier = Modifier.fillMaxWidth()
            ) {
                drawCircle(color =  Color(0xFF57A9FF), radius = 25f, center = Offset(450f,200f))
                drawCircle(style = Stroke(3f),  color = Color(0xFF57A9FF), radius = 25f, center = Offset(550f,200f))
                drawCircle(style = Stroke(3f), color =  Color(0xFF57A9FF), radius = 25f, center = Offset(650f,200f))
            }        }
        Column (
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Column(modifier = Modifier.fillMaxSize(2f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center)            {
                Image(painter = painterResource(id = R.drawable.analyzi), contentDescription = "", contentScale = ContentScale.FillWidth, modifier = Modifier.width(263.dp))
            }
        }
    }}

@Composable
@Preview(showBackground = true)
fun Third(/*navController: NavHostController*/) {
    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = "Пропустить", fontSize = 20.sp, color = Color(0xFF57A9FF),
                modifier = Modifier.padding(top = 30.dp, bottom = 50.dp, start = 25.dp)
            )
            Image(painter = painterResource(id = R.drawable.plus), contentDescription = "", contentScale = ContentScale.FillWidth, modifier = Modifier.size(167.dp, 163.dp))
        }

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Уведомления", fontSize = 20.sp, color = Color(0xFF00B712)            )
            Text(
                text = "Вы быстро узнаете о результатах ", fontSize = 14.sp, color = Color(0xFF939396),
                modifier = Modifier.padding(top = 33.dp)
            )
            Canvas(
                modifier = Modifier.fillMaxWidth()
            ) {
                drawCircle(style = Stroke(3f), color =  Color(0xFF57A9FF), radius = 25f, center = Offset(450f,200f))
                drawCircle(color =  Color(0xFF57A9FF), radius = 25f, center = Offset(550f,200f))
                drawCircle(style = Stroke(3f), color =  Color(0xFF57A9FF), radius = 25f, center = Offset(650f,200f))
            }        }
        Column (
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Column(modifier = Modifier.fillMaxSize(2f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center)            {
                Image(painter = painterResource(id = R.drawable.yvedomlenia), contentDescription = "", contentScale = ContentScale.FillWidth, modifier = Modifier.width(263.dp))
            }
        }
    }}

@Composable
@Preview(showBackground = true)
fun Monitoring(/*navController: NavHostController*/) {
    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = "Пропустить", fontSize = 20.sp, color = Color(0xFF57A9FF),
                modifier = Modifier.padding(top = 30.dp, bottom = 50.dp, start = 25.dp)
            )
            Image(painter = painterResource(id = R.drawable.plus), contentDescription = "", contentScale = ContentScale.FillWidth, modifier = Modifier.size(167.dp, 163.dp))
        }

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Мониторинг", fontSize = 20.sp, color = Color(0xFF00B712)            )
            Text(
                text = "Наши врачи всегда наблюдают", fontSize = 14.sp, color = Color(0xFF939396),
                modifier = Modifier.padding(top = 33.dp)
            )
            Text(
                 text = "за вашими показателями здоровья", fontSize = 14.sp, color = Color(0xFF939396),
                modifier = Modifier.padding(top = 3.dp)
            )
            Canvas(
                modifier = Modifier.fillMaxWidth()
            ) {
                drawCircle(style = Stroke(3f),  color = Color(0xFF57A9FF), radius = 25f, center = Offset(450f,200f))
                drawCircle(style = Stroke(3f),  color = Color(0xFF57A9FF), radius = 25f, center = Offset(550f,200f))
                drawCircle(color =  Color(0xFF57A9FF), radius = 25f, center = Offset(650f,200f))
            }        }
        Column (
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Column(modifier = Modifier.fillMaxSize(2f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center)            {
                Image(painter = painterResource(id = R.drawable.monitorind), contentDescription = "", contentScale = ContentScale.FillWidth, modifier = Modifier.width(263.dp))

            }
        }
    }}
/*@Composable
fun buttonColors(
    backgroundColor: Color = MaterialTheme.colors.primary,
    contentColor: Color = contentColorFor(backgroundColor),
    disabledBackgroundColor: Color = MaterialTheme.colors.onSurface.copy(alpha = 0.12f)
        .compositeOver(MaterialTheme.colors.surface),
    disabledContentColor: Color = MaterialTheme.colors.onSurface
        .copy(alpha = ContentAlpha.disabled)
): @Composable ButtonColors {
}*/

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

@Composable
@Preview(showBackground = true)
fun hello1(/*navController: NavHostController*/) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
}
