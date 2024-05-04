package com.app.taskmanager.TaskManager.entity;

import jakarta.persistence.*;
import lombok.*;
import org.thymeleaf.standard.expression.SubtractionExpression;

import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name="Task")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Column(name="task_id")
    @Id @Setter(AccessLevel.PROTECTED)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID taskId;

    @Column(name="task_name")
    private String taskName;

    @Column(name="task_description")
    private String taskDescription;

    @Column(name="start_date")
    private Date startDate;

    @Column(name="end_date")
    private Date endDate;

    @Column(name="task_priority")
    @Enumerated(EnumType.STRING)
    private TaskPriority taskPriority;

    @Column(name="task_status")
    @Enumerated(EnumType.STRING)
    private TaskStatus taskStatus;

    @Column(name="notes")
    private String notes;

    //TBD: Subtasks
    //private List<SubTask> subtasks;

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", taskPriority=" + taskPriority +
                ", taskStatus=" + taskStatus +
                ", notes='" + notes + '\''+
                '}';
    }
}
