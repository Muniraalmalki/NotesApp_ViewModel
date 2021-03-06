package com.example.notesappviewmodel.Model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Note")
data class Note(
    @PrimaryKey(autoGenerate = true) val pk: Int,
    @ColumnInfo val noteTitle: String?,
    @ColumnInfo val noteDescription: String?)
