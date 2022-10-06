package pearl.minicapstone.controller;

import lombok.NonNull;
import org.springframework.web.bind.annotation.*;
import pearl.minicapstone.model.HelloWorldModel;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorldController {

    @GetMapping("")
    public String getHelloWorld() {
        return "Hello World!";
    }
    @PostMapping("/custom")
    public String getHelloWorld(@RequestBody HelloWorldModel helloWorldModel){
        return "Hello ".concat(helloWorldModel.getFirstName()).concat(" ").concat(helloWorldModel.getLastName());
    }

    @PutMapping("/{firstName}/{lastName}")
    public String editHelloWorld(@PathVariable String firstName, @PathVariable String lastName) {
        return  "Hello ".concat(firstName).concat(" ").concat(lastName);
    }
}
