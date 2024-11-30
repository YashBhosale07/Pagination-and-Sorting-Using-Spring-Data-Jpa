package in.yash.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class coronaVaccine {

    @Id
    private Long regNo;
    private String name;
    private String company;
    private String country;
    private Double price;
    private Integer requiredDoseCount;

}
