package com.example.composeone

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeone.ui.theme.ComposeOneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeOneTheme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(colorResource(id = R.color.mainBackgroundColor))
                        .padding(start = 15.dp, top = 28.dp)
                ){

                    Box(
                        modifier = Modifier
                            .background(Color.White, CircleShape)
                            .size(8.dp)
                    )

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 90.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Image(
                            modifier = Modifier
                                .size(90.dp)
                                .padding(bottom = 10.dp),
                            painter = painterResource(id = R.drawable.img),
                            contentDescription = null,
                        )
                        Text(
                            text = stringResource(id = R.string.text1),
                            color = Color.White,
                            fontSize = 29.sp,
                            fontWeight = FontWeight.SemiBold
                        )

                        Text(
                            modifier = Modifier.padding(start = 10.dp, end = 10.dp,bottom = 13.dp, top = 5.dp),
                            text = stringResource(id = R.string.textAnyThing) ,
                            color = colorResource(id = R.color.textColor),
                            fontSize = 14.sp,
                            textAlign = TextAlign.Center
                        )
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Box(
                                modifier = Modifier
                                    .padding(end = 6.dp)
                                    .background(Color.White, CircleShape)
                                    .size(8.dp)
                            )
                            Box(
                                modifier = Modifier
                                    .background(Color.White, CircleShape)
                                    .size(8.dp)
                            ){
                                Box(
                                    modifier = Modifier
                                        .background(
                                            colorResource(id = R.color.mainBackgroundColor),
                                            CircleShape
                                        )
                                        .size(6.dp)
                                        .align(Alignment.Center)
                                )
                            }
                        }

                        Button(
                            modifier = Modifier.padding(top = 85.dp),
                            shape = RoundedCornerShape(percent = 20),
                            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.buttonColor)),
                            onClick = {
                                Toast.makeText(this@MainActivity, "done", Toast.LENGTH_SHORT).show()
                            }
                        ) {
                            Text(
                                modifier = Modifier
                                    .padding(
                                        top = 14.dp,
                                        bottom = 14.dp,
                                        start = 40.dp,
                                        end = 40.dp
                                    )
                                    .clickable { },
                                text = stringResource(id = R.string.text4) ,
                                color = Color.White,
                                fontSize = 13.sp,
                            )
                        }

                    }
                    
                }
            }
        }
    }
}


