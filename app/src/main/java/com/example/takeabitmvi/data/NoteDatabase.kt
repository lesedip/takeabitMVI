package com.example.takeabitmvi.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.takeabitmvi.data.dao.NoteDao
import com.example.takeabitmvi.data.entity.Note

@Database(entities = [Note::class], version = 1, exportSchema = false)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDao
}