package com.example.notesappviewmodel.Database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import com.example.notesappviewmodel.Model.Note

class Repository(private val dao:NoteDao) {
    suspend fun addNote(note: Note){
        dao.addNote(note)
    }

   val getAllNote:LiveData<List<Note>> = dao.getAllNote()

    suspend fun updateNote(note: Note){
        dao.updateNote(note)
    }

    suspend fun deleteNote(note: Note){
        dao.deleteNote(note)
    }
}