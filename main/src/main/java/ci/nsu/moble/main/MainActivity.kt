package ci.nsu.moble.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ci.nsu.moble.main.ui.theme.Blue6
import ci.nsu.moble.main.ui.theme.Green4
import ci.nsu.moble.main.ui.theme.Light_Blue5
import ci.nsu.moble.main.ui.theme.Orange2
import ci.nsu.moble.main.ui.theme.PracticeTheme
import ci.nsu.moble.main.ui.theme.Red1
import ci.nsu.moble.main.ui.theme.Violet7
import ci.nsu.moble.main.ui.theme.Yellow3

private val colorsMap = mapOf(
    "Red" to Red1,
    "Orange" to Orange2,
    "Yellow" to Yellow3,
    "Green" to Green4,
    "Light_Blue" to Light_Blue5,
    "Blue" to Blue6,
    "Violet" to Violet7
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticeTheme() {
                Main()
            }
        }
    }
}

@Composable
fun Main(modifier: Modifier = Modifier) {
    Scaffold {

    }
}