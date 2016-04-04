package com.dbolshak.cm.proxy

import org.springframework.beans.factory.config.BeanDefinition

beans {
    clientBuilder(com.cloudera.api.ClouderaManagerClientBuilder) { bean ->
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
