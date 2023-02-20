package com.thealvistar.iotconnect.device.client.apis

import com.thealvistar.iotconnect.device.client.models.BatchCommandListResponse
import com.thealvistar.iotconnect.device.client.models.CommandCreateRequest
import com.thealvistar.iotconnect.device.client.models.CommandCreateResponse
import com.thealvistar.iotconnect.device.client.models.CommandDeleteResponse
import com.thealvistar.iotconnect.device.client.models.CommandHistoryListResponse
import com.thealvistar.iotconnect.device.client.models.CommandHistoryUpdateRequest
import com.thealvistar.iotconnect.device.client.models.CommandHistoryUpdateResponse
import com.thealvistar.iotconnect.device.client.models.CommandListResponse
import com.thealvistar.iotconnect.device.client.models.CommandLookupResponse
import com.thealvistar.iotconnect.device.client.models.CommandReSendResponse
import com.thealvistar.iotconnect.device.client.models.CommandScheduleDeleteResponse
import com.thealvistar.iotconnect.device.client.models.CommandScheduleDetailResponse
import com.thealvistar.iotconnect.device.client.models.CommandScheduleListResponse
import com.thealvistar.iotconnect.device.client.models.CommandScheduleUpdateRequest
import com.thealvistar.iotconnect.device.client.models.CommandScheduleUpdateResponse
import com.thealvistar.iotconnect.device.client.models.CommandScheduleUpdateStatusRequest
import com.thealvistar.iotconnect.device.client.models.CommandScheduleUpdateStatusResponse
import com.thealvistar.iotconnect.device.client.models.CommandSendRequest
import com.thealvistar.iotconnect.device.client.models.CommandSendResponse
import com.thealvistar.iotconnect.device.client.models.CommandSendToDeviceRequest
import com.thealvistar.iotconnect.device.client.models.CommandSendToDeviceResponse
import com.thealvistar.iotconnect.device.client.models.CommandUpdateRequest
import com.thealvistar.iotconnect.device.client.models.CommandUpdateResponse
import retrofit2.Call
import retrofit2.http.*

interface CommandApi {
    /**
     * Get executed command list by batch
     * &lt;p&gt;This API endpoint provides you the list of executed commands in one batch. For that, you need to send &lt;i&gt;batchGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that command list received successfully.
     *  - 204: Indicates that the request has been successfully processed and no records found.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  The device template doesn't exist and invalid logged user or company
     *
     * @param batchGuid Executed Batch Guid
     * @return [Call]<[BatchCommandListResponse]>
     */
    @GET("api/v2/template-command/batch/{batchGuid}")
    fun apiV2TemplateCommandBatchBatchGuidGet(@Path("batchGuid") batchGuid: java.util.UUID): Call<BatchCommandListResponse>

    /**
     * Delete a command
     * &lt;p&gt;This API endpoint allows you to delete a command. For that, you need to send &lt;i&gt;commandGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that template command deleted successfully.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  The device template doesn't exist, command not found and invalid logged user or company
     *
     * @param commandGuid Template Command Guid
     * @return [Call]<[CommandDeleteResponse]>
     */
    @DELETE("api/v2/template-command/{commandGuid}")
    fun apiV2TemplateCommandCommandGuidDelete(@Path("commandGuid") commandGuid: java.util.UUID): Call<CommandDeleteResponse>

    /**
     * Update template command
     * &lt;p&gt;This API endpoint lets you update a command. For that, you need to send &lt;i&gt;commandGuid&lt;/i&gt; in request url and command update details in the request body.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that template command updated successfully.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  The device template doesn't exist, command not found, command already exists, tag is required for gateway template, invalid tag and invalid logged user or company
     *
     * @param commandGuid Template Command Guid
     * @param commandUpdateRequest Json object (optional)
     * @return [Call]<[CommandUpdateResponse]>
     */
    @PUT("api/v2/template-command/{commandGuid}")
    fun apiV2TemplateCommandCommandGuidPut(
        @Path("commandGuid") commandGuid: java.util.UUID,
        @Body commandUpdateRequest: CommandUpdateRequest? = null,
    ): Call<CommandUpdateResponse>

    /**
     * Delete a scheduled command
     * &lt;p&gt;This API endpoint allows you to delete a scheduled command along with recurring job associated with that command. For that, you need to send &lt;i&gt;commandScheduleGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the scheduled command deleted successfully.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Command schedule not found and invalid logged user or company
     *
     * @param commandScheduleGuid Scheduled Command Guid
     * @return [Call]<[CommandScheduleDeleteResponse]>
     */
    @DELETE("api/v2/template-command/CommandSchedule/{commandScheduleGuid}")
    fun apiV2TemplateCommandCommandScheduleCommandScheduleGuidDelete(@Path("commandScheduleGuid") commandScheduleGuid: java.util.UUID): Call<CommandScheduleDeleteResponse>

