package com.abdo.task4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Repo(modifier: Modifier=Modifier){
    Row (
        Modifier.fillMaxWidth()
            .background(Color.Gray)
            .padding(horizontal = 8.dp)
            .padding(top = 8.dp)
            .background(
                color = Color.White,
                shape = RoundedCornerShape(12.dp)
            )
    ) {
        Image(
            modifier= Modifier.size(50.dp)
                .padding(top = 8.dp, start = 8.dp)
                .clip(shape = CircleShape),

            painter = painterResource(R.drawable.ic_issues),
            contentDescription = null
        )

        Column (
            Modifier.padding((10.dp))
        ){
            Row {
                Text(
                    modifier = Modifier.weight(1f),
                    text = "Bump payarrow from 7 ...",
                    fontWeight = FontWeight.Bold,
                    maxLines=1,
                    overflow=TextOverflow.Ellipsis)
                Text(text = "Open")


            }
            Spacer(Modifier.height(8.dp))
            Text(text = "NONE")
            Spacer(Modifier.height(8.dp))
            Row{
                Text(
                    text = "Created At:",
                    fontWeight = FontWeight.Bold)
                Text(" 2023-11-9,23:0 PM")
            }


        }
    }
}
@Preview(showBackground = true)
@Composable
private fun PrevieWitem(){
    Repo()
}