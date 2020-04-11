package net.maddeveloper.roomarraylistconverterfactory.room

import android.content.Context
import androidx.room.*
import net.maddeveloper.roomarraylistconverterfactory.DataConverter
import net.maddeveloper.roomarraylistconverterfactory.responseEntity


@Database(
    entities = [responseEntity::class],
    version = 1
)
@TypeConverters(DataConverter::class)
abstract class NoteDatabase : RoomDatabase(){

    abstract fun getNoteDao() : NoteDao
    companion object {

        @Volatile private var instance : NoteDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance
            ?: synchronized(LOCK){
            instance
                ?: buildDatabase(
                    context
                ).also {
                instance = it
            }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            NoteDatabase::class.java,
            "notedatabase"
        ).build()

    }
}