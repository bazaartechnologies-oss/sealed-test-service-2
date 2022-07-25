package com.github.hamzaahmedkhan.sealed_class_service_1

import com.github.hamzaahmedkhan.sealed_common_sdk.ProfileType
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow

class ProfileProducer {

    val state: MutableStateFlow<ProfileType> = MutableStateFlow(ProfileType.Idle)

    suspend fun sendMeStates() {
        state.value = ProfileType.Idle
        delay(1000)

        state.value = ProfileType.Loading
        delay(1000)

        state.value = ProfileType.ProfileError ("error message")
        delay(1000)

        state.value = ProfileType.ProfileSuccess
        delay(1000)

        state.value = ProfileType.ProfileDeleted
        delay(1000)

        state.value = ProfileType.ProfileUpdated
        delay(1000)

    }
}

