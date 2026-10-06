package com.chancery.portfolio_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.chancery.portfolio_api.model.Portfolio;

public interface Portfolio_Repository extends JpaRepository<Portfolio, Long> {
	List<Portfolio> findby
}
