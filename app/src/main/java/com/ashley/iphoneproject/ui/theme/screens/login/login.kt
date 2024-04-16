package com.ashley.iphoneproject.ui.theme.screens.login

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

@Composable
fun LogInScreen(){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "This is the Log in Screen")
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { /*TODO*/ }) {
            Text(text = "or Register")
        }
    }
}

@Preview
@Composable
fun LoginScreenPreview(){
    LogInScreen()
}