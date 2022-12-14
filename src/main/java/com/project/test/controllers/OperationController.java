package com.project.test.controllers;

import com.project.test.exceptions.FileException;
import com.project.test.requests.OperationRequest;
import com.project.test.responses.ExceptionResponse;
import com.project.test.responses.OperationResponse;
import com.project.test.services.OperationService;
import com.project.test.utils.OperationType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(description = "Main controller")
public class OperationController {
    @GetMapping("/operation")
    @ResponseBody
    @ApiOperation(value = "Calc operation")
    public OperationResponse operation(@RequestHeader("accept") String mediaType,
                                       @RequestBody OperationRequest operationRequest)
            throws FileException {
        String filePath = operationRequest.getPath();
        OperationType operationType = OperationType.getTypeByRequest(operationRequest.getOperation());

        return OperationService.operation(filePath, operationType);
    }

    @ExceptionHandler(FileException.class)
    public ExceptionResponse handleException(FileException e) {
        return new ExceptionResponse(e.getMessage());
    }
}
