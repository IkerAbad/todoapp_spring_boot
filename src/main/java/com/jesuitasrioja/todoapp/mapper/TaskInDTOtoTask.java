package com.jesuitasrioja.todoapp.mapper;

import com.jesuitasrioja.todoapp.persistence.entity.Task;
import com.jesuitasrioja.todoapp.persistence.entity.TaskStatus;
import com.jesuitasrioja.todoapp.service.dto.TaskInDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TaskInDTOtoTask implements IMapper<TaskInDTO, Task> {

    @Override
    public Task map(TaskInDTO in) {
        Task task = new Task();
        task.setTitle(in.getTitle());
        task.setDescription(in.getDescription());
        task.setEta(in.getEta());
        task.setCreatedDate(LocalDateTime.now());
        task.setFinished(false);
        task.setTaskStatus(TaskStatus.ON_TIME);
        return task;
    }
}
