package com.tancredi.app.rest.Repository;

import com.tancredi.app.rest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository <Task, Long> {

}
