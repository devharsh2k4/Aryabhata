package com.example.hackathoncheckin.db

interface DatabaseService {
    fun write(collection: String)
    fun read(collection: String)
    fun update(collection: String)
    fun delete()
}