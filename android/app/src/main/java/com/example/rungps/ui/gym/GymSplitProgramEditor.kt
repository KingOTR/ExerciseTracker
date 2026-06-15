package com.example.rungps.ui.gym

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class SplitDay(val name: String, val exercises: MutableList<String> = mutableListOf())

@Composable
fun GymSplitProgramEditor(
    onSave: (programName: String, days: List<SplitDay>) -> Unit,
    modifier: Modifier = Modifier,
) {
    var programName by remember { mutableStateOf("My split") }
    val days = remember { mutableStateListOf(SplitDay("Day A"), SplitDay("Day B")) }
    var newDayName by remember { mutableStateOf("") }
    Column(modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text("Split program editor")
        OutlinedTextField(
            value = programName,
            onValueChange = { programName = it },
            label = { Text("Program name") },
            modifier = Modifier.fillMaxWidth(),
        )
        days.forEachIndexed { index, day ->
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Text("${index + 1}. ${day.name}")
                Button(onClick = { if (days.size > 1) days.removeAt(index) }) { Text("Remove") }
            }
        }
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            OutlinedTextField(
                value = newDayName,
                onValueChange = { newDayName = it },
                label = { Text("New day") },
                modifier = Modifier.weight(1f),
            )
            Button(onClick = {
                if (newDayName.isNotBlank()) {
                    days.add(SplitDay(newDayName.trim()))
                    newDayName = ""
                }
            }) { Text("Add day") }
        }
        Button(onClick = { onSave(programName, days.toList()) }) { Text("Save program") }
    }
}
