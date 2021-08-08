package com.kchienja.wallet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import com.kchienja.wallet.HomeScreen.MainHomeScreen
import com.kchienja.wallet.SplashScreen.SplashScreenLauncher
import com.kchienja.wallet.ui.theme.DeepBlue
import com.kchienja.wallet.ui.theme.WalletTheme

class MainActivity : ComponentActivity() {
    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            WalletTheme {
                MainScreenLaunch()
            }
        }
    }
}
@ExperimentalAnimationApi
@Composable
private fun MainScreenLaunch(){
    Surface(color = DeepBlue) {
        var showSplashScreen by remember { mutableStateOf(true)}

        if (showSplashScreen){
            SplashScreenLauncher(onTimeOut = { showSplashScreen = false })
        }else {
            MainHomeScreen()
        }
    }
}

