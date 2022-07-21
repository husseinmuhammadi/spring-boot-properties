package org.digilinq.spring.properties.model;

public final class SecurityPolicy {
    private String policyName;
    private String effectiveDate;
    private String applyOn;
    private String passwordComplexity;

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getApplyOn() {
        return applyOn;
    }

    public void setApplyOn(String applyOn) {
        this.applyOn = applyOn;
    }

    public String getPasswordComplexity() {
        return passwordComplexity;
    }

    public void setPasswordComplexity(String passwordComplexity) {
        this.passwordComplexity = passwordComplexity;
    }
}