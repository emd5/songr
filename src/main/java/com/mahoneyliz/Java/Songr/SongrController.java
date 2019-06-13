package com.mahoneyliz.Java.Songr;

import org.springframework.web.bind.annotation.*;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * The songr controller class
 */
@RestController
public class SongrController {

    /**
     * Create a hello world route at /hello, and ensure that you can visit that route in your browser and see data
     * come back.
     *
     * @return a welcome string
     */
    @GetMapping("/")
    public String getRoot(){
        return "Welcome to Songr";
    }

    /**
     * Create a hello world route at /hello, and ensure that you can visit that route in your browser and see data
     * come back.
     * @return  a hello world string
     */
    @GetMapping("/hello")
    public String getHelloWorld() {
        return "Hello World!";
    }

    /**
     * Create a route that turns words into UPPER CASE. For instance, I should be able to visit /capitalize/hello
     *and get back the response HELLO, or I could visit /capitalize/this is Kinda Capitalized and get the response
     * THIS IS KINDA CAPITALIZED.
     *
     * @param word input string
     * @return uppercase word
     */
    //
    @RequestMapping(value = "/capitalize/{word}", method = GET)
    @ResponseBody
    @GetMapping("/capitalize/{input}")
    public String getCapitalize(@PathVariable("word") String word) {
        return word.toUpperCase();
    }

    /**
     * Create a route that reverses the order of the words in a query parameter. For example, if
     * visit /reverse?sentence=Hello world, it should return world Hello.
     *
     * @param word input string
     * @return reverse string
     */
    //
    @RequestMapping(value = "/reverse", method = GET)
    @ResponseBody
    public String getReverse(@RequestParam("word") String word) {
        String[] words = word.split(" ");
        StringBuilder reverseSentence = new StringBuilder();

        for(int i = words.length - 1; i >= 0 ; i--)
        {
            reverseSentence.append(words[i]);
            reverseSentence.append(" ");
        }
        return reverseSentence.toString().trim();
    }
}


