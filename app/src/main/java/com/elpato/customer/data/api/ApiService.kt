package com.elpato.customer.data.api
import com.elpato.customer.data.model.ApiResponse; import com.elpato.customer.data.model.BranchDto; import com.elpato.shared.model.GeoPoint; import retrofit2.http.*
interface ApiService {
    @GET("branches") suspend fun getBranches(): ApiResponse<List<BranchDto>>
    @GET("branches/{id}") suspend fun getBranch(@Path("id") id: String): ApiResponse<BranchDto>
    @POST("auth/send-otp") suspend fun sendOtp(@Body body: Map<String, String>): ApiResponse<Unit>
    @POST("auth/verify-otp") suspend fun verifyOtp(@Body body: Map<String, String>): ApiResponse<AuthResponse>
}