    /**
     * Get scheduled command detail
     * &lt;p&gt;This API endpoint provide you scheduled command detail. For that, you need to send &lt;i&gt;CommandScheduleGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the scheduled command updated successfully.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Comand not exists, command schedule not exists, parameter is required and invalid logged user or company
     *
     * @param commandScheduleGuid Scheduled Command Guid
     * @return [Call]<[CommandScheduleDetailResponse]>
     */
    @GET("api/v2/template-command/CommandSchedule/{CommandScheduleGuid}")
    fun apiV2TemplateCommandCommandScheduleCommandScheduleGuidGet(@Path("CommandScheduleGuid") commandScheduleGuid: java.util.UUID): Call<CommandScheduleDetailResponse>

    /**
     * Update a scheduled command
     * &lt;p&gt;This API endpoint allows you to delete a scheduled command along with recurring job associated with that command. For that, you need to send &lt;i&gt;commandScheduleGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the scheduled command updated successfully.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Comand not exists, command schedule not exists, parameter is required and invalid logged user or company
     *
     * @param commandScheduleGuid Scheduled Command Guid
     * @param commandScheduleUpdateRequest request (optional)
     * @return [Call]<[CommandScheduleUpdateResponse]>
     */
    @PUT("api/v2/template-command/CommandSchedule/{commandScheduleGuid}")
    fun apiV2TemplateCommandCommandScheduleCommandScheduleGuidPut(
        @Path("commandScheduleGuid") commandScheduleGuid: java.util.UUID,
        @Body commandScheduleUpdateRequest: CommandScheduleUpdateRequest? = null,
    ): Call<CommandScheduleUpdateResponse>

    /**
     * Update scheduled command Status
     * &lt;p&gt;This API endpoint allows you to change the status of your scheduled command along with recurring job associated with that command. For that, you need to send &lt;i&gt;commandScheduleGuid&lt;/i&gt; in request url and &lt;i&gt;isActive&lt;/i&gt; in the request body. In &lt;i&gt;isActive&lt;/i&gt;, send &lt;i&gt;true&lt;/i&gt; to activate your scheduled command and &lt;i&gt;false&lt;/i&gt; to deactivate your scheduled command.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the scheduled command status updated successfully.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Command schedule not found and invalid logged user or company
     *
     * @param commandScheduleGuid Scheduled Command Guid
     * @param commandScheduleUpdateStatusRequest Json object (optional)
     * @return [Call]<[CommandScheduleUpdateStatusResponse]>
     */
    @PUT("api/v2/template-command/CommandSchedule/{commandScheduleGuid}/status")
    fun apiV2TemplateCommandCommandScheduleCommandScheduleGuidStatusPut(
        @Path("commandScheduleGuid") commandScheduleGuid: java.util.UUID,
        @Body commandScheduleUpdateStatusRequest: CommandScheduleUpdateStatusRequest? = null,
    ): Call<CommandScheduleUpdateStatusResponse>

    /**
     * Get scheduled command list
     *
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the scheduled command list received successfully.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Invalid logged user or company
     *
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @param sortBy Sort by guid,templatename,commandname,companyGuid,commandGuid,applyTo,entityGuid,isRecursive,unit,unitValue,unitTime,parameterValue,isActive,createddate,createdby,updateddate,updatedby For example: name asc (optional)
     * @param searchText To search for specific texts in the list. (optional)
     * @param isEdge IsEdge : Pass value as true to get only edge devices (optional)
     * @param isGateway IsGateway : Pass value as true to get only gateway devices (optional)
     * @param isLowBandwidth IsLowBandwidth : Pass value as true to get only low badnwidth devices (optional)
     * @param isIotEdgeEnable IsIoTEdgeEnable : Pass value as true to get only Azure iot Edge devices (optional)
     * @return [Call]<[CommandScheduleListResponse]>
     */
    @GET("api/v2/template-command/CommandSchedule")
    fun apiV2TemplateCommandCommandScheduleGet(
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
        @Query("searchText") searchText: kotlin.String? = null,
        @Query("isEdge") isEdge: kotlin.Boolean? = null,
        @Query("isGateway") isGateway: kotlin.Boolean? = null,
        @Query("isLowBandwidth") isLowBandwidth: kotlin.Boolean? = null,
        @Query("isIotEdgeEnable") isIotEdgeEnable: kotlin.Boolean? = null,
    ): Call<CommandScheduleListResponse>

