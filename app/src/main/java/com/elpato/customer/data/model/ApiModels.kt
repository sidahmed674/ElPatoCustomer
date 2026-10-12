package com.elpato.customer.data.model
import com.elpato.shared.model.GeoPoint; import com.elpato.shared.model.OpeningHours; import kotlinx.serialization.Serializable

@Serializable data class ApiResponse<T>(val success: Boolean, val data: T?, val message: String?, val error: String?)
@Serializable data class BranchDto(val id: String, val name: String, val nameAr: String, val address: String, val addressAr: String, val phone: String?, val coordinates: GeoPoint, val isActive: Boolean, val isOpen: Boolean, val openingHours: OpeningHours, val imageUrl: String?, val deliveryZones: List<DeliveryZoneDto>)
@Serializable data class DeliveryZoneDto(val id: String, val branchId: String, val name: String, val nameAr: String, val polygon: GeoPolygonDto, val fee: Double, val estimatedMinutes: Int, val isActive: Boolean, val priority: Int)
@Serializable data class GeoPolygonDto(val type: String, val coordinates: List<List<DoubleArray>>)
@Serializable data class AuthResponse(val user: UserDto, val accessToken: String, val refreshToken: String)
@Serializable data class UserDto(val id: String, val phone: String, val name: String?, val email: String?, val avatarUrl: String?, val loyaltyPoints: Int, val totalOrders: Int, val totalSpent: Double, val preferredLanguage: String)
