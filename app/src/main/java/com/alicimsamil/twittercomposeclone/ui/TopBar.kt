package com.alicimsamil.twittercomposeclone.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.alicimsamil.twittercomposeclone.R
import com.alicimsamil.twittercomposeclone.ui.theme.TwitterWhite

class TopBar {



    @Composable
    fun TwitterTopBar(){

            TopAppBar(
                backgroundColor = TwitterWhite,
                contentPadding = PaddingValues(start = 15.dp,end = 45.dp)
            ) {


                    Image(
                        painter = painterResource(id = R.drawable.profilepic),
                        contentDescription ="profileImage",
                        Modifier
                            .clip(CircleShape)
                            .size(30.dp)
                    )

                    Spacer(modifier = Modifier.weight(1f))

                    Image(
                        painter = painterResource(id = R.drawable.twitterlogo),
                        contentDescription = "twitterLogo",
                        Modifier.size(30.dp)

                    )
                    Spacer(modifier = Modifier.weight(1f))


            }






    }
}