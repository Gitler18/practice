package ci.nsu.mobile.main.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ci.nsu.mobile.main.database.DepositEntity
import ci.nsu.mobile.main.repository.DepositRepository
import kotlinx.coroutines.launch

class DepositViewModel(
    private val repository: DepositRepository
) : ViewModel() {

    val history = repository.allDeposits

    fun saveDeposit(
        deposit: DepositEntity
    ) {
        viewModelScope.launch {
            repository.insert(deposit)
        }
    }
}