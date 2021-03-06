package com.dnr.brrts.web.controller;

import com.dnr.brrts.web.model.NfApplicationForm;
import com.dnr.brrts.web.service.ApplicationFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class ApplicationFormController {

    @Autowired
    ApplicationFormService appFormService;

    @GetMapping
     public List<NfApplicationForm> getAllApplicationFormTypes(){
        return appFormService.getApplicationFormTypes();
    }
}
