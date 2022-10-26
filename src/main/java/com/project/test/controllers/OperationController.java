package com.project.test.controllers;

import com.project.test.exceptions.FileException;
import com.project.test.requests.OperationRequest;
import com.project.test.responses.ExceptionResponse;
import com.project.test.services.OperationService;
import com.project.test.utils.OperationType;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OperationController {

    @GetMapping("/")
    public String index(){
        return "Hi, Nick!";
    }

    @PostMapping("/operation")
    public ResponseEntity<?> operation(@RequestBody OperationRequest operationRequest) throws FileException {
        String filePath = operationRequest.getPath();
        OperationType operationType = OperationType.getTypeByRequest(operationRequest.getOperation());

        return new ResponseEntity<String>(OperationService.operation(filePath, operationType),
                HttpStatus.OK);
    }

    @ExceptionHandler(FileException.class)
    public ExceptionResponse handleException(FileException e) {
        return new ExceptionResponse(e.getMessage());
    }
}
