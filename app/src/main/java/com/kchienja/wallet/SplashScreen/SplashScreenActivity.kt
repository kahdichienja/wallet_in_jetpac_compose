package com.kchienja.wallet.SplashScreen


import androidx.compose.animation.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kchienja.wallet.R
import kotlinx.coroutines.delay

private const val SplashWaitTime: Long = 4000

@ExperimentalAnimationApi
@Composable
fun SplashScreenLauncher(modifier: Modifier =Modifier, onTimeOut: () -> Unit) {
    var visible by remember { mutableStateOf(true) }
    AnimatedVisibility(
        visible = visible,
        enter = slideInVertically(),
        exit = slideOutHorizontally()
    ) {
    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        AnimatedVisibility(
            visible = visible,
            enter = expandIn(
                expandFrom = Alignment.Center,
            ),
            exit = slideOutHorizontally() + fadeOut()
        ) {
            val currentTmeOut by rememberUpdatedState(onTimeOut)

            LaunchedEffect(onTimeOut) {
                delay(SplashWaitTime)
                currentTmeOut()
            }
            Image(painterResource(R.drawable.r_bgcrypto_wallets), contentDescription = null)
        }
    }
}

}