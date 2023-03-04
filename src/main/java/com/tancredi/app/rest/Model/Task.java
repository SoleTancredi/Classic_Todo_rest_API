package com.tancredi.app.rest.Model;

import lombok.Getter;
import javax.persistence.*;

@Entity
@Getter
@Table(schema = "TasksCrud")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String title;
    @Column
    private String description;

    public static final class TaskBuilder {
        private long id;
        private String title;
        private String description;

        private TaskBuilder() {
        }

        public static TaskBuilder aTask() {
            return new TaskBuilder();
        }

        public TaskBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public TaskBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public TaskBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Task build() {
            Task task = new Task();
            task.title = this.title;
            task.id = this.id;
            task.description = this.description;
            return task;
        }
    }
}
