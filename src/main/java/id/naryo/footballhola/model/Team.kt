package id.naryo.footballhola.model

import com.google.gson.annotations.SerializedName

/**
 * Created by root on 1/23/18.
 */
data class Team(
        @SerializedName("idTeam")
        var teamId: String? = null,

        @SerializedName("strTeam")
        var teamName: String? = null,

        @SerializedName("strTeamBadge")
        var teamBadge: String? = null
        )