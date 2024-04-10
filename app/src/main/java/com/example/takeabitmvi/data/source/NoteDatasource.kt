package com.example.takeabitmvi.data.source

import com.example.takeabitmvi.data.dao.NoteDao
import com.example.takeabitmvi.data.entity.Note
import javax.inject.Inject

interface NoteDatasource {
    suspend fun createNote(note: Note)
    suspend fun deleteNote(note: Note)

    fun getAllNotes(): List<Note>
}


class NoteDatasourceImpl @Inject constructor(private val dao: NoteDao) : NoteDatasource {
    override suspend fun createNote(note: Note) {
        dao.insert(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.delete(note)
    }

    override fun getAllNotes(): List<Note> {
        throw NotImplementedError()
    }
}