package com.ashley.iphoneproject.ui.theme.screens.register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.ashley.iphoneproject.navigation.ROUTE_LOGIN
import com.ashley.iphoneproject.navigation.ROUTE_REGISTER

@Composable
fun RegisterScreen(navController: NavController){
    val email by remember {
        mutableStateOf(TextFieldValue)
    }
    var pass by remember {
        mutableStateOf(TextFieldValue)
    }
    var context = LocalContext.current
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Kindly Register with us :)",
            color = Color.White,
            fontFamily = FontFamily.SansSerif,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {Text(text = "Enter your email:")},
            placeholder = {Text(text = "eg: johndoe@gmail.com")},
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            colors = TextFieldDefaults.colors(focusedContainerColor = Color.Green)
        )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Enter Password: ")},
            placeholder = {Text(text = "Enter your password: ")},
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp),
            colors = TextFieldDefaults.colors(focusedContainerColor = Color.Green)
        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Confirm  Password: ")},
            placeholder = {Text(text = "re-enter your password: ")},
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp),
            colors = TextFieldDefaults.colors(focusedContainerColor = Color.Green)
        )

        Button(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth(), colors = ButtonDefaults.buttonColors(containerColor = Color.Green)
        ) {
            Text(text = "Register")
        }
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
                         navController.navigate(ROUTE_LOGIN)
        },
            modifier = Modifier.fillMaxWidth(), colors = ButtonDefaults.buttonColors(containerColor = Color.Magenta)
        ) {
            Text(text = "Have an account?Login")
        }

    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun RegisterScreenPreview(){
    RegisterScreen(rememberNavController())
}