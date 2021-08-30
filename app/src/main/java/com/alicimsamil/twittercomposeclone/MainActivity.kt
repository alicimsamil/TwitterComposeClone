package com.alicimsamil.twittercomposeclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.alicimsamil.twittercomposeclone.model.TweetContent
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

    val contentList = arrayListOf<TweetContent>()
    contentList.add(TweetContent("Ali Şamil","@Alicimsamil","Crossfit Games izlerken kendimi Antik Yunan şenliklerinde gibi hissediyorum"))
    contentList.add(TweetContent("Ali Şamil","@Alicimsamil","Sene 2021 adam çıkıyor 30 liralık eğitime bok atıp 10 euroluk eğitim satıyor. Büyük bir platformda neden eğitim vermiyorsunuz diye soruyolar çünkü soru soramıyosun efektif olmuyo diyor ama ama diyor işte biz bir yerde kurs verdik bunların da videoları duruyor isterseniz..."))
    contentList.add(TweetContent("Ali Şamil","@Alicimsamil","...10 euro verin \"arşive sahip olun\". Hayır her şey okay de gitmişsin eğitim üzerine startup kurup milletin eğitimini bokluyosun. Aaa en iyisi bende gidip o büyük kurumlarda etik eğitimi vereyim 3 euro olsun ki onu da boklayıp almasınlar."))
    contentList.add(TweetContent("Ali Şamil","@Alicimsamil","orta doğu reflüdür"))
    contentList.add(TweetContent("Ali Şamil","@Alicimsamil","Nevşehir cilalı taş devrinde kalmış"))
    contentList.add(TweetContent("Ali Şamil","@Alicimsamil","Türk erkeklerinin gerçekten kendi kendilerini dolandırma potansiyeli var"))
    contentList.add(TweetContent("Ali Şamil","@Alicimsamil","Lütfen bana da 2jz swaplayın"))
    contentList.add(TweetContent("Ali Şamil","@Alicimsamil","karşı taraf çok çoğaldı aklımı tatilden çağırdım bilgisayar, klavye, monitor, zeka ve akıla yenileceksiniz"))
    contentList.add(TweetContent("Ali Şamil","@Alicimsamil","bir zamanlar öğrendiğim ve işime yaramaz sandığım teknolojilerin işime yaraması o kadar mutlu ediyor ki"))
    contentList.add(TweetContent("Ali Şamil","@Alicimsamil","Buglara yürüyor korkmuyorum"))


    TwitterComposeCloneTheme {
        Surface(color = TwitterWhite) {

            Scaffold(bottomBar = { BottomBar().TwitterBottomBar() }, topBar = {TopBar().TwitterTopBar()}) {

                LazyColumn{

                    items(contentList){ tweet ->

                        TweetRow().TwitterTweetRow(tweetContent = tweet)



                    }

                }

            }
        }
    }




}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}