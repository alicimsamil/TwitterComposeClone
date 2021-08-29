package com.alicimsamil.twittercomposeclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alicimsamil.twittercomposeclone.ui.theme.TwitterWhite

class TweetRow {

    @Preview
    @Composable
    fun TwitterTweetRow(){

        Row(modifier = Modifier.fillMaxSize().background(TwitterWhite).padding(10.dp)) {

            Image(
                painter = painterResource(id = R.drawable.profilepic),
                contentDescription = "profilePicture",
                modifier = Modifier
                    .clip(CircleShape)
                    .size(55.dp)
            )






        }










    }








}