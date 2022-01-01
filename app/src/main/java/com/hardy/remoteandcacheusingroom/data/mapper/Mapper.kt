package com.hardy.remoteandcacheusingroom.data.mapper

interface Mapper<D : Any, M : Any> {
    fun mapToDomain(from: D): M
}