package com.example.dshop.screen.chooseScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.dshop.R
import com.example.dshop.ui.theme.Grey
import com.example.dshop.ui.theme.Pink2
import com.example.dshop.ui.theme.Typography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OffersItems(
    navController: NavController,
    image: Painter =painterResource(id = R.drawable.image_11),
    name: String ="Strawberry Wheel",
    details: String = "These Baked Strawberry Donuts are filled with fresh strawberries",
    oldPrice:Int = 22 ,
    price: Int = 16 ,
    backGroundColor: Color = Pink2,
    onClick: ()-> Unit
) {
    Box {
        Card(
            modifier = Modifier.width(193.dp).height(325.dp).clip(RoundedCornerShape(20.dp)),
            colors = CardDefaults.cardColors(backGroundColor),
            onClick = {   navController.navigate("detailsScreen")}
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                FavIcon()

                Column(modifier = Modifier.padding(start = 20.dp, end = 16.dp)) {
                    Text(text = name, style = Typography.bodySmall)

                    Text(
                        text = details, color = Grey, style = Typography.labelSmall, maxLines = 3,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.padding(top = 8.dp)
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.Bottom
                    ) {
                        Text(
                            text = "$${oldPrice}", color = Grey, style = Typography.bodySmall,
                            textDecoration = TextDecoration.LineThrough,
                            modifier = Modifier.padding(bottom = 4.dp, end = 4.dp)
                        )
                        Text(text = "$${price}", style = Typography.labelMedium)
                    }
                }

            }
        }
        Image(
            modifier = Modifier.padding(start = 45.dp, top = 10.dp).size(220.dp),
            painter = image,
            contentDescription = "donut",
        )
    }
}

