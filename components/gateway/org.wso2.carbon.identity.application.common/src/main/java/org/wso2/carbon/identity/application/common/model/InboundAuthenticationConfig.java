/*
 * Copyright (c) 2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.application.common.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InboundAuthenticationConfig implements Serializable {

    private static final long serialVersionUID = 2768674144259414077L;

    private InboundAuthenticationRequestConfig[] inboundAuthenticationRequestConfigs = new
            InboundAuthenticationRequestConfig[0];


    /**
     * @return
     */
    public InboundAuthenticationRequestConfig[] getInboundAuthenticationRequestConfigs() {
        return inboundAuthenticationRequestConfigs;
    }


    public void setInboundAuthenticationRequestConfigs(
            InboundAuthenticationRequestConfig[] inboundAuthenticationRequestConfigs) {
        this.inboundAuthenticationRequestConfigs = inboundAuthenticationRequestConfigs;
    }
}
