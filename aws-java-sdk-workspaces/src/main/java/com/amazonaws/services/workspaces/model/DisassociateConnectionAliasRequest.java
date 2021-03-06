/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DisassociateConnectionAlias"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateConnectionAliasRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the connection alias to disassociate.
     * </p>
     */
    private String aliasId;

    /**
     * <p>
     * The identifier of the connection alias to disassociate.
     * </p>
     * 
     * @param aliasId
     *        The identifier of the connection alias to disassociate.
     */

    public void setAliasId(String aliasId) {
        this.aliasId = aliasId;
    }

    /**
     * <p>
     * The identifier of the connection alias to disassociate.
     * </p>
     * 
     * @return The identifier of the connection alias to disassociate.
     */

    public String getAliasId() {
        return this.aliasId;
    }

    /**
     * <p>
     * The identifier of the connection alias to disassociate.
     * </p>
     * 
     * @param aliasId
     *        The identifier of the connection alias to disassociate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateConnectionAliasRequest withAliasId(String aliasId) {
        setAliasId(aliasId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAliasId() != null)
            sb.append("AliasId: ").append(getAliasId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateConnectionAliasRequest == false)
            return false;
        DisassociateConnectionAliasRequest other = (DisassociateConnectionAliasRequest) obj;
        if (other.getAliasId() == null ^ this.getAliasId() == null)
            return false;
        if (other.getAliasId() != null && other.getAliasId().equals(this.getAliasId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAliasId() == null) ? 0 : getAliasId().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateConnectionAliasRequest clone() {
        return (DisassociateConnectionAliasRequest) super.clone();
    }

}
