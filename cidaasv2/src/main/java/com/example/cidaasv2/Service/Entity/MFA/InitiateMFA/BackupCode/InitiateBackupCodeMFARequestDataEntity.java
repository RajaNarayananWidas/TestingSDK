package com.example.cidaasv2.Service.Entity.MFA.InitiateMFA.BackupCode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InitiateBackupCodeMFARequestDataEntity implements Serializable{
   String deviceId;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
