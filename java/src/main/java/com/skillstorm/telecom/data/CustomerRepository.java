package com.skillstorm.telecom.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.skillstorm.telecom.beans.Customer;

/**
 * Customer Repo
 * @author Matthew, Edrick, Hieu
 *
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
