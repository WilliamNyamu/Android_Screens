package com.ashley.iphoneproject.ui.theme.screens.about

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun AboutScreen(navController: NavController){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Please Register Here")
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { /*TODO*/ }) {
            Text(text = "or Register")
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun AboutScreenPreview(){
    AboutScreen(rememberNavController())
}