package kr.co.manty.gfsd_spring_boot_ex1.student;

import kr.co.manty.gfsd_spring_boot_ex1.ErrorModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentControllerAdvice {

    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<ErrorModel> handleException(StudentNotFoundException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .contentType(MediaType.APPLICATION_JSON)
                .body(new ErrorModel(exception.getMessage()));

    }

}

