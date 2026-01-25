package com.example.careiroapp.data.dataStore.util

import androidx.datastore.core.CorruptionException
import androidx.datastore.core.Serializer
import com.example.careiroapp.data.dataStore.model.UserDataStoreModel
import kotlinx.serialization.SerializationException
import kotlinx.serialization.json.Json
import java.io.InputStream
import java.io.OutputStream

object UserDataSerializer: Serializer<UserDataStoreModel> {

    override val defaultValue: UserDataStoreModel = UserDataStoreModel()

    override suspend fun readFrom(input: InputStream): UserDataStoreModel =
        try {
            Json.decodeFromString<UserDataStoreModel>(
                input.readBytes().decodeToString()
            )
        } catch (serialization: SerializationException) {
            throw CorruptionException("Unable to read User Data", serialization)
        }


    override suspend fun writeTo(
        t: UserDataStoreModel,
        output: OutputStream
    ) {
        output.write(
            Json.encodeToString(t)
                .encodeToByteArray()
        )
    }

}