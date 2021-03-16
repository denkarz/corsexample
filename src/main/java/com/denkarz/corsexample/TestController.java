package com.denkarz.corsexample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/cors")
public class TestController {
    @GetMapping("/get/")
    public ResponseEntity<Object> getMethod(){
        return new ResponseEntity<>("Get method",HttpStatus.OK);
    }

    @PostMapping("/post/")
    public ResponseEntity<Object> postMethod(){
        return new ResponseEntity<>("Post method",HttpStatus.OK);
    }

    @PutMapping("/put/")
    public ResponseEntity<Object> putMethod(){
        return new ResponseEntity<>(new TestLog("Put", "ok"),HttpStatus.OK);
    }
    @PatchMapping("/patch/")
    public ResponseEntity<Object> patchMethod(@RequestBody TestLog testLog){
        return new ResponseEntity<>(new TestLog("Patch", "ok"),HttpStatus.OK);
    }
}
