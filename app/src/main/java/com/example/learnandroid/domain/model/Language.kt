package com.example.learnandroid.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.learnandroid.util.Constants.LANGUAGE_DATA_BASE_TABLE

@Entity(tableName = LANGUAGE_DATA_BASE_TABLE)
data class Language (
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val title: String,
    val image: String,
    val about: String,
    val tags : List<String>,
    val ranking: Int,
    val yearRelease: Int,
    val difficulty : String
)

