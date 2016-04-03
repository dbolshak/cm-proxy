package com.dbolshak.cm.proxy

import com.cloudera.api.ClouderaManagerClientBuilder
import org.junit.Test
import org.springframework.context.ApplicationContext
import org.springframework.context.support.GenericGroovyApplicationContext

import static org.junit.Assert.assertEquals

public class GroovyBeanBuilderTests {

    @Test
    public void testSimple() {
        ApplicationContext context = new GenericGroovyApplicationContext('file:config/context.groovy');

        ClouderaManagerClientBuilder clouderaManagerClientBuilder = context.getBean('clouderaManagerClientBuilderAdapter',
                ClouderaManagerClientBuilderAdapter.class).clouderaManagerClientBuilder

        assertEquals('http://192.168.1.11:7180/api/', clouderaManagerClientBuilder.generateAddress())
    }
}
