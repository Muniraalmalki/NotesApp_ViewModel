package com.example.notesappviewmodel.Database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.notesappviewmodel.Model.Note

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addNote(note: Note)

    @Query("SELECT * FROM Note ORDER BY pk ASC")
    fun getAllNote():LiveData<List<Note>>

    @Update
    suspend fun updateNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}