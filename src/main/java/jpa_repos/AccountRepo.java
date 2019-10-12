package main.java.jpa_repos;

import main.java.POJO.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<Accounts, Integer>{
    
}