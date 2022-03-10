package com.flight.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.project.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,String> {

}
