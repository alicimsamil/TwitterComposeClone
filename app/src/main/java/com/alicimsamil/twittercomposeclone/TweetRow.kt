package com.alicimsamil.twittercomposeclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alicimsamil.twittercomposeclone.ui.theme.TwitterBlack
import com.alicimsamil.twittercomposeclone.ui.theme.TwitterDarkGray
import com.alicimsamil.twittercomposeclone.ui.theme.TwitterWhite

class TweetRow {

    @Preview
    @Composable
    fun TwitterTweetRow(){

        Row(modifier = Modifier
            .fillMaxSize()
            .background(TwitterWhite)
            .padding(10.dp)) {

            Image(
                painter = painterResource(id = R.drawable.profilepic),
                contentDescription = "profilePicture",
                modifier = Modifier
                    .clip(CircleShape)
                    .size(55.dp)
            )
            
            
            Spacer(modifier = Modifier.size(10.dp))
            
            
            Column() {
                
                Row() {
                    
                    Text(text = "Ali Şamil", fontWeight = FontWeight.Bold, fontSize = 14.sp, color = TwitterBlack)
                    
                    Spacer(modifier = Modifier.size(5.dp))
                    
                    Text(text = "@Alicimsamil", fontSize = 14.sp, color = TwitterDarkGray)

                    Spacer(modifier = Modifier.size(5.dp))

                    Text(text = "·", fontSize = 14.sp, color = TwitterDarkGray)

                    Spacer(modifier = Modifier.size(5.dp))
                    
                    Text(text = "11h", fontSize = 14.sp, color = TwitterDarkGray)
                    
                    
                }
                
                Row {
                    
                    Text(
                        text = "Sene 2021 adam çıkıyor 30 liralık eğitime bok atıp 10 euroluk eğitim satıyor. Büyük bir platformda neden eğitim vermiyorsunuz diye soruyolar çünkü soru soramıyosun efektif olmuyo diyor ama ama diyor işte biz bir yerde kurs verdik bunların da videoları duruyor isterseniz...",
                        fontSize = 14.sp,
                        color = TwitterBlack
                    )
                    
                    
                }
                
                
            }






        }










    }








}