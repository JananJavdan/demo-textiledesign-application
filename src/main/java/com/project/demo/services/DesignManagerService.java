package com.project.demo.services;

import com.project.demo.models.Design;

import java.util.List;

public interface DesignManagerService {
    Design createDesign(Long designManagerId, Design design);
    Design updateDesign(Long designManagerId, Long designId, Design updatedDesign);
    void deleteDesign(Long designManagerId, Long designId);
    List<Design> fetchDesigns(Long designManagerId);
    void assistCustomer(Long designManagerId, Long customerId);
}
