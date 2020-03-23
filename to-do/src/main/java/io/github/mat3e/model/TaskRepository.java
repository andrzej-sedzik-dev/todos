package io.github.mat3e.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path = "todos", collectionResourceRel = "todos")
@RepositoryRestResource(path = "todos", collectionResourceRel = "todos")
interface TaskRepository extends JpaRepository<Task, Integer> {
}
