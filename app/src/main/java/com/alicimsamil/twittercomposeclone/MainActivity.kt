package com.alicimsamil.twittercomposeclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.alicimsamil.twittercomposeclone.ui.theme.TwitterComposeCloneTheme
import com.alicimsamil.twittercomposeclone.ui.theme.TwitterWhite

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MainScreen()
        }
    }
}


@Composable
fun MainScreen(){

    TwitterComposeCloneTheme {
        Surface(color = TwitterWhite) {

            Scaffold(bottomBar = { BottomBar().TwitterBottomBar() }) {

            }
        }
    }




}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}