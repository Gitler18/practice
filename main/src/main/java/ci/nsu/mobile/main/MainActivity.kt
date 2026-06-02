package ci.nsu.mobile.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ci.nsu.mobile.main.ui.screens.MainScreen
import ci.nsu.mobile.main.ui.theme.PracticeTheme
import ci.nsu.mobile.main.ui.screens.StepOneScreen
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PracticeTheme {
                StepOneScreen(
                    onNextClick = { _, _ -> },
                    onBackClick = {}
                )
                }
}
}
}