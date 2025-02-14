package com.furkan.loans.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "loans")
@Getter
@Setter
public class LoansContactInfoDTO {
    //when we use record class for config, object of this class is created during the startup. We cannot change the property values at runtime by invoking setter method.
    //because all fields are final. we need to use normal class insted of  record class
    //this will allow our microservices to change the property values at runtime.
    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;
}
