package org.digilinq.spring.properties.config;


import org.digilinq.spring.properties.model.SecurityPolicy;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@PropertySource(name = "props", value = "classpath:security.properties", ignoreResourceNotFound = false)
@ConfigurationProperties(prefix = "security")
public class SecurityConfig {
    private List<SecurityPolicy> securityPolicies;

    public List<SecurityPolicy> getSecurityPolicies() {
        return securityPolicies;
    }

    public void setSecurityPolicies(List<SecurityPolicy> securityPolicies) {
        this.securityPolicies = securityPolicies;
    }
}
