package com.furkan.accounts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

//POJO class which represents all of the properties defined in yaml file.
@ConfigurationProperties(prefix = "accounts")//configuration prefix in yaml file. Spring will create a bean of this class
public record AccountsContactInfoDTO(String message, Map<String, String> contactDetails, List<String> onCallSupport) {
    //during the startup spring boot will read all the properties with prefix value as accounts and map those values to the fields present inside this class
    //people can read the data from record class but they cannot change.
    //values are final and private
    /*
    automatically generates:
    - A constructor.
    - Getter methods (accessor methods).
    - `toString` method.
    - `equals` and `hashCode` methods.
     */
}
