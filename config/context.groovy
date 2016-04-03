package com.dbolshak.cm.proxy

import com.cloudera.api.ClouderaManagerClientBuilder

beans {
    clouderaManagerClientBuilder(ClouderaManagerClientBuilder)

    clouderaManagerClientBuilderAdapter(ClouderaManagerClientBuilderAdapter) { bean ->
        clouderaManagerClientBuilder = clouderaManagerClientBuilder
        host     = '192.168.1.11'
        userName = 'admin'
        password = 'admin'

        bean.initMethod = 'init'
    }
}
