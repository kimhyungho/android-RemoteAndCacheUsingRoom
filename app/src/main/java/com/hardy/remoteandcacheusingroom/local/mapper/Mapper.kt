package com.hardy.remoteandcacheusingroom.local.mapper

interface Mapper<L : Any, D : Any> {
    fun mapToData(from: L): D
}