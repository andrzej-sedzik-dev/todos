package io.github.mat.e.todo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path = "todos", collectionResourceRel = "todos")
@RepositoryRestResource
interface TaskRepository extends JpaRepository<Task, Integer> {
}
