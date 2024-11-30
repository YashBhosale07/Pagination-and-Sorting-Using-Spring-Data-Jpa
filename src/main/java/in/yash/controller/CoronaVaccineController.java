package in.yash.controller;

import in.yash.entity.coronaVaccine;
import in.yash.service.CoronaVaccineServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoronaVaccineController {

    @Autowired
    private CoronaVaccineServiceImpl coronaVaccineService;

    @GetMapping("/getVaccines/{sortBy}")
    public ResponseEntity<List<coronaVaccine>>getAll(@PathVariable String sortBy){
        List<coronaVaccine>vaccines=coronaVaccineService.getAllVaccines(sortBy);
        return new ResponseEntity<>(vaccines, HttpStatus.OK);
    }

    @GetMapping("/getVaccinesByPagination/{sortBy}")
    public ResponseEntity<List<coronaVaccine>>getVaccinesByPagination(@RequestParam(defaultValue = "0")int pageNumber, @PathVariable String sortBy){
        List<coronaVaccine>vaccines=coronaVaccineService.getAllVaccinesByPagination(pageNumber,sortBy);
        return new ResponseEntity<>(vaccines, HttpStatus.OK);
    }

}
