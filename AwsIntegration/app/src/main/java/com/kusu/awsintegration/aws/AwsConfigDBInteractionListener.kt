package com.kusu.awsintegration.aws

/**
 * Created by Koushik on 24/4/20.
 */
interface AwsConfigDBInteractionListener {
    fun onInsertionSuccess()
    fun onInsertFailure()
    fun onFetchSuccess(result: AwsConfig?)
    fun onDataFetchFailure()
}