package com.example.pillreminder.data

import android.R
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "medicines")
data class Medicine (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val dosage: String,
    val frequency: Int,
    val times: List<R.string>,
    val isActive: Boolean = true
)