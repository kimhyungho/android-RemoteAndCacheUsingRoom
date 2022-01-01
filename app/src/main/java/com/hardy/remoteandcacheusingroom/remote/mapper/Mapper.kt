package com.hardy.remoteandcacheusingroom.remote.mapper

interface Mapper<R : Any, D : Any> {
    fun mapToData(from: R): D
}