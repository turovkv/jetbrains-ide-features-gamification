package com.intellij.gamify.server.repository

import com.intellij.gamify.server.entities.Notification
import com.intellij.gamify.server.entities.UserInfo
import io.ktor.auth.*

interface GamifyRepository {
    fun getUserInfoById(id: Int): UserInfo
    fun getIdByName(name: String): Int
    fun getAllUserInfos(): List<UserInfo>

    fun createUser(credential: UserPasswordCredential): Int
    fun authenticate(credential: UserPasswordCredential): Authorized?

    interface Authorized : GamifyRepository {
        val userPrincipal: UserIdPrincipal

        fun updateUser(userInfo: UserInfo)

        // TODO: use user if from `userPrincipal`
        fun addNotification(id: Int, notification: Notification)
        fun subscribe(idFrom: Int, idTo: Int)
        fun unsubscribe(idFrom: Int, idTo: Int)
        fun getNotifications(id: Int): List<Notification>
    }
}
