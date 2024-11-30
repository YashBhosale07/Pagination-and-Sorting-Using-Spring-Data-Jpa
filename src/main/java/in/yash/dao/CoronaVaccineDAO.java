package in.yash.dao;

import in.yash.entity.coronaVaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoronaVaccineDAO extends JpaRepository<coronaVaccine,Long> {

}
