package com.todo_list.tasks.api

import com.todo_list.tasks.bl.TasksBl
import com.todo_list.tasks.dto.TaskDTO
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/tasks")
class TasksApi (
        private val taskBl: TasksBl
){

    @PostMapping("/task/{userId}")
    fun createTaskForUserId(
            @PathVariable userId: Long,
            @RequestBody taskDTO: TaskDTO
    ): ResponseEntity<TaskDTO>{
        val task = taskBl.createNewTask(taskDTO, userId)
        return ResponseEntity(task, HttpStatus.OK)
    }
}