package ru.bigNerd.officecrimes.database

import androidx.room.Dao
import androidx.room.Query
import ru.bigNerd.officecrimes.Crime
import java.util.*

@Dao
interface CrimeDao {
    @Query("SELECT*FROM crime")//Query извлечение информации из базы данных
    fun  getCrimes():List<Crime>
    @Query("SELECT*FROM crime WHERE id=(:id)")
    fun getCrime(id:UUID):Crime?
}