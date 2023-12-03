package com.example.homework14.items

data class Pet(val id: Int, val name: String, val petType: PetType)

enum class PetType {
    ANIMAL,
    BIRD
}