/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.ws.qaf.rest;

import junit.framework.Test;
import org.netbeans.jellytools.modules.j2ee.J2eeTestCase.Server;

/**
 * Tests for New REST web services from Entity Classes wizard
 *
 * Duration of this test suite: aprox. 3min
 *
 * @author lukas
 */
public class JEE6MvnCRUDTest extends MvnCRUDTest {

    /** Default constructor.
     * @param testName name of particular test case
     */
    public JEE6MvnCRUDTest(String name) {
        super(name);
    }

    @Override
    protected JavaEEVersion getJavaEEversion() {
        return JavaEEVersion.JAVAEE6;
    }

    /**
     * Creates suite from particular test cases. You can define order of testcases here.
     */
    public static Test suite() {
        return createAllModulesServerSuite(Server.GLASSFISH, JEE6MvnCRUDTest.class,
                "testRfE", //NOI18N
                "testPropAccess", //NOI18N
                "testRun", //NOI18N
                "testCreateRestClient", //NOI18N
                "testUndeploy"); //NOI18N
    }
}
