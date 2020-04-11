package net.maddeveloper.roomarraylistconverterfactory

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class DataConverter {

    @TypeConverter
    fun fromCountryLangList(value: List<responseEntity.StudentSubjectDTO>): String {
        val gson = Gson()
        val type = object : TypeToken<List<responseEntity.StudentSubjectDTO>>() {}.type
        return gson.toJson(value, type)
    }

    @TypeConverter
    fun toCountryLangList(value: String): List<responseEntity.StudentSubjectDTO> {
        val gson = Gson()
        val type = object : TypeToken<List<responseEntity.StudentSubjectDTO>>() {}.type
        return gson.fromJson(value, type)
    }
}