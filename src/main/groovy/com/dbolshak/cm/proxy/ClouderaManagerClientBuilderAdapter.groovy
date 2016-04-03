package com.dbolshak.cm.proxy

import com.cloudera.api.ClouderaManagerClientBuilder

/**
 * Created by dbolshak on 03/04/16.
 */
class ClouderaManagerClientBuilderAdapter {
    ClouderaManagerClientBuilder clouderaManagerClientBuilder
    String host
    String userName
    String password

    void init() {
        clouderaManagerClientBuilder
                .withHost(host)
                .withUsernamePassword(userName, password)
    }
}
