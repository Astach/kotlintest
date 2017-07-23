package  com.antoine.repository.model

import com.google.gson.annotations.SerializedName

data class AstroResponse(
        @SerializedName("sunrise") val sunrise:String,
        @SerializedName("sunset") val sunset:String,
        @SerializedName("moonrise") val moonrise:String,
        @SerializedName("moonset") val moonset:String
)