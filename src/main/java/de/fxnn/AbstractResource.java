package de.fxnn;

import javax.inject.Inject;

public abstract class AbstractResource<T extends Dto> {

  @Inject ExampleRepository repository;

  public String findAll() {
    return Long.toString(repository.findAll().count());
  }

  public String create(T dto) {
    repository.persist(new ExampleEntity());
    return "ok";
  }
}
