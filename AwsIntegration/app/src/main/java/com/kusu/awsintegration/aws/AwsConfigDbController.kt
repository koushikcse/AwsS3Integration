package com.kusu.awsintegration.aws

/**
 * Created by Koushik on 24/4/20.
 */
class AwsConfigDbController(private val daoSession: DaoSession) {

    /**
     * Add new AwsConfig in db
     */
    fun addAwsConfig(awsConfig: AwsConfig) {
        daoSession.awsConfigDao?.insertOrReplace(awsConfig)
    }

    /**
     * Fetch AwsConfig with accountId
     */
    fun getAwsConfig(accountId: String): AwsConfig? {
        val queryBuilder = daoSession.awsConfigDao?.queryBuilder()
        queryBuilder?.where(AwsConfigDao.Properties.AccountId.eq(accountId))
        return queryBuilder?.build()?.unique()
    }

    /**
     * Delete AwsConfig
     */
    fun deleteAwsConfig(awsConfig: AwsConfig) {
        try {
            daoSession.awsConfigDao?.delete(awsConfig)
        } catch (e: Exception) {
        }
    }
}