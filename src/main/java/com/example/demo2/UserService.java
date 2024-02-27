package com.example.demo2;
import jakarta.transaction.Transactional;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired

    private UserRepository userRepository;
    @Transactional

    public boolean checkDuplicate(String phoneNumber, String alternateContact) {
        return userRepository.existsByPhoneNumberOrAlternateContact(phoneNumber, alternateContact);
    }


}

