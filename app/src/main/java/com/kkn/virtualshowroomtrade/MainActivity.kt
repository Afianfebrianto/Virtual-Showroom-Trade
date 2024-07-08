package com.kkn.virtualshowroomtrade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.kkn.virtualshowroomtrade.component.ImageSwitcher
import com.kkn.virtualshowroomtrade.ui.theme.VirtualShowroomTradeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VirtualShowroomTradeTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VirtualShowroomTradeTheme {
        Greeting("Android")
    }
}

@Composable
fun MainScreen() {
    ImageSwitcher(
        images = listOf(
            painterResource(R.drawable.image1),
            painterResource(R.drawable.image2),
            painterResource(R.drawable.image3)
        )
    )
}