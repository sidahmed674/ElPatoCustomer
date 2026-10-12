package com.elpato.customer.presentation.home
import androidx.lifecycle.ViewModel; import androidx.lifecycle.viewModelScope; import com.elpato.customer.domain.model.Branch; import com.elpato.customer.domain.model.BranchWithFee; import com.elpato.customer.domain.usecase.FindNearestBranchUseCase; import com.elpato.customer.domain.usecase.GetBranchesUseCase; import com.google.android.gms.maps.model.LatLng; import kotlinx.coroutines.flow.MutableStateFlow; import kotlinx.coroutines.flow.asStateFlow; import kotlinx.coroutines.launch; import javax.inject.Inject; import dagger.hilt.android.lifecycle.HiltViewModel
@HiltViewModel class HomeViewModel @Inject constructor(private val findNearest: FindNearestBranchUseCase, private val getBranches: GetBranchesUseCase) : ViewModel() {
    private val _state = MutableStateFlow<HomeUiState>(HomeUiState.Loading); val uiState = _state.asStateFlow()
    init { detect() }
    fun detect() { _state.value = HomeUiState.Loading; viewModelScope.launch { try { val loc = LatLng(36.7538, 3.0588); val nearest = findNearest(loc).getOrThrow(); val all = getBranches().getOrThrow(); _state.value = HomeUiState.Success(nearest, all.filter{it.id != nearest.branch.id}) } catch(e: Exception) { _state.value = HomeUiState.Error(e.message ?: "فشل التحميل") } } }
}
sealed interface HomeUiState { data class Loading: HomeUiState; data class Success(val nearest: BranchWithFee, val others: List<Branch>): HomeUiState; data class Error(val msg: String): HomeUiState }
