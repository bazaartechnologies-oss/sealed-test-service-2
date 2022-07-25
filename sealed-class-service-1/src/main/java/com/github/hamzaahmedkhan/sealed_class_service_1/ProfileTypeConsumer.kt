package com.github.hamzaahmedkhan.sealed_class_service_1

import com.github.hamzaahmedkhan.sealed_common_sdk.ProfileType
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.collectLatest


suspend fun main() {
    val producer: ProfileProducer = ProfileProducer()

    // KAFKA dummy copy
    GlobalScope.launch {
        producer.state.collectLatest{ profileType ->
            checkAllTypes(profileType)
        }

    }
    producer.sendMeStates()


}

fun checkAllTypes(profileType: ProfileType) {
    println(profileType)

    when (profileType) {
        ProfileType.Idle -> {

        }
        ProfileType.Loading -> {

        }
        is ProfileType.ProfileError -> {

        }
        ProfileType.ProfileSuccess -> {

        }
    }
}