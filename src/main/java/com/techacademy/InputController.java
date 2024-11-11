package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class InputController {

        //初回
        @GetMapping("/input")
        public String getInput(@RequestParam(value="previous", required=false) String previous, Model model) {
            if(previous !=null) {
            //元の値をModelに登録
            model.addAttribute("previous", previous);
            }
            //confirm.htmlに画面遷移
            return "input";
        }
}
