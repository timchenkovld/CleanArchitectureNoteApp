package com.example.cleanarchitecturenoteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.cleanarchitecturenoteapp.ui.theme.BabyBlue
import com.example.cleanarchitecturenoteapp.ui.theme.LightGreen
import com.example.cleanarchitecturenoteapp.ui.theme.RedOrange
import com.example.cleanarchitecturenoteapp.ui.theme.RedPink
import com.example.cleanarchitecturenoteapp.ui.theme.Violet

@Entity
data class Note(
    @PrimaryKey
    val id: Int? = null,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(massage: String) : Exception(massage)
