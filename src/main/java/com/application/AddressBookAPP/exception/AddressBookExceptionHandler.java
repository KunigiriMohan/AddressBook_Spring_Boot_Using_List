package com.application.AddressBookAPP.exception;


import java.util.List;
import java.util.stream.Collectors;
import com.application.AddressBookAPP.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @ControllerAdvice : ControllerAdvice Class of apllication to handle Exception
 * @ExceptionHanler : Assign Exception to Exception Handler
 */

@ControllerAdvice
public class AddressBookExceptionHandler {
    /**
     * Method to Handle MethodArgumentNotValidException
     * @param exception
     * @return : ResponseEntity of Exception and Place of Exception
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseDTO> methodArgumentNotValidationException(MethodArgumentNotValidException exception){
        List<ObjectError> errorList = exception.getBindingResult().getAllErrors();
        List<String> errMsg = errorList.stream().map(addressData->addressData.getDefaultMessage()).collect(Collectors.toList());
        ResponseDTO responseDTO = new ResponseDTO("Exception while fetching REST Request", errMsg);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.BAD_REQUEST);
    }    
}
