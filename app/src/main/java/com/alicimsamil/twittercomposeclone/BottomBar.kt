package com.alicimsamil.twittercomposeclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.alicimsamil.twittercomposeclone.ui.theme.TwitterWhite

class BottomBar {
    
    
    
    
    
    @Composable
    fun TwitterBottomBar(){


        BottomAppBar(backgroundColor = TwitterWhite) {

            Spacer(modifier = Modifier.weight(0.4f))
            Image( painter = painterResource(id = R.drawable.twitterhome), contentDescription = "home", Modifier.size(35.dp) )
            Spacer(modifier = Modifier.weight(1f))
            Image( painter = painterResource(id = R.drawable.twittersearch), contentDescription = "search" ,Modifier.size(35.dp))
            Spacer(modifier = Modifier.weight(1f))
            Image( painter = painterResource(id = R.drawable.twitterbell), contentDescription = "bell" ,Modifier.size(35.dp))
            Spacer(modifier = Modifier.weight(1f))
            Image( painter = painterResource(id = R.drawable.twitterchat), contentDescription = "chat" ,Modifier.size(30.dp))
            Spacer(modifier = Modifier.weight(0.4f))

        }
        
        
    }
    
    
    
}