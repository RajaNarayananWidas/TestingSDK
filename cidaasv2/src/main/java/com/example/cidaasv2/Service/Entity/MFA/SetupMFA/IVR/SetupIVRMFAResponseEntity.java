package com.example.cidaasv2.Service.Entity.MFA.SetupMFA.IVR;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown=true)
public class SetupIVRMFAResponseEntity implements Serializable{
    private boolean success;
    private int status;
    private SetupIVRMFAResponseDataEntity data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public SetupIVRMFAResponseDataEntity getData() {
        return data;
    }

    public void setData(SetupIVRMFAResponseDataEntity data) {
        this.data = data;
    }
}
