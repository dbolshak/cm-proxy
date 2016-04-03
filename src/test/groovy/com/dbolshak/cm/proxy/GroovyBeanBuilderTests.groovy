package com.dbolshak.cm.proxy

import com.cloudera.api.DataView
import org.junit.Test
import org.springframework.context.ApplicationContext
import org.springframework.context.support.GenericGroovyApplicationContext

import static org.junit.Assert.assertEquals

public class GroovyBeanBuilderTests {

    @Test
    public void testSimple() {
        ApplicationContext context = new GenericGroovyApplicationContext('file:config/context.groovy');

        def bean = context
                .getBean('rootResourceHolder', RootResourceHolder.class)
                .rootResource
                .clustersResource
                .readClusters(DataView.EXPORT)

        assertEquals('ApiClusterList{values=[]}', bean.toString())
    }
}