    /**
     * Execute a command on device
     * &lt;p&gt;Run a command on any device using this API endpoint. For that, you need to send &lt;i&gt;deviceGuid&lt;/i&gt; in request url along with &lt;i&gt;commandGuid&lt;/i&gt; and &lt;i&gt;parameterValue&lt;/i&gt; in the request body. This command will be executed on a real device. Using this, you will be able to send data to devices from your UI.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the command sent to device successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Device doesn't exist, not allowed to send the device command as the device is shared device with read permission only,  command doesn't exist and invalid logged user or company
     *
     * @param deviceGuid Device Guid
     * @param commandSendToDeviceRequest Json object (optional)
     * @return [Call]<[CommandSendToDeviceResponse]>
     */
    @POST("api/v2/template-command/device/{deviceGuid}/send")
    fun apiV2TemplateCommandDeviceDeviceGuidSendPost(
        @Path("deviceGuid") deviceGuid: java.util.UUID,
        @Body commandSendToDeviceRequest: CommandSendToDeviceRequest? = null,
    ): Call<CommandSendToDeviceResponse>

    /**
     * Update command history status
     * &lt;p&gt;This API endpoint allows you to update the template command sent status for any device. For that, you need to send &lt;i&gt;deviceGuid&lt;/i&gt; in request url along with &lt;i&gt;ackId&lt;/i&gt;, &lt;i&gt;status&lt;/i&gt; and &lt;i&gt;statusText&lt;/i&gt; in the request body.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device command status updated successfully.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Device command history doesn't exist, device doesn't exist, device is not connected, waiting to connect device and invalid logged user or company
     *
     * @param deviceGuid Device Guid
     * @param commandHistoryUpdateRequest Json object (optional)
     * @return [Call]<[CommandHistoryUpdateResponse]>
     */
    @PUT("api/v2/template-command/{deviceGuid}/status")
    fun apiV2TemplateCommandDeviceGuidStatusPut(
        @Path("deviceGuid") deviceGuid: java.util.UUID,
        @Body commandHistoryUpdateRequest: CommandHistoryUpdateRequest? = null,
    ): Call<CommandHistoryUpdateResponse>

    /**
     * Get device template command list
     * &lt;p&gt;This API endpoint gives you the list of available commands in your device template. For that, you need to send &lt;i&gt;deviceTemplateGuid&lt;/i&gt; in request url.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that template command list received successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  The device template doesn't exist and invalid logged user or company
     *
     * @param deviceTemplateGuid Device Template Guid
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @param sortBy To sort the list. To do that, Specify Field name to sort with and sorting order. Eg: name asc, name desc, name (optional)
     * @param searchText To search for specific texts in the list. (optional)
     * @return [Call]<[CommandListResponse]>
     */
    @GET("api/v2/template-command/{deviceTemplateGuid}")
    fun apiV2TemplateCommandDeviceTemplateGuidGet(
        @Path("deviceTemplateGuid") deviceTemplateGuid: java.util.UUID,
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
        @Query("searchText") searchText: kotlin.String? = null,
    ): Call<CommandListResponse>

    /**
     * Get device template command lookup
     * &lt;p&gt;This API endpoint provides you the lookup list of available commands in your device template. For that, you need to send &lt;i&gt;deviceTemplateGuid&lt;/i&gt; in request url.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that template command lookup received successfully.
     *  - 204: Indicates that the request has been successfully processed and no records found.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  The device template doesn't exist and invalid logged user or company
     *
     * @param deviceTemplateGuid Device Template Guid
     * @param tag Tag (optional)
     * @return [Call]<[CommandLookupResponse]>
     */
    @GET("api/v2/template-command/{deviceTemplateGuid}/lookup")
    fun apiV2TemplateCommandDeviceTemplateGuidLookupGet(
        @Path("deviceTemplateGuid") deviceTemplateGuid: java.util.UUID,
        @Query("tag") tag: kotlin.String? = null,
    ): Call<CommandLookupResponse>

    /**
     * Resend commands
     * &lt;p&gt;This API endpoint will re-execute all commands which are having failed status&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the device command resend successfully.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Device command history doesn't exist, device doesn't exist, device is not connected, waiting to connect device and invalid logged user or company
     *
     * @param commandHistoryGuid Command History Guid
     * @return [Call]<[CommandReSendResponse]>
     */
    @PUT("api/v2/template-command/history/{commandHistoryGuid}/re-send")
    fun apiV2TemplateCommandHistoryCommandHistoryGuidReSendPut(@Path("commandHistoryGuid") commandHistoryGuid: java.util.UUID): Call<CommandReSendResponse>

