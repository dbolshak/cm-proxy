package com.dbolshak.cm.proxy

import com.cloudera.api.ClouderaManagerClientBuilder
import com.cloudera.api.v11.RootResourceV11

/**
 * Created by dbolshak on 03/04/16.
 */
class RootResourceHolder {
    final RootResourceV11 rootResource

    RootResourceHolder(ClouderaManagerClientBuilder clientBuilder, String host,
                                        String userName, String password) {
        rootResource = clientBuilder
                .withHost(host)
                .withUsernamePassword(userName, password)
                .build()
                .rootV11
    }
}
