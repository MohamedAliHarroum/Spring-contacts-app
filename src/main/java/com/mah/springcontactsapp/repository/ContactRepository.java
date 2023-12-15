package com.mah.springcontactsapp.repository;

import com.mah.springcontactsapp.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepository  extends JpaRepository<Contact,String> {

    Optional<Contact> findById (String id);
}
