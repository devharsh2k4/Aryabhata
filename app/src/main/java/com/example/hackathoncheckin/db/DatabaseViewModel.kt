package com.example.hackathoncheckin.db

import androidx.lifecycle.ViewModel
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore

class DatabaseViewModel:ViewModel(),DatabaseService {

    private val db = Firebase.firestore


    override fun write(collection: String) {

    }

    override fun read(collection: String) {

    }

    override fun update() {

    }

    override fun delete() {

    }
}