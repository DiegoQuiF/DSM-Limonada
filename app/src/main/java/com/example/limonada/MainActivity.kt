package com.example.limonada

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.limonada.ui.theme.LimonadaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LimonadaTheme {
                LimonadaApp()
            }
        }
    }
}

@Composable
fun LimonadaApp() {
    var paso by remember {
        mutableStateOf(1)
    }
    var veces = (2..4).random()
    var total = 0
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        when (paso) {
            1 -> Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier.fillMaxSize()
            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth(1F)
                        .fillMaxHeight(0.08F)
                        .background(Color(0xFFFFEB3B))
                ) {
                    Text(
                        text = "Limonada",
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp
                    )
                }
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxHeight(1F)
                        .fillMaxWidth(1F)
                ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .width(240.dp)
                            .height(240.dp)
                            .background(
                                color = Color(0xFF98FB98),
                                shape = RoundedCornerShape(40.dp)
                            )
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.lemon_tree),
                            contentDescription = "Arbol de limonada",
                            modifier = Modifier
                                .wrapContentSize()
                                .clickable {
                                    paso = 2
                                }
                        )
                    }
                    Text(
                        text = "Toca el árbol para tomar un limón",
                        modifier = Modifier.padding(25.dp),
                        fontWeight = FontWeight.Bold,
                        fontSize = 17.sp,
                        color = Color(0xDD333333)
                    )
                }
            }

            2 -> Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier.fillMaxSize()
            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth(1F)
                        .fillMaxHeight(0.08F)
                        .background(Color(0xFFFFEB3B))
                ) {
                    Text(
                        text = "Limonada",
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp
                    )
                }
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxHeight(1F)
                        .fillMaxWidth(1F)
                ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .width(240.dp)
                            .height(240.dp)
                            .background(
                                color = Color(0xFF98FB98),
                                shape = RoundedCornerShape(40.dp)
                            )
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.lemon_squeeze),
                            contentDescription = "Limón",
                            modifier = Modifier
                                .wrapContentSize()
                                .clickable {
                                    total++
                                    if(total == veces){
                                        total = 0
                                        veces = (2..4).random()
                                        paso = 3
                                    }
                                }
                        )
                    }
                    Text(
                        text = "Toca el limón varias veces para exprimirlo",
                        modifier = Modifier.padding(25.dp),
                        fontWeight = FontWeight.Bold,
                        fontSize = 17.sp,
                        color = Color(0xDD333333)
                    )
                }
            }

            3 -> Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier.fillMaxSize()
            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth(1F)
                        .fillMaxHeight(0.08F)
                        .background(Color(0xFFFFEB3B))
                ) {
                    Text(
                        text = "Limonada",
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp
                    )
                }
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxHeight(1F)
                        .fillMaxWidth(1F)
                ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .width(240.dp)
                            .height(240.dp)
                            .background(
                                color = Color(0xFF98FB98),
                                shape = RoundedCornerShape(40.dp)
                            )
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.lemon_drink),
                            contentDescription = "Vaso lleno",
                            modifier = Modifier
                                .wrapContentSize()
                                .clickable {
                                    paso = 4
                                }
                        )
                    }
                    Text(
                        text = "Toca la bebida para tomarla",
                        modifier = Modifier.padding(25.dp),
                        fontWeight = FontWeight.Bold,
                        fontSize = 17.sp,
                        color = Color(0xDD333333)
                    )
                }
            }

            4 -> Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier.fillMaxSize()
            ) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth(1F)
                        .fillMaxHeight(0.08F)
                        .background(Color(0xFFFFEB3B))
                ) {
                    Text(
                        text = "Limonada",
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp
                    )
                }
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxHeight(1F)
                        .fillMaxWidth(1F)
                ) {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .width(240.dp)
                            .height(240.dp)
                            .background(
                                color = Color(0xFF98FB98),
                                shape = RoundedCornerShape(40.dp)
                            )
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.lemon_restart),
                            contentDescription = "Vaso vacío",
                            modifier = Modifier
                                .wrapContentSize()
                                .clickable {
                                    paso = 1
                                }
                        )
                    }
                    Text(
                        text = "Toca el vaso vacio para volver a empezar",
                        modifier = Modifier.padding(25.dp),
                        fontWeight = FontWeight.Bold,
                        fontSize = 17.sp,
                        color = Color(0xDD333333)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LimonadaTheme {
        LimonadaApp()
    }
}