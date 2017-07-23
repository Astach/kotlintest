package  com.antoine.repository.model


import com.google.gson.annotations.SerializedName

data class ForecastDayResponse(
        @SerializedName("day") val day: DayResponse,
        @SerializedName("astro") val astro: AstroResponse,
        @SerializedName("hour") val hours: List<HourResponse>
)