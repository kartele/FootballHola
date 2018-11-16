package id.naryo.footballhola.main

import id.naryo.footballhola.model.Team

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}
