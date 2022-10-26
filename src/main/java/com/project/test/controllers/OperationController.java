package com.project.test.controllers;

import com.project.test.requests.OperationRequest;
import com.project.test.services.OperationService;
import com.project.test.utils.OperationType;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationController {

    //OperationService service = new OperationService();

    @GetMapping("/")
    public String index(){
        return "Hi, Nick!";
    }

    @PostMapping("/operation")
    public ResponseEntity<?> operation(@RequestBody OperationRequest operationRequest){
        String filePath = operationRequest.getPath();
        OperationType operationType = OperationType.getTypeByRequest(operationRequest.getOperation());

        ResponseEntity re;

        try {
            re = new ResponseEntity<String>(OperationService.operation(filePath, operationType),
                    HttpStatus.OK);
        } catch (Exception ex){
            return new ResponseEntity<String>("Cannot calculate!",
                    HttpStatus.EXPECTATION_FAILED);
        }

        return re;
    }
}
