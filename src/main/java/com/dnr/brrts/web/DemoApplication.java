package com.dnr.brrts.web;


import com.dnr.brrts.web.repository.FacActivityDetailRepository;
import com.dnr.brrts.web.service.FacilityServiceImpl;
import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.apache.tomcat.util.descriptor.web.ContextResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.web.WebApplicationInitializer;

import javax.naming.NamingException;
import javax.sql.DataSource;


@SpringBootApplication
@ComponentScan("com.dnr.brrts.web")
public class DemoApplication extends SpringBootServletInitializer implements WebApplicationInitializer{
//
//	@Autowired
//	DataSource dataSource;

    @Autowired
    FacilityServiceImpl facilityService;

    @Autowired
    FacActivityDetailRepository activityRepository;

    private final static Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {


//         DemoApplication application = new DemoApplication();
//        try {
//            application.run();
//        } catch (Exception e) {
//            logger.error("exception" + e + e.getMessage());
//        }
        SpringApplication.run(DemoApplication.class, args);

    }

//        @Transactional(readOnly = true)
//	    public void run() throws Exception {
//
//	    //    System.out.println("DATASOURCE = " + dataSource);
//
//       //     List<Facility> facility = facilityRepository.findByDetailSeqNo(20001L);
//
//	    //    System.out.println(facility.get(0).getActCode() + "Detail Seq Number" + facility.get(0).getDetailSeqNo());
//
////            logger.info("Facility Test");
////            Facility facility = new Facility();
////            facility.setFacilityName("Test Name");
////            facility.setCreatedDate(LocalDateTime.now());
////            facility.setUpdatedDate(LocalDateTime.now());
////            Facility returnedFacility = facilityService.saveFacility(facility);
////            logger.info(returnedFacility.getFacilityName());
//	    }





}