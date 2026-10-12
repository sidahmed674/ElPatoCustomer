package com.elpato.customer.domain.usecase
import com.elpato.customer.domain.model.Branch; import com.elpato.customer.domain.repository.BranchRepository; import javax.inject.Inject
class GetBranchesUseCase @Inject constructor(private val repo: BranchRepository) { operator fun invoke(): Result<List<Branch>> = repo.getActiveBranches() }
