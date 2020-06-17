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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents a virtual service returned by a list operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/VirtualServiceRef" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualServiceRef implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The full Amazon Resource Name (ARN) for the virtual service.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The name of the service mesh that the virtual service resides in.
     * </p>
     */
    private String meshName;
    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the
     * account that shared the mesh with your account. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * </p>
     */
    private String meshOwner;
    /**
     * <p>
     * The AWS IAM account ID of the resource owner. If the account ID is not your own, then it's the ID of the mesh
     * owner or of another account that the mesh is shared with. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * </p>
     */
    private String resourceOwner;
    /**
     * <p>
     * The version of the resource. Resources are created at version 1, and this version is incremented each time that
     * they're updated.
     * </p>
     */
    private Long version;
    /**
     * <p>
     * The name of the virtual service.
     * </p>
     */
    private String virtualServiceName;

    /**
     * <p>
     * The full Amazon Resource Name (ARN) for the virtual service.
     * </p>
     * 
     * @param arn
     *        The full Amazon Resource Name (ARN) for the virtual service.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) for the virtual service.
     * </p>
     * 
     * @return The full Amazon Resource Name (ARN) for the virtual service.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) for the virtual service.
     * </p>
     * 
     * @param arn
     *        The full Amazon Resource Name (ARN) for the virtual service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualServiceRef withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp in seconds for when the resource was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @return The Unix epoch timestamp in seconds for when the resource was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix epoch timestamp in seconds for when the resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualServiceRef withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The Unix epoch timestamp in seconds for when the resource was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was last updated.
     * </p>
     * 
     * @return The Unix epoch timestamp in seconds for when the resource was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The Unix epoch timestamp in seconds for when the resource was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The Unix epoch timestamp in seconds for when the resource was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualServiceRef withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The name of the service mesh that the virtual service resides in.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh that the virtual service resides in.
     */

    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh that the virtual service resides in.
     * </p>
     * 
     * @return The name of the service mesh that the virtual service resides in.
     */

    public String getMeshName() {
        return this.meshName;
    }

    /**
     * <p>
     * The name of the service mesh that the virtual service resides in.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh that the virtual service resides in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualServiceRef withMeshName(String meshName) {
        setMeshName(meshName);
        return this;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the
     * account that shared the mesh with your account. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * </p>
     * 
     * @param meshOwner
     *        The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of
     *        the account that shared the mesh with your account. For more information about mesh sharing, see <a
     *        href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     */

    public void setMeshOwner(String meshOwner) {
        this.meshOwner = meshOwner;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the
     * account that shared the mesh with your account. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * </p>
     * 
     * @return The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of
     *         the account that shared the mesh with your account. For more information about mesh sharing, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     */

    public String getMeshOwner() {
        return this.meshOwner;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the
     * account that shared the mesh with your account. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * </p>
     * 
     * @param meshOwner
     *        The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of
     *        the account that shared the mesh with your account. For more information about mesh sharing, see <a
     *        href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualServiceRef withMeshOwner(String meshOwner) {
        setMeshOwner(meshOwner);
        return this;
    }

    /**
     * <p>
     * The AWS IAM account ID of the resource owner. If the account ID is not your own, then it's the ID of the mesh
     * owner or of another account that the mesh is shared with. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * </p>
     * 
     * @param resourceOwner
     *        The AWS IAM account ID of the resource owner. If the account ID is not your own, then it's the ID of the
     *        mesh owner or of another account that the mesh is shared with. For more information about mesh sharing,
     *        see <a href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared
     *        meshes</a>.
     */

    public void setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    /**
     * <p>
     * The AWS IAM account ID of the resource owner. If the account ID is not your own, then it's the ID of the mesh
     * owner or of another account that the mesh is shared with. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * </p>
     * 
     * @return The AWS IAM account ID of the resource owner. If the account ID is not your own, then it's the ID of the
     *         mesh owner or of another account that the mesh is shared with. For more information about mesh sharing,
     *         see <a href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared
     *         meshes</a>.
     */

    public String getResourceOwner() {
        return this.resourceOwner;
    }

    /**
     * <p>
     * The AWS IAM account ID of the resource owner. If the account ID is not your own, then it's the ID of the mesh
     * owner or of another account that the mesh is shared with. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * </p>
     * 
     * @param resourceOwner
     *        The AWS IAM account ID of the resource owner. If the account ID is not your own, then it's the ID of the
     *        mesh owner or of another account that the mesh is shared with. For more information about mesh sharing,
     *        see <a href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared
     *        meshes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualServiceRef withResourceOwner(String resourceOwner) {
        setResourceOwner(resourceOwner);
        return this;
    }

    /**
     * <p>
     * The version of the resource. Resources are created at version 1, and this version is incremented each time that
     * they're updated.
     * </p>
     * 
     * @param version
     *        The version of the resource. Resources are created at version 1, and this version is incremented each time
     *        that they're updated.
     */

    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the resource. Resources are created at version 1, and this version is incremented each time that
     * they're updated.
     * </p>
     * 
     * @return The version of the resource. Resources are created at version 1, and this version is incremented each
     *         time that they're updated.
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the resource. Resources are created at version 1, and this version is incremented each time that
     * they're updated.
     * </p>
     * 
     * @param version
     *        The version of the resource. Resources are created at version 1, and this version is incremented each time
     *        that they're updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualServiceRef withVersion(Long version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The name of the virtual service.
     * </p>
     * 
     * @param virtualServiceName
     *        The name of the virtual service.
     */

    public void setVirtualServiceName(String virtualServiceName) {
        this.virtualServiceName = virtualServiceName;
    }

    /**
     * <p>
     * The name of the virtual service.
     * </p>
     * 
     * @return The name of the virtual service.
     */

    public String getVirtualServiceName() {
        return this.virtualServiceName;
    }

    /**
     * <p>
     * The name of the virtual service.
     * </p>
     * 
     * @param virtualServiceName
     *        The name of the virtual service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualServiceRef withVirtualServiceName(String virtualServiceName) {
        setVirtualServiceName(virtualServiceName);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getMeshName() != null)
            sb.append("MeshName: ").append(getMeshName()).append(",");
        if (getMeshOwner() != null)
            sb.append("MeshOwner: ").append(getMeshOwner()).append(",");
        if (getResourceOwner() != null)
            sb.append("ResourceOwner: ").append(getResourceOwner()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getVirtualServiceName() != null)
            sb.append("VirtualServiceName: ").append(getVirtualServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualServiceRef == false)
            return false;
        VirtualServiceRef other = (VirtualServiceRef) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getMeshName() == null ^ this.getMeshName() == null)
            return false;
        if (other.getMeshName() != null && other.getMeshName().equals(this.getMeshName()) == false)
            return false;
        if (other.getMeshOwner() == null ^ this.getMeshOwner() == null)
            return false;
        if (other.getMeshOwner() != null && other.getMeshOwner().equals(this.getMeshOwner()) == false)
            return false;
        if (other.getResourceOwner() == null ^ this.getResourceOwner() == null)
            return false;
        if (other.getResourceOwner() != null && other.getResourceOwner().equals(this.getResourceOwner()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getVirtualServiceName() == null ^ this.getVirtualServiceName() == null)
            return false;
        if (other.getVirtualServiceName() != null && other.getVirtualServiceName().equals(this.getVirtualServiceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getMeshName() == null) ? 0 : getMeshName().hashCode());
        hashCode = prime * hashCode + ((getMeshOwner() == null) ? 0 : getMeshOwner().hashCode());
        hashCode = prime * hashCode + ((getResourceOwner() == null) ? 0 : getResourceOwner().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getVirtualServiceName() == null) ? 0 : getVirtualServiceName().hashCode());
        return hashCode;
    }

    @Override
    public VirtualServiceRef clone() {
        try {
            return (VirtualServiceRef) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.VirtualServiceRefMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
