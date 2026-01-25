package com.example.careiroapp.data.network.retrofit

import com.example.careiroapp.BuildConfig
import com.example.careiroapp.data.network.api.AssociacaoApiService
import com.example.careiroapp.data.network.api.AuthApiService
import com.example.careiroapp.data.network.api.ClienteApiService
import com.example.careiroapp.data.network.api.FeiraApiService
import com.example.careiroapp.data.network.api.ProdutoApiService
import com.example.careiroapp.data.network.api.VendedorApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {

    private const val BASE_URL = BuildConfig.BASE_URL

    private val logging = HttpLoggingInterceptor()
        .setLevel(HttpLoggingInterceptor.Level.BODY)

    private val okHttpClient = OkHttpClient
        .Builder()
        .addInterceptor(logging)
        .build()

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()

    @Provides
    @Singleton
    fun produtoApiSetupProvider(): ProdutoApiService {
        return retrofit.create(ProdutoApiService::class.java)
    }

    @Provides
    @Singleton
    fun vendedorApiSetupProvider(): VendedorApiService {
        return retrofit.create(VendedorApiService::class.java)
    }

    @Provides
    @Singleton
    fun feiraApiSetupProvider(): FeiraApiService {
        return retrofit.create(FeiraApiService::class.java)
    }

    @Provides
    @Singleton
    fun associacaoApiSetupProvider(): AssociacaoApiService {
        return retrofit.create(AssociacaoApiService::class.java)
    }

    @Provides
    @Singleton
    fun clienteApiSetupProvider(): ClienteApiService {
        return retrofit.create(ClienteApiService::class.java)
    }

    @Provides
    @Singleton
    fun authApiSetupProvider(): AuthApiService {
        return retrofit.create(AuthApiService::class.java)
    }

}