package com.example.cidaasv2.Service.Entity.MFA.SetupMFA.SMS;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown=true)
public class SetupSMSMFAResponseDataEntity implements Serializable {
    String statusId;

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
}
