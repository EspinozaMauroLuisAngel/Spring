package edu.mx.utvt.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import edu.mx.utvt.data.entities.User;


public interface UserRepository extends JpaRepository <User,Long>{



}
