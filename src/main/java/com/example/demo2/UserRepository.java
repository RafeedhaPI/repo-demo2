package com.example.demo2;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    boolean existsByPhoneNumberOrAlternateContact(String phoneNumber, String alternateContact);
}
