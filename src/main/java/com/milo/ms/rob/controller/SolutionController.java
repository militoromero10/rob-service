package com.milo.ms.rob.controller;

import com.milo.ms.rob.dto.RequestDto;
import com.milo.ms.rob.dto.ResponseDto;
import com.milo.ms.rob.service.SolutionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequiredArgsConstructor
public class SolutionController {
    public static final String BASE_URL_ROB = "/rob";

    private final SolutionService solutionService;

    @PostMapping(BASE_URL_ROB)
    @ResponseStatus(HttpStatus.OK)
    public ResponseDto getSolution(@RequestBody RequestDto requestDto) {
        var sol = solutionService.rob(requestDto.getMoney());
        return ResponseDto.builder().moneyStolen(sol).build();
    }

}
