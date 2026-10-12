package com.elpato.customer.domain.usecase
import com.elpato.customer.domain.model.Branch; import com.elpato.customer.domain.model.BranchWithFee
import com.elpato.customer.domain.repository.BranchRepository; import com.google.android.gms.maps.model.LatLng
import javax.inject.Inject
class FindNearestBranchUseCase @Inject constructor(private val repo: BranchRepository) {
    operator fun invoke(loc: LatLng): Result<BranchWithFee> = try {
        val branches = repo.getActiveBranches().getOrThrow(); val nearest = branches.filter{it.isOpen}.minByOrNull{it.distanceTo(loc)}
        nearest?.let{ Result.success(BranchWithFee(it, it.getDeliveryFee(loc))) } ?: Result.failure(Exception("لا توجد فروع مفتوحة"))
    } catch(e: Exception) { Result.failure(e) }
}
