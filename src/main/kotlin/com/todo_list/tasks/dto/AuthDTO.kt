package com.todo_list.tasks.dto

data class AuthDTO(
        val username: String,
        val secret: String,
        val userId: Long
)