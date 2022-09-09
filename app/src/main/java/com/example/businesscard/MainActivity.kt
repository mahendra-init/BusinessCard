package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                BusinessCard()
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Surface {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .background(color = Color.DarkGray)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 200.dp)
                    .padding(bottom = 150.dp)
                    ,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Image(painter = painterResource(R.drawable.android_logo), contentDescription = "",
                    modifier = Modifier
                        .height(120.dp)
                        .width(150.dp)
                        .fillMaxWidth())
                Text(text = stringResource(id = R.string.name), textAlign = TextAlign.Center, fontSize = 36.sp, color = Color.White, modifier = Modifier.fillMaxWidth())
                Text(text = stringResource(id = R.string.position), textAlign = TextAlign.Center, fontSize = 16.sp,color = Color(0xFF3ddc84), modifier = Modifier.fillMaxWidth())
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(align = Alignment.CenterVertically)
                    .padding(bottom = 40.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Divider(color = Color.White, modifier = Modifier
                    .fillMaxWidth()
                    .width(1.dp))
                Spacer(modifier = Modifier.height(5.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 40.dp)
                    ) {
                    Icon(Icons.Filled.Call, contentDescription = stringResource(id = R.string.contact_no), modifier = Modifier
                        .padding(end = 20.dp)
                        .height(32.dp)
                        .width(32.dp))
                    Text(text = stringResource(id = R.string.contact_no), color = Color.White)
                }
                Spacer(modifier = Modifier.height(5.dp))
                Divider(color = Color.White, modifier = Modifier
                    .fillMaxWidth()
                    .width(1.dp))
                Spacer(modifier = Modifier.height(5.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 40.dp)) {
                    Icon(Icons.Filled.Share, contentDescription = stringResource(id = R.string.shareid), modifier = Modifier
                        .padding(end = 20.dp)
                        .height(32.dp)
                        .width(32.dp))
                    Text(text = stringResource(id = R.string.shareid), color = Color.White)
                }
                Spacer(modifier = Modifier.height(5.dp))
                Divider(color = Color.White, modifier = Modifier
                    .fillMaxWidth()
                    .width(1.dp))
                Spacer(modifier = Modifier.height(5.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 40.dp)) {
                    Icon(Icons.Filled.Email, contentDescription = stringResource(id = R.string.email), modifier = Modifier
                        .padding(end = 20.dp)
                        .height(32.dp)
                        .width(32.dp))
                    Text(text = stringResource(id = R.string.email), color = Color.White)
                }
            }
        }
    }
}

@Preview(showBackground = true, name = "AppPreview")
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}