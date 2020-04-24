package com.kusu.awsintegration

import android.app.Application
import com.facebook.stetho.Stetho
import com.facebook.stetho.okhttp3.StethoInterceptor
import com.kusu.awsintegration.aws.DaoMaster
import com.kusu.awsintegration.aws.DaoMaster.DevOpenHelper
import com.kusu.awsintegration.aws.DaoSession
import okhttp3.OkHttpClient
import org.greenrobot.greendao.database.Database

/**
 * Created by Koushik on 24/4/20.
 */
class AwsApplication : Application() {
    private lateinit var mDaoSession: DaoSession

    override fun onCreate() {
        super.onCreate()

        val helper = DevOpenHelper(this, "aws-db")
        val db: Database = helper.writableDb
        mDaoSession = DaoMaster(db).newSession()

        Stetho.initializeWithDefaults(this)

        Stetho.initialize(
            Stetho.newInitializerBuilder(this)
                .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
                .build()
        )

        OkHttpClient.Builder()
            .addNetworkInterceptor(StethoInterceptor())
            .build()

    }

    fun getDaoSession(): DaoSession {
        return mDaoSession
    }
}