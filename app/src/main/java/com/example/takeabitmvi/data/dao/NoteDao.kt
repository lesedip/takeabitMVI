package com.example.takeabitmvi.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.takeabitmvi.data.entity.Note

@Dao
interface NoteDao {
    @Query("SELECT * FROM notes_table")
    suspend fun get() : List<Note>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(note : Note)

    @Delete
    suspend fun delete(note: Note)
}