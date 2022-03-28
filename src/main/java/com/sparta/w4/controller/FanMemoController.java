package com.sparta.w4.controller;

import com.sparta.w4.dto.FanMemoRequestDto;
import com.sparta.w4.service.FanMemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class FanMemoController {
    private final FanMemoService fanMemoService;

    @GetMapping("/")
    public String memoList(Model model){
        model.addAttribute("memos",fanMemoService.memoList());
        return "index";
    }

    @GetMapping("/api/fanmemo")
    public String writeForm(){
        return "write-form";
    }

    @PostMapping("/api/fanmemo")
    public String postMemo(FanMemoRequestDto requestDto){
        fanMemoService.save(requestDto);
        return "redirect:/";
    }

    @GetMapping("/view/")
    public String boardView(Model model, Long id){
        model.addAttribute("memo",fanMemoService.fanmemoView(id));
        return "view";
    }


}

