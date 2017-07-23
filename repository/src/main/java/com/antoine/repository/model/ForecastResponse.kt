package  com.antoine.repository.model


import com.google.gson.annotations.SerializedName

data class ForecastResponse(@SerializedName("location") val location: LocationResponse,
                            @SerializedName("current") val current: DayResponse,
                            @SerializedName("forecastday") var forecastDays: List<ForecastDayResponse>)
