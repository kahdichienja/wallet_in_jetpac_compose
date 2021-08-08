package com.kchienja.wallet.HomeScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.kchienja.wallet.ui.theme.DeepBlue
import com.kchienja.wallet.ui.theme.TextWhite

@Composable
fun MainHomeScreen(){
    Surface(color = DeepBlue) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
            Text(text = "HomePage", color = TextWhite)
        }
    }


}