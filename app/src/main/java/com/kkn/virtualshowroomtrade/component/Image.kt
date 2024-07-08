package com.kkn.virtualshowroomtrade.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun ImageSwitcher(images: List<Painter>, switchInterval: Long = 1000L) {
    var currentIndex by remember { mutableStateOf(0) }

    LaunchedEffect(key1 = currentIndex) {
        delay(switchInterval)
        currentIndex = (currentIndex + 1) % images.size
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .size(370.dp, 200.dp),
//            .align(Alignment.Center),
        contentAlignment = Alignment.Center,
//        shape = RoundedCornerShape(16.dp) // Corner radius
    ) {
        Image(
            painter = images[currentIndex],
            contentDescription = null,
            modifier = Modifier.size(380.dp, 200.dp),
        )
    }
}
