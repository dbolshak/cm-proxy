package com.dbolshak.cm.proxy

import com.cloudera.api.ClouderaManagerClientBuilder
import org.springframework.beans.factory.config.BeanDefinition

beans {
    clientBuilder(ClouderaManagerClientBuilder) { bean ->

        bean.scope = BeanDefinition.SCOPE_PROTOTYPE
        bean.lazyInit = true
    }

    rootResourceHolder(
            RootResourceHolder,
            clientBuilder,
            'uat-5-scm.kyc.megafon.ru',
            'admin',
            'admin') { bean ->
        bean.scope = BeanDefinition.SCOPE_PROTOTYPE
        bean.lazyInit = true
    }
}
