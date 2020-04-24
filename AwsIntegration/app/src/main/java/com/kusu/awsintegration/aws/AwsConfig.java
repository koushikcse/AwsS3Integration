package com.kusu.awsintegration.aws;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Koushik on 24/4/20.
 */

@Entity(nameInDb = "AwsConfig", indexes = {
        @Index(value = "accountId", unique = true)
})
public class AwsConfig implements Parcelable {

    @SerializedName("accountId")
    @Expose
    private String accountId;
    @SerializedName("bucketName")
    @Expose
    private String bucketName;
    @SerializedName("cognitoRegionType")
    @Expose
    private String cognitoRegionType;
    @SerializedName("defaultServiceRegionType")
    @Expose
    private String defaultServiceRegionType;
    @SerializedName("identityPoolId")
    @Expose
    private String identityPoolId;
    @SerializedName("rootPath")
    @Expose
    private String rootPath;
    @SerializedName("neutralBucketName")
    @Expose
    private String neutralBucketName;
    @SerializedName("neutralBucketRootFolderName")
    @Expose
    private String neutralBucketRootFolderName;
    @SerializedName("syncDate")
    @Expose
    private String syncDate;

    @Generated(hash = 2138871816)
    public AwsConfig(String accountId, String bucketName, String cognitoRegionType,
            String defaultServiceRegionType, String identityPoolId, String rootPath,
            String neutralBucketName, String neutralBucketRootFolderName,
            String syncDate) {
        this.accountId = accountId;
        this.bucketName = bucketName;
        this.cognitoRegionType = cognitoRegionType;
        this.defaultServiceRegionType = defaultServiceRegionType;
        this.identityPoolId = identityPoolId;
        this.rootPath = rootPath;
        this.neutralBucketName = neutralBucketName;
        this.neutralBucketRootFolderName = neutralBucketRootFolderName;
        this.syncDate = syncDate;
    }

    @Generated(hash = 1005416114)
    public AwsConfig() {
    }

    protected AwsConfig(Parcel in) {
        accountId = in.readString();
        bucketName = in.readString();
        cognitoRegionType = in.readString();
        defaultServiceRegionType = in.readString();
        identityPoolId = in.readString();
        rootPath = in.readString();
        neutralBucketName = in.readString();
        neutralBucketRootFolderName = in.readString();
        syncDate = in.readString();
    }

    public static final Creator<AwsConfig> CREATOR = new Creator<AwsConfig>() {
        @Override
        public AwsConfig createFromParcel(Parcel in) {
            return new AwsConfig(in);
        }

        @Override
        public AwsConfig[] newArray(int size) {
            return new AwsConfig[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(accountId);
        dest.writeString(bucketName);
        dest.writeString(cognitoRegionType);
        dest.writeString(defaultServiceRegionType);
        dest.writeString(identityPoolId);
        dest.writeString(rootPath);
        dest.writeString(neutralBucketName);
        dest.writeString(neutralBucketRootFolderName);
        dest.writeString(syncDate);
    }
}
