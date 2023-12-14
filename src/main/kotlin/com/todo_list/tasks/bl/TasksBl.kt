package com.todo_list.tasks.bl

import com.todo_list.tasks.dao.TaskEntity
import com.todo_list.tasks.dao.UserEntity
import com.todo_list.tasks.dao.repository.TaskRepository
import com.todo_list.tasks.dao.repository.UserRepository
import com.todo_list.tasks.dto.TaskDTO
import com.todo_list.tasks.dto.UserDTO
import org.springframework.stereotype.Service

@Service
class TasksBl (
        private val userRepository: UserRepository,
        private val tasksRepository: TaskRepository
) {

    fun createNewTask(taskDTO: TaskDTO, userId: Long) : TaskDTO{
        val userEntity = userRepository.findById(userId).orElse(null)
        val taskEntity = TaskEntity(0, taskDTO.taskName, taskDTO.description, taskDTO.dueDate, taskDTO.status, userEntity)
        val createdTask = tasksRepository.saveAndFlush(taskEntity)
        return TaskDTO(createdTask.taskName, createdTask.description, createdTask.dueDate, createdTask.status, createdTask.user.userId)
    }

}