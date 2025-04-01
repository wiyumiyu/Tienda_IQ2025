package com.tineda.tienda.dao;

import com.tineda.tienda.domain.RequestMatcher;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RequestMatcherDao extends JpaRepository<RequestMatcher, Long> {
    
}