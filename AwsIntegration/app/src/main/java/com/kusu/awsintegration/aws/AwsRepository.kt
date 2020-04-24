package com.kusu.awsintegration.aws

import android.os.AsyncTask

/**
 * Created by Koushik on 24/4/20.
 */
class AwsRepository(
    daoSession: DaoSession,
    private val awsDBInteractionListener: AwsConfigDBInteractionListener
) {
    private val awsConfigDbController = AwsConfigDbController(daoSession)

    fun addAwsConfig(awsConfig: AwsConfig) {
        class InsertionAsyncTask : AsyncTask<Void, Void, Unit>() {
            override fun doInBackground(vararg p0: Void?) {
                awsConfigDbController.addAwsConfig(awsConfig)
            }

            override fun onPostExecute(result: Unit?) {
                super.onPostExecute(result)
                awsDBInteractionListener.onInsertionSuccess()
            }
        }

        try {
            InsertionAsyncTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR)
        } catch (e: Exception) {
            e.printStackTrace()
            awsDBInteractionListener.onInsertFailure()
        }
    }

    fun getAwsConfig(accountId: String) {
        class DataFetchAsyncTask : AsyncTask<Void, Void, AwsConfig?>() {
            override fun doInBackground(vararg params: Void?): AwsConfig? {
                return awsConfigDbController.getAwsConfig(accountId)
            }

            override fun onPostExecute(result: AwsConfig?) {
                super.onPostExecute(result)
                awsDBInteractionListener.onFetchSuccess(result)
            }
        }

        try {
            DataFetchAsyncTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR)
        } catch (e: Exception) {
            e.printStackTrace()
            awsDBInteractionListener.onDataFetchFailure()
        }
    }

}