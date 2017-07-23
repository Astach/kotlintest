package  com.antoine.repository.model

import com.google.gson.annotations.SerializedName

data class ConditionResponse(@SerializedName("text") val description: String,
                             @SerializedName("icon") val iconUrl: String,
                             @SerializedName("code") val code: Int
)
