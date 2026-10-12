package com.elpato.customer.domain.repository
import com.elpato.customer.domain.model.Branch
interface BranchRepository { suspend fun getActiveBranches(): Result<List<Branch>>; suspend fun getBranchById(id: String): Result<Branch> }
