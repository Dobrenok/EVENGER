package com.evenger.server.repository;

import com.evenger.server.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login, Long>
{

}
