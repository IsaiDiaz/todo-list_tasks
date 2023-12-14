package com.todo_list.tasks.dao.repository

import com.todo_list.tasks.dao.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<UserEntity, Long> {

    fun findByUsernameAndEmail(username: String, email: String) : UserEntity
}