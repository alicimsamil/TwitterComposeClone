package com.alicimsamil.twittercomposeclone.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alicimsamil.twittercomposeclone.R
import com.alicimsamil.twittercomposeclone.model.TweetContent
import com.alicimsamil.twittercomposeclone.ui.theme.TwitterBlack
import com.alicimsamil.twittercomposeclone.ui.theme.TwitterDarkGray

class TweetRow {

    @Composable
    fun TwitterTweetRow(tweetContent: TweetContent){

        Row(tweetContent)


    }

    @Composable
    fun Row(tweetContent: TweetContent){


        Row(
            modifier = Modifier
                .padding(10.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.profilepic),
                contentDescription = "profilePicture",
                modifier = Modifier
                    .clip(CircleShape)
                    .size(55.dp)
            )


            Spacer(modifier = Modifier.size(10.dp))


            Column {

                Row {

                    Text(text = "${tweetContent.name}", fontWeight = FontWeight.Bold, fontSize = 14.sp, color = TwitterBlack)

                    Spacer(modifier = Modifier.size(5.dp))

                    Text(text = "${tweetContent.userName}", fontSize = 14.sp, color = TwitterDarkGray)

                    Spacer(modifier = Modifier.size(5.dp))

                    Text(text = "·", fontSize = 14.sp, color = TwitterDarkGray)

                    Spacer(modifier = Modifier.size(5.dp))

                    Text(text = "11h", fontSize = 14.sp, color = TwitterDarkGray)


                }

                Row {

                    Text(
                        text = "${tweetContent.content}",
                        fontSize = 14.sp,
                        color = TwitterBlack
                    )


                }

                Spacer(modifier = Modifier.size(5.dp))


                Row(
                    modifier = Modifier.fillMaxWidth().padding(end = 7.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.twittercomment),
                            contentDescription = "Comment Button",
                            Modifier.size(25.dp)
                        )

                        Spacer(modifier = Modifier.size(5.dp))

                        Text(text = "40", color = TwitterDarkGray)
                    }



                    Row {

                        Image(
                            painter = painterResource(id = R.drawable.twitterretweet),
                            contentDescription = "Retweet Button",
                            Modifier.size(25.dp)
                        )

                        Spacer(modifier = Modifier.size(5.dp))

                        Text(text = "1,069", color = TwitterDarkGray)

                    }



                    Row() {

                        Image(
                            painter = painterResource(id = R.drawable.twitterlike),
                            contentDescription = "Like Button",
                            Modifier.size(22.dp)
                        )

                        Spacer(modifier = Modifier.size(5.dp))


                        Text(text = "16.3K", color = TwitterDarkGray)


                    }




                    Image(
                        painter = painterResource(id = R.drawable.twittershare),
                        contentDescription = "Share Button",
                        Modifier.size(25.dp)
                    )


                }



            }






        }















    }





}