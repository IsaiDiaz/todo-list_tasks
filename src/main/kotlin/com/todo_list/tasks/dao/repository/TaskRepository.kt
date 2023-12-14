package com.todo_list.tasks.dao.repository

import com.todo_list.tasks.dao.TaskEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TaskRepository: JpaRepository<TaskEntity, Long> {
}