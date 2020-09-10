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
package com.amazonaws.services.ebs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.auth.SignerTypeAware;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/PutSnapshotBlock" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutSnapshotBlockRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable, SignerTypeAware {

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The block index of the block in which to write the data. A block index is a logical index in units of
     * <code>512</code> KiB blocks. To identify the block index, divide the logical offset of the data in the logical
     * volume by the block size (logical offset of data/<code>524288</code>). The logical offset of the data must be
     * <code>512</code> KiB aligned.
     * </p>
     */
    private Integer blockIndex;
    /**
     * <p>
     * The data to write to the block.
     * </p>
     * <p>
     * The block data is not signed as part of the Signature Version 4 signing process. As a result, you must generate
     * and provide a Base64-encoded SHA256 checksum for the block data using the <b>x-amz-Checksum</b> header. Also, you
     * must specify the checksum algorithm using the <b>x-amz-Checksum-Algorithm</b> header. The checksum that you
     * provide is part of the Signature Version 4 signing process. It is validated against a checksum generated by
     * Amazon EBS to ensure the validity and authenticity of the data. If the checksums do not correspond, the request
     * fails. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-accessing-snapshot.html#ebsapis-using-checksums">
     * Using checksums with the EBS direct APIs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private java.io.InputStream blockData;
    /**
     * <p>
     * The size of the data to write to the block, in bytes. Currently, the only supported size is <code>524288</code>.
     * </p>
     * <p>
     * Valid values: <code>524288</code>
     * </p>
     */
    private Integer dataLength;
    /**
     * <p>
     * The progress of the write process, as a percentage.
     * </p>
     */
    private Integer progress;
    /**
     * <p>
     * A Base64-encoded SHA256 checksum of the data. Only SHA256 checksums are supported.
     * </p>
     */
    private String checksum;
    /**
     * <p>
     * The algorithm used to generate the checksum. Currently, the only supported algorithm is <code>SHA256</code>.
     * </p>
     */
    private String checksumAlgorithm;

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @return The ID of the snapshot.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSnapshotBlockRequest withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The block index of the block in which to write the data. A block index is a logical index in units of
     * <code>512</code> KiB blocks. To identify the block index, divide the logical offset of the data in the logical
     * volume by the block size (logical offset of data/<code>524288</code>). The logical offset of the data must be
     * <code>512</code> KiB aligned.
     * </p>
     * 
     * @param blockIndex
     *        The block index of the block in which to write the data. A block index is a logical index in units of
     *        <code>512</code> KiB blocks. To identify the block index, divide the logical offset of the data in the
     *        logical volume by the block size (logical offset of data/<code>524288</code>). The logical offset of the
     *        data must be <code>512</code> KiB aligned.
     */

    public void setBlockIndex(Integer blockIndex) {
        this.blockIndex = blockIndex;
    }

    /**
     * <p>
     * The block index of the block in which to write the data. A block index is a logical index in units of
     * <code>512</code> KiB blocks. To identify the block index, divide the logical offset of the data in the logical
     * volume by the block size (logical offset of data/<code>524288</code>). The logical offset of the data must be
     * <code>512</code> KiB aligned.
     * </p>
     * 
     * @return The block index of the block in which to write the data. A block index is a logical index in units of
     *         <code>512</code> KiB blocks. To identify the block index, divide the logical offset of the data in the
     *         logical volume by the block size (logical offset of data/<code>524288</code>). The logical offset of the
     *         data must be <code>512</code> KiB aligned.
     */

    public Integer getBlockIndex() {
        return this.blockIndex;
    }

    /**
     * <p>
     * The block index of the block in which to write the data. A block index is a logical index in units of
     * <code>512</code> KiB blocks. To identify the block index, divide the logical offset of the data in the logical
     * volume by the block size (logical offset of data/<code>524288</code>). The logical offset of the data must be
     * <code>512</code> KiB aligned.
     * </p>
     * 
     * @param blockIndex
     *        The block index of the block in which to write the data. A block index is a logical index in units of
     *        <code>512</code> KiB blocks. To identify the block index, divide the logical offset of the data in the
     *        logical volume by the block size (logical offset of data/<code>524288</code>). The logical offset of the
     *        data must be <code>512</code> KiB aligned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSnapshotBlockRequest withBlockIndex(Integer blockIndex) {
        setBlockIndex(blockIndex);
        return this;
    }

    /**
     * <p>
     * The data to write to the block.
     * </p>
     * <p>
     * The block data is not signed as part of the Signature Version 4 signing process. As a result, you must generate
     * and provide a Base64-encoded SHA256 checksum for the block data using the <b>x-amz-Checksum</b> header. Also, you
     * must specify the checksum algorithm using the <b>x-amz-Checksum-Algorithm</b> header. The checksum that you
     * provide is part of the Signature Version 4 signing process. It is validated against a checksum generated by
     * Amazon EBS to ensure the validity and authenticity of the data. If the checksums do not correspond, the request
     * fails. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-accessing-snapshot.html#ebsapis-using-checksums">
     * Using checksums with the EBS direct APIs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param blockData
     *        The data to write to the block.</p>
     *        <p>
     *        The block data is not signed as part of the Signature Version 4 signing process. As a result, you must
     *        generate and provide a Base64-encoded SHA256 checksum for the block data using the <b>x-amz-Checksum</b>
     *        header. Also, you must specify the checksum algorithm using the <b>x-amz-Checksum-Algorithm</b> header.
     *        The checksum that you provide is part of the Signature Version 4 signing process. It is validated against
     *        a checksum generated by Amazon EBS to ensure the validity and authenticity of the data. If the checksums
     *        do not correspond, the request fails. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-accessing-snapshot.html#ebsapis-using-checksums">
     *        Using checksums with the EBS direct APIs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setBlockData(java.io.InputStream blockData) {
        this.blockData = blockData;
    }

    /**
     * <p>
     * The data to write to the block.
     * </p>
     * <p>
     * The block data is not signed as part of the Signature Version 4 signing process. As a result, you must generate
     * and provide a Base64-encoded SHA256 checksum for the block data using the <b>x-amz-Checksum</b> header. Also, you
     * must specify the checksum algorithm using the <b>x-amz-Checksum-Algorithm</b> header. The checksum that you
     * provide is part of the Signature Version 4 signing process. It is validated against a checksum generated by
     * Amazon EBS to ensure the validity and authenticity of the data. If the checksums do not correspond, the request
     * fails. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-accessing-snapshot.html#ebsapis-using-checksums">
     * Using checksums with the EBS direct APIs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return The data to write to the block.</p>
     *         <p>
     *         The block data is not signed as part of the Signature Version 4 signing process. As a result, you must
     *         generate and provide a Base64-encoded SHA256 checksum for the block data using the <b>x-amz-Checksum</b>
     *         header. Also, you must specify the checksum algorithm using the <b>x-amz-Checksum-Algorithm</b> header.
     *         The checksum that you provide is part of the Signature Version 4 signing process. It is validated against
     *         a checksum generated by Amazon EBS to ensure the validity and authenticity of the data. If the checksums
     *         do not correspond, the request fails. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-accessing-snapshot.html#ebsapis-using-checksums"
     *         > Using checksums with the EBS direct APIs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public java.io.InputStream getBlockData() {
        return this.blockData;
    }

    /**
     * <p>
     * The data to write to the block.
     * </p>
     * <p>
     * The block data is not signed as part of the Signature Version 4 signing process. As a result, you must generate
     * and provide a Base64-encoded SHA256 checksum for the block data using the <b>x-amz-Checksum</b> header. Also, you
     * must specify the checksum algorithm using the <b>x-amz-Checksum-Algorithm</b> header. The checksum that you
     * provide is part of the Signature Version 4 signing process. It is validated against a checksum generated by
     * Amazon EBS to ensure the validity and authenticity of the data. If the checksums do not correspond, the request
     * fails. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-accessing-snapshot.html#ebsapis-using-checksums">
     * Using checksums with the EBS direct APIs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param blockData
     *        The data to write to the block.</p>
     *        <p>
     *        The block data is not signed as part of the Signature Version 4 signing process. As a result, you must
     *        generate and provide a Base64-encoded SHA256 checksum for the block data using the <b>x-amz-Checksum</b>
     *        header. Also, you must specify the checksum algorithm using the <b>x-amz-Checksum-Algorithm</b> header.
     *        The checksum that you provide is part of the Signature Version 4 signing process. It is validated against
     *        a checksum generated by Amazon EBS to ensure the validity and authenticity of the data. If the checksums
     *        do not correspond, the request fails. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-accessing-snapshot.html#ebsapis-using-checksums">
     *        Using checksums with the EBS direct APIs</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSnapshotBlockRequest withBlockData(java.io.InputStream blockData) {
        setBlockData(blockData);
        return this;
    }

    /**
     * <p>
     * The size of the data to write to the block, in bytes. Currently, the only supported size is <code>524288</code>.
     * </p>
     * <p>
     * Valid values: <code>524288</code>
     * </p>
     * 
     * @param dataLength
     *        The size of the data to write to the block, in bytes. Currently, the only supported size is
     *        <code>524288</code>.</p>
     *        <p>
     *        Valid values: <code>524288</code>
     */

    public void setDataLength(Integer dataLength) {
        this.dataLength = dataLength;
    }

    /**
     * <p>
     * The size of the data to write to the block, in bytes. Currently, the only supported size is <code>524288</code>.
     * </p>
     * <p>
     * Valid values: <code>524288</code>
     * </p>
     * 
     * @return The size of the data to write to the block, in bytes. Currently, the only supported size is
     *         <code>524288</code>.</p>
     *         <p>
     *         Valid values: <code>524288</code>
     */

    public Integer getDataLength() {
        return this.dataLength;
    }

    /**
     * <p>
     * The size of the data to write to the block, in bytes. Currently, the only supported size is <code>524288</code>.
     * </p>
     * <p>
     * Valid values: <code>524288</code>
     * </p>
     * 
     * @param dataLength
     *        The size of the data to write to the block, in bytes. Currently, the only supported size is
     *        <code>524288</code>.</p>
     *        <p>
     *        Valid values: <code>524288</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSnapshotBlockRequest withDataLength(Integer dataLength) {
        setDataLength(dataLength);
        return this;
    }

    /**
     * <p>
     * The progress of the write process, as a percentage.
     * </p>
     * 
     * @param progress
     *        The progress of the write process, as a percentage.
     */

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * The progress of the write process, as a percentage.
     * </p>
     * 
     * @return The progress of the write process, as a percentage.
     */

    public Integer getProgress() {
        return this.progress;
    }

    /**
     * <p>
     * The progress of the write process, as a percentage.
     * </p>
     * 
     * @param progress
     *        The progress of the write process, as a percentage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSnapshotBlockRequest withProgress(Integer progress) {
        setProgress(progress);
        return this;
    }

    /**
     * <p>
     * A Base64-encoded SHA256 checksum of the data. Only SHA256 checksums are supported.
     * </p>
     * 
     * @param checksum
     *        A Base64-encoded SHA256 checksum of the data. Only SHA256 checksums are supported.
     */

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * <p>
     * A Base64-encoded SHA256 checksum of the data. Only SHA256 checksums are supported.
     * </p>
     * 
     * @return A Base64-encoded SHA256 checksum of the data. Only SHA256 checksums are supported.
     */

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * <p>
     * A Base64-encoded SHA256 checksum of the data. Only SHA256 checksums are supported.
     * </p>
     * 
     * @param checksum
     *        A Base64-encoded SHA256 checksum of the data. Only SHA256 checksums are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutSnapshotBlockRequest withChecksum(String checksum) {
        setChecksum(checksum);
        return this;
    }

    /**
     * <p>
     * The algorithm used to generate the checksum. Currently, the only supported algorithm is <code>SHA256</code>.
     * </p>
     * 
     * @param checksumAlgorithm
     *        The algorithm used to generate the checksum. Currently, the only supported algorithm is
     *        <code>SHA256</code>.
     * @see ChecksumAlgorithm
     */

    public void setChecksumAlgorithm(String checksumAlgorithm) {
        this.checksumAlgorithm = checksumAlgorithm;
    }

    /**
     * <p>
     * The algorithm used to generate the checksum. Currently, the only supported algorithm is <code>SHA256</code>.
     * </p>
     * 
     * @return The algorithm used to generate the checksum. Currently, the only supported algorithm is
     *         <code>SHA256</code>.
     * @see ChecksumAlgorithm
     */

    public String getChecksumAlgorithm() {
        return this.checksumAlgorithm;
    }

    /**
     * <p>
     * The algorithm used to generate the checksum. Currently, the only supported algorithm is <code>SHA256</code>.
     * </p>
     * 
     * @param checksumAlgorithm
     *        The algorithm used to generate the checksum. Currently, the only supported algorithm is
     *        <code>SHA256</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChecksumAlgorithm
     */

    public PutSnapshotBlockRequest withChecksumAlgorithm(String checksumAlgorithm) {
        setChecksumAlgorithm(checksumAlgorithm);
        return this;
    }

    /**
     * <p>
     * The algorithm used to generate the checksum. Currently, the only supported algorithm is <code>SHA256</code>.
     * </p>
     * 
     * @param checksumAlgorithm
     *        The algorithm used to generate the checksum. Currently, the only supported algorithm is
     *        <code>SHA256</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChecksumAlgorithm
     */

    public PutSnapshotBlockRequest withChecksumAlgorithm(ChecksumAlgorithm checksumAlgorithm) {
        this.checksumAlgorithm = checksumAlgorithm.toString();
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
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getBlockIndex() != null)
            sb.append("BlockIndex: ").append(getBlockIndex()).append(",");
        if (getBlockData() != null)
            sb.append("BlockData: ").append("***Sensitive Data Redacted***").append(",");
        if (getDataLength() != null)
            sb.append("DataLength: ").append(getDataLength()).append(",");
        if (getProgress() != null)
            sb.append("Progress: ").append(getProgress()).append(",");
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum()).append(",");
        if (getChecksumAlgorithm() != null)
            sb.append("ChecksumAlgorithm: ").append(getChecksumAlgorithm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSnapshotBlockRequest == false)
            return false;
        PutSnapshotBlockRequest other = (PutSnapshotBlockRequest) obj;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getBlockIndex() == null ^ this.getBlockIndex() == null)
            return false;
        if (other.getBlockIndex() != null && other.getBlockIndex().equals(this.getBlockIndex()) == false)
            return false;
        if (other.getBlockData() == null ^ this.getBlockData() == null)
            return false;
        if (other.getBlockData() != null && other.getBlockData().equals(this.getBlockData()) == false)
            return false;
        if (other.getDataLength() == null ^ this.getDataLength() == null)
            return false;
        if (other.getDataLength() != null && other.getDataLength().equals(this.getDataLength()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getChecksumAlgorithm() == null ^ this.getChecksumAlgorithm() == null)
            return false;
        if (other.getChecksumAlgorithm() != null && other.getChecksumAlgorithm().equals(this.getChecksumAlgorithm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getBlockIndex() == null) ? 0 : getBlockIndex().hashCode());
        hashCode = prime * hashCode + ((getBlockData() == null) ? 0 : getBlockData().hashCode());
        hashCode = prime * hashCode + ((getDataLength() == null) ? 0 : getDataLength().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode + ((getChecksumAlgorithm() == null) ? 0 : getChecksumAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public PutSnapshotBlockRequest clone() {
        return (PutSnapshotBlockRequest) super.clone();
    }

    @Override
    public String getSignerType() {
        return "AWS4UnsignedPayloadSignerType";
    }

}
