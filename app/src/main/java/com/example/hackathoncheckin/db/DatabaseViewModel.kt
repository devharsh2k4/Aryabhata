package com.example.hackathoncheckin.db

import android.util.Log
import android.widget.Toast
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import com.google.firebase.firestore.toObjects

class DatabaseViewModel : ViewModel(), DatabaseService {

    private val db = Firebase.firestore
    val userList = mutableStateOf(listOf<User?>(null))


    override fun write(collection: String) {
        val user = hashMapOf(
            "name" to "Harsh", "state" to "Chhatisgarh", "country" to "India", "age" to 19
        )
        db.collection(collection).add(user).addOnSuccessListener { documentReference ->
                Log.d("TAG", "write: Database Updated $documentReference")
            }.addOnFailureListener { exception ->
                Log.d("TAG", "write: Exception Report $exception")
            }


//        db.collection(collection).document("")
//            .set(city)
//            .addOnSuccessListener { Log.d(TAG, "DocumentSnapshot successfully written!") }
//            .addOnFailureListener { e -> Log.w(TAG, "Error writing document", e) }
    }

    override fun read(collection: String) {
        db.collection(collection).get().addOnSuccessListener { documentSnapshot ->
                val fetchUserList = documentSnapshot.toObjects<User>()
                userList.value = fetchUserList
                Log.d("TAG", "read: read successfully $fetchUserList")

            }.addOnFailureListener { exception ->
                Log.d("TAG", "read:read Failed $exception  ")

            }
    }

    override fun update(collection: String) {
        db.collection(collection)
            .document("mjFzz8SHLeEoftbj3tNk").update(
                "name", "Harsh Vardhan"
            )
            .addOnSuccessListener { documentReference ->
                Log.d("TAG", "update: Database Updated $documentReference")
            }.addOnFailureListener { exception ->
                Log.d("TAG", "update: Exception Report $exception")
            }
    }

    override fun delete() {
        db.collection("User").document("mjFzz8SHLeEoftbj3tNk").delete()
            .addOnSuccessListener { documentReference ->
            Log.d("TAG", "delete: Database Updated $documentReference")
        }.addOnFailureListener { exception ->
            Log.d("TAG", "delete: Exception Report $exception")
        }
    }
}