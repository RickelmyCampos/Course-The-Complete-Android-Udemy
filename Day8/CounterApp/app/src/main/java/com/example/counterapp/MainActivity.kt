package com.example.counterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.counterapp.ui.theme.CounterAppTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val viewModel:CounterViewModel=viewModel()
            CounterAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CounterApp(viewModel)
                }
            }
        }
    }


}

@Composable
fun CounterApp(viewModel: CounterViewModel) {
    Column (horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = viewModel.count.value.toString())
        Row() {

            Button(onClick = {viewModel.increment() },modifier = Modifier.padding(8.dp)) {
                Text(text = "Increment")
            }
            Button(onClick = { viewModel.decrement() },modifier = Modifier.padding(8.dp)) {
                Text(text = "Decrement")
            }
        }
    }
}
@Preview
@Composable
fun CounterAppPreview(){
    // CounterApp()
}
