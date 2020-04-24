package com.kusu.awsintegration.aws

/**
 * Created by Koushik on 24/4/20.
 */
class AwsUtils(daoSession: DaoSession) : AwsConfigDBInteractionListener {

    private val awsRepo = AwsRepository(daoSession, this)

    fun setupAwsConfig() {

    }

    fun uploadFile() {

    }

    fun downloadFile() {

    }

    override fun onInsertionSuccess() {

    }

    override fun onInsertFailure() {

    }

    override fun onFetchSuccess(result: AwsConfig?) {

    }

    override fun onDataFetchFailure() {

    }
}