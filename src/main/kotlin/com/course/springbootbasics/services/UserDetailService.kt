package com.course.springbootbasics.services

import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
class UserDetailService : UserDetailsService {
    override fun loadUserByUsername(userName: String) : UserDetails {
       return User("javier", "{noop}es un conejo que roe zanahorias en la orilla del mar", ArrayList())
    }
}