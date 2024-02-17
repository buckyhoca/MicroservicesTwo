package com.example.MicroserviceTwo.repository;
import com.example.MicroserviceTwo.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

//    @Query(value = "SELECT oktabank.address.id, oktabank.address.city, oktabank.address.state FROM oktabank.address WHERE oktabank.address.employee_id = :employeeId; ")
 //   Optional<Address> findAddressByEmployeeId(@Param("employeeId") int employeeId);

    @Query(value = "SELECT * FROM address WHERE id = ?", nativeQuery = true)
    Optional<Address> findById(int id);


}