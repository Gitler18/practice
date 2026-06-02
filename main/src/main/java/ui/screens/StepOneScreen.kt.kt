package ci.nsu.mobile.main.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StepOneScreen(
    onNextClick: (String, String) -> Unit,
    onBackClick: () -> Unit
) {

    var amount by remember { mutableStateOf("") }
    var months by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "Этап 1. Основные параметры",
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = amount,
            onValueChange = { amount = it },
            label = { Text("Стартовый взнос") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = months,
            onValueChange = { months = it },
            label = { Text("Срок вклада (мес.)") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = onBackClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("В начало")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = {
                onNextClick(amount, months)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Далее")
        }
    }
}