package com.kusu.awsintegration.aws;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Index;

/**
 * Created by Koushik on 24/4/20.
 */

@Entity(nameInDb = "AwsConfig", indexes = {
        @Index(value = "accountId", unique = true)
})
public class AwsConfig {
    private String accountId;
    private String bucketName;
    private String cognitoRegionType;
    private String defaultServiceRegionType;
    private String identityPoolId;
    private String rootPath;
    private String neutralBucketName;
    private String neutralBucketRootFolderName;
    private String syncDate;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getCognitoRegionType() {
        return cognitoRegionType;
    }

    public void setCognitoRegionType(String cognitoRegionType) {
        this.cognitoRegionType = cognitoRegionType;
    }

    public String getDefaultServiceRegionType() {
        return defaultServiceRegionType;
    }

    public void setDefaultServiceRegionType(String defaultServiceRegionType) {
        this.defaultServiceRegionType = defaultServiceRegionType;
    }

    public String getIdentityPoolId() {
        return identityPoolId;
    }

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    public String getRootPath() {
        return rootPath;
    }

    public void setRootPath(String rootPath) {
        this.rootPath = rootPath;
    }

    public String getNeutralBucketName() {
        return neutralBucketName;
    }

    public void setNeutralBucketName(String neutralBucketName) {
        this.neutralBucketName = neutralBucketName;
    }

    public String getNeutralBucketRootFolderName() {
        return neutralBucketRootFolderName;
    }

    public void setNeutralBucketRootFolderName(String neutralBucketRootFolderName) {
        this.neutralBucketRootFolderName = neutralBucketRootFolderName;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }
}
