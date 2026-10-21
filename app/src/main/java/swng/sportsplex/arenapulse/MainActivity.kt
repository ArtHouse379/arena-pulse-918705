package swng.sportsplex.arenapulse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import swng.sportsplex.arenapulse.ui.composable.approot.AppRoot
import swng.sportsplex.arenapulse.ui.theme.BXATAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BXATAppTheme {
                AppRoot()
            }
        }
    }
}