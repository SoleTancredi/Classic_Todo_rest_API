package com.tancredi.app.rest.Repository;

import com.tancredi.app.rest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository <Task, Long> {

}
