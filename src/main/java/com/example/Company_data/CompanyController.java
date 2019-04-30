package com.example.Company_data;




import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Company_data.model.Company;
import com.example.Company_data.repositories.Company_repositorie;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {
  @Autowired
  private Company_repositorie repository;
  
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public List<Company> getAllCompany() {
    return repository.findAll();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Company getCompanyById(@PathVariable("id") ObjectId id) {
    return repository.findBy_id(id);
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public void modifyPetById(@PathVariable("id") ObjectId id, @Valid @RequestBody Company company) {
	 company.set_id(id);
    repository.save(company);
  }
  
  @RequestMapping(value = "/", method = RequestMethod.POST)
  public Company createPet(@Valid @RequestBody Company Company) {
	 Company.set_id(ObjectId.get());
    repository.save(Company);
    return Company;
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deleteCompany(@PathVariable ObjectId id) {
    repository.delete(repository.findBy_id(id));
  }
}