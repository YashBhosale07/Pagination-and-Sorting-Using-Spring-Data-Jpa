package in.yash.service;

import in.yash.dao.CoronaVaccineDAO;
import in.yash.entity.coronaVaccine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class CoronaVaccineServiceImpl {

    @Autowired
    private CoronaVaccineDAO dao;

    public List<coronaVaccine> getAllVaccines(String sortBy){
        List<coronaVaccine> vaccines=dao.findAll(Sort.by(Sort.Direction.DESC,sortBy,"regNo"));
        return vaccines;
    }

    public List<coronaVaccine>getAllVaccinesByPagination(int pageNumber,String sortBy){
        Pageable pageable= PageRequest.of(pageNumber,5,Sort.by(sortBy).descending());
        List<coronaVaccine> coronaVaccines=dao.findAll(pageable).getContent();
        return coronaVaccines;
    }

}
