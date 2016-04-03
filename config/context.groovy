package com.dbolshak.cm.proxy

import com.cloudera.api.ClouderaManagerClientBuilder
//import com.cloudera.api.DataView
//import com.cloudera.api.model.ApiClusterList

beans {
    clouderaManagerClientBuilder(ClouderaManagerClientBuilder)

    rootResourceHolder(
            RootResourceHolder,
            clouderaManagerClientBuilder,
            '192.168.1.11',
            'admin',
            'admin'
    )
//    apiClusterList(ApiClusterList) {
//        clusters = rootResourceHolder
//                .rootResource
//                .readClusters(DataView.EXPORT)
//    }
}
