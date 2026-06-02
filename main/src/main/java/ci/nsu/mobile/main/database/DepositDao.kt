package ci.nsu.mobile.main.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface DepositDao {

    @Insert
    suspend fun insert(deposit: DepositEntity)

    @Query("SELECT * FROM deposits")
    fun getAllDeposits(): Flow<List<DepositEntity>>
}