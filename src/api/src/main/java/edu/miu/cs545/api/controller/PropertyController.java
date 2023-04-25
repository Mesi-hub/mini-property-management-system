
package edu.miu.cs545.api.controller;

import edu.miu.cs545.api.dto.PropertyDto;
import edu.miu.cs545.api.entity.Property;
import edu.miu.cs545.api.service.interfaces.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/properties")
public class PropertyController {

    @Autowired
    PropertyService propertyService;


    @GetMapping
    public List<PropertyDto> getProperties() {
        return this.propertyService.findAll();
    }
    @GetMapping("/{id}")
    public PropertyDto getPropertyById(@PathVariable("id") Long id) {
        return this.propertyService.findPropertyById(id);
    }

    @PostMapping()
    public Property createProperty(@RequestBody Property property) {
        return this.propertyService.createProperty(property);
    }
    @PutMapping
    public Property updateProperty(@RequestBody Property property) {
        return this.propertyService.updateProperty(property);
    }

    @DeleteMapping("/{id}")
    public void deleteProperty(@PathVariable("id") Long id){
        this.propertyService.deleteProperty(id);
    }
    @GetMapping("/test")
    public String test(){
        return  "Test OKKKK";
    }
}