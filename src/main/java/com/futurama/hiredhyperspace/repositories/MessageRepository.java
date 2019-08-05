package com.futurama.hiredhyperspace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.futurama.hiredhyperspace.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {

}