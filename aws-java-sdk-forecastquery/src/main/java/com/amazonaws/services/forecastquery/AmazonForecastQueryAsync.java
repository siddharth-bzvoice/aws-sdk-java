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
package com.amazonaws.services.forecastquery;

import javax.annotation.Generated;

import com.amazonaws.services.forecastquery.model.*;

/**
 * Interface for accessing Amazon Forecast Query Service asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.forecastquery.AbstractAmazonForecastQueryAsync} instead.
 * </p>
 * <p>
 * <p>
 * Provides APIs for creating and managing Amazon Forecast resources.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonForecastQueryAsync extends AmazonForecastQuery {

    /**
     * <p>
     * Retrieves a forecast for a single item, filtered by the supplied criteria.
     * </p>
     * <p>
     * The criteria is a key-value pair. The key is either <code>item_id</code> (or the equivalent non-timestamp,
     * non-target field) from the <code>TARGET_TIME_SERIES</code> dataset, or one of the forecast dimensions specified
     * as part of the <code>FeaturizationConfig</code> object.
     * </p>
     * <p>
     * By default, <code>QueryForecast</code> returns the complete date range for the filtered forecast. You can request
     * a specific date range.
     * </p>
     * <p>
     * To get the full forecast, use the <a
     * href="https://docs.aws.amazon.com/en_us/forecast/latest/dg/API_CreateForecastExportJob.html"
     * >CreateForecastExportJob</a> operation.
     * </p>
     * <note>
     * <p>
     * The forecasts generated by Amazon Forecast are in the same timezone as the dataset that was used to create the
     * predictor.
     * </p>
     * </note>
     * 
     * @param queryForecastRequest
     * @return A Java Future containing the result of the QueryForecast operation returned by the service.
     * @sample AmazonForecastQueryAsync.QueryForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecastquery-2018-06-26/QueryForecast" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<QueryForecastResult> queryForecastAsync(QueryForecastRequest queryForecastRequest);

    /**
     * <p>
     * Retrieves a forecast for a single item, filtered by the supplied criteria.
     * </p>
     * <p>
     * The criteria is a key-value pair. The key is either <code>item_id</code> (or the equivalent non-timestamp,
     * non-target field) from the <code>TARGET_TIME_SERIES</code> dataset, or one of the forecast dimensions specified
     * as part of the <code>FeaturizationConfig</code> object.
     * </p>
     * <p>
     * By default, <code>QueryForecast</code> returns the complete date range for the filtered forecast. You can request
     * a specific date range.
     * </p>
     * <p>
     * To get the full forecast, use the <a
     * href="https://docs.aws.amazon.com/en_us/forecast/latest/dg/API_CreateForecastExportJob.html"
     * >CreateForecastExportJob</a> operation.
     * </p>
     * <note>
     * <p>
     * The forecasts generated by Amazon Forecast are in the same timezone as the dataset that was used to create the
     * predictor.
     * </p>
     * </note>
     * 
     * @param queryForecastRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the QueryForecast operation returned by the service.
     * @sample AmazonForecastQueryAsyncHandler.QueryForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecastquery-2018-06-26/QueryForecast" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<QueryForecastResult> queryForecastAsync(QueryForecastRequest queryForecastRequest,
            com.amazonaws.handlers.AsyncHandler<QueryForecastRequest, QueryForecastResult> asyncHandler);

}
