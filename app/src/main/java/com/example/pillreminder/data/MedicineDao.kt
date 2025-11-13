package com.example.pillreminder.data

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Insert;
import androidx.room.Update;

@Dao
interface MedicineDao{
    @Insert
    suspend fun insert(medicine : Medicine)

    @Query("SELECT * FROM medicines WHERE isActive = 1")
    fun getAllActive(): List<Medicine>

    @Update
    suspend fun update(medicine: Medicine)
}