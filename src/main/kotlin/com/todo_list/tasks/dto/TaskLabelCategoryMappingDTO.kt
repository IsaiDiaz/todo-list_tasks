package com.todo_list.tasks.dto

data class TaskLabelCategoryMappingDTO(
        val taskId: Long,
        val taskCategoriesId: Long,
        val taskLabelId: Long
)
