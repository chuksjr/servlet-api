package br.com.chuksricardo.servlet_api;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{
  
}
