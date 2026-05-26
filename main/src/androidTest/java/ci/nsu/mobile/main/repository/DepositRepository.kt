package ci.nsu.mobile.main.repository

import ci.nsu.mobile.main.database.DepositDao
import ci.nsu.mobile.main.database.DepositEntity

class DepositRepository(
    private val dao: DepositDao
) {

    val allDeposits = dao.getAllDeposits()

    suspend fun insert(deposit: DepositEntity) {
        dao.insert(deposit)
    }
}