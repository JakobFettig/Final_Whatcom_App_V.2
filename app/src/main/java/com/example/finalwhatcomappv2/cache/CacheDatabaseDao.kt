package com.example.whatcomapp.cache


import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface CacheDatabaseDao{

    @Insert
    fun insert(cache: CacheEntity)

    @Update
    fun update(cache: CacheEntity)

    @Query("SELECT * from cache_table WHERE foodbankName = :key")
    fun get(key: String): CacheEntity?

    @Query("DELETE FROM cache_table")
    fun clear()

    @Query("SELECT * FROM cache_table ORDER BY foodbankName DESC")
    fun getAllnames(): LiveData<List<CacheEntity>>


}
