package de.prog4mi.uebungbsp01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import de.prog4mi.uebungbsp01.ui.theme.UebungBsp01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UebungBsp01Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column {
        Text(
            text = "Hello Mr. Niemand!",
            style = MaterialTheme.typography.h3,
            color = Color.Blue
        )
        Text(
            text = "Hello Anja",
            style = MaterialTheme.typography.h3,
            color = Color.Blue,
            fontWeight = FontWeight.Bold
        )
        TextField(
            value = "Hier fehlt Text",
            onValueChange = {

            }
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    UebungBsp01Theme {
        Greeting()
    }
}