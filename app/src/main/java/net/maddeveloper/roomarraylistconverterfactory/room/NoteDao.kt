package net.maddeveloper.roomarraylistconverterfactory.room

import androidx.room.*
import net.maddeveloper.roomarraylistconverterfactory.responseEntity

@Dao
interface NoteDao {

    @Insert
    suspend fun addNote(note: responseEntity)

    @Query("SELECT * FROM responseEntity ORDER BY id DESC")
    suspend fun getAllNotes() : List<responseEntity>


}