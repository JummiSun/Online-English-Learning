package com.site.learning.repo;

import com.site.learning.models.UserDtls;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDtls,Integer> {
    public boolean existsByEmail(String email);

    public UserDtls findByEmail(String email);
}
