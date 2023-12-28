package com.example.datainternet.repository

import com.example.datainternet.Model.Kontak
import com.example.datainternet.service_api.KontakService

interface KontakRepository {
    suspend fun getKontak(): List<Kontak>
}

class NetworkKontakRepository(
    private val kontakApiService: KontakService
) : KontakRepository {
    override suspend fun getKontak(): List<Kontak> = kontakApiService.getKontak()
}