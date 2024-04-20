package com.site.learning.services;

import com.site.learning.models.UserDtls;

public interface UserService {

    public UserDtls createUser(UserDtls user);

    public boolean checkEmail(String email);
}
