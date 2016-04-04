package com.dbolshak.cm.proxy

import com.cloudera.api.DataView

import org.junit.Test

import org.springframework.context.ApplicationContext
import org.springframework.context.support.GenericGroovyApplicationContext

import static org.junit.Assert.assertEquals

class GroovyBeanBuilderTests {

    @Test
    void testSimple() {
        ApplicationContext context = new GenericGroovyApplicationContext('file:config/context.groovy');

        def bean = context.getBean('rootResourceHolder', RootResourceHolder.class)

        assertEquals('ApiClusterList{values=[ApiCluster{name=cluster, version=CDH5, fullVersion=5.5.1}]}',
                bean.rootResource.clustersResource.readClusters(DataView.EXPORT).toString())
    }
}