    /**
     * Get device command history
     * &lt;p&gt;This API endpoint provides you the list of command execution histories for all devices. This also gives you the status of whether the command was successfully executed or not.&lt;/p&gt;  &lt;p&gt;You can also add the filters as given in the parameters. You can fetch the history of a single device by sending &lt;i&gt;deviceGuid&lt;/i&gt; in filter parameters. Though the filters are optional, to apply them, you need to send these filter parameters in a query string.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the command history list received successfully.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  invalid logged user or company
     *
     * @param deviceGuid Device Guid (optional)
     * @param pageNumber To fetch specific page data. Eg: 2 (optional)
     * @param pageSize To define number of records in single page. Eg: 25 (optional)
     * @param sortBy To sort the list. To do that, Specify Field name to sort with and sorting order. Eg: uniqueId asc, uniqueId desc, uniqueId (optional)
     * @param searchText To search for specific texts in the list. (optional)
     * @param isEdge IsEdge : Pass value as true to get only edge devices (optional)
     * @param isGateway IsGateway : Pass value as true to get only gateway devices (optional)
     * @param isLowBandwidth IsLowBandwidth : Pass value as true to get only low badnwidth devices (optional)
     * @param isIotEdgeEnable  (optional)
     * @return [Call]<[CommandHistoryListResponse]>
     */
    @GET("api/v2/template-command/history")
    fun apiV2TemplateCommandHistoryGet(
        @Query("deviceGuid") deviceGuid: kotlin.String? = null,
        @Query("pageNumber") pageNumber: kotlin.Int? = null,
        @Query("pageSize") pageSize: kotlin.Int? = null,
        @Query("sortBy") sortBy: kotlin.String? = null,
        @Query("searchText") searchText: kotlin.String? = null,
        @Query("isEdge") isEdge: kotlin.Boolean? = null,
        @Query("isGateway") isGateway: kotlin.Boolean? = null,
        @Query("isLowBandwidth") isLowBandwidth: kotlin.Boolean? = null,
        @Query("isIotEdgeEnable") isIotEdgeEnable: kotlin.Boolean? = null,
    ): Call<CommandHistoryListResponse>

    /**
     * Add new template command
     * &lt;p&gt;Commands are used to manage a device remotely. You can add multiple commands to your device template. You can use commands to run a command on the device remotely, instantly, from IoTConnect.&lt;/p&gt;  &lt;p&gt;This API endpoint allows you to create device template commands. These commands will be defined in your device template and will be a part of your device template. A template can have one or more commands.&lt;/p&gt;  &lt;p&gt;Here, name and command are mandatory for any template command.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that template command created successfully and returns created template command guid.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  The device template doesn't exist, command already exists, tag is required for gateway template, invalid tag and invalid logged user or company
     *
     * @param commandCreateRequest Json object (optional)
     * @return [Call]<[CommandCreateResponse]>
     */
    @POST("api/v2/template-command")
    fun apiV2TemplateCommandPost(@Body commandCreateRequest: CommandCreateRequest? = null): Call<CommandCreateResponse>

    /**
     * Execute a command on multiple devices
     * &lt;p&gt;Run a command on multiple devices using this API endpoint. For that, you need to send either &lt;i&gt;entityGuid&lt;/i&gt; or &lt;i&gt;deviceGuid&lt;/i&gt; list along with &lt;i&gt;commandGuid&lt;/i&gt; and &lt;i&gt;parameterValue&lt;/i&gt; in the request body.&lt;/p&gt;  &lt;p&gt;If you wish to send &lt;i&gt;entityGuid&lt;/i&gt;, send value “1” in the &lt;i&gt;applyTo&lt;/i&gt; parameter and entity guid in &lt;i&gt;entityGuid&lt;/i&gt; parameter. This will send commands to all the devices available in the given entity. You can also send these commands to child devices of a given entity. For that, you need to send value “true” in &lt;i&gt;isRecursive&lt;/i&gt; parameter.&lt;/p&gt;  &lt;p&gt;If you wish to send &lt;i&gt;deviceGuid&lt;/i&gt; list, send value “2” in the &lt;i&gt;applyTo&lt;/i&gt; parameter and list of device guids in devices parameter. This will send commands to selected devices only.&lt;/p&gt;
     * Responses:
     *  - 412: Indicates that a condition set for this request is failed, and the request cannot be carried out.
     *  - 401: Indicates that authentication is failed because of the token is invalid or expired or missing.
     *  - 500: Indicates that the request could not be carried out because of some technical error on the server.
     *  - 200: Indicates that the command sent to devices successfully.
     *  - 403: Indicates that the user is not authorized to access this section.
     *  - 409: Indicates that the request could not be carried out because of one of the below or other conflicts on the server.  Device doesn't exist and invalid logged user or company
     *
     * @param commandSendRequest Json object (optional)
     * @return [Call]<[CommandSendResponse]>
     */
    @POST("api/v2/template-command/send")
    fun apiV2TemplateCommandSendPost(@Body commandSendRequest: CommandSendRequest? = null): Call<CommandSendResponse>
}
