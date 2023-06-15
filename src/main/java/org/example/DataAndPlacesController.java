package org.example;

import org.model.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataAndPlacesController {
    @PostMapping("postData")
    public String postData(){
        return "post method";
    }
    @GetMapping("getData")
    public Data getData(@RequestBody Data data){
        System.out.println(data.toString());
        return data;
    }
}
