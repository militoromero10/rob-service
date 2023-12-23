package com.milo.ms.rob.service.impl;

import com.milo.ms.rob.service.SolutionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.*;

@ContextConfiguration(classes = {SolutionServiceImpl.class})
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class SolutionServiceImplTest {
    @Autowired
    SolutionService solutionService;

    @Test
    void testCase1() {
        Integer[] values = {2, 7, 9, 3, 1};
        var expected = 12;
        var actual = assertDoesNotThrow(() -> solutionService.rob(values));

        assertEquals(expected, actual);
    }
    @Test
    void testCase2() {
        Integer[] values = {1,2,3,1};
        var expected = 4;
        var actual = assertDoesNotThrow(() -> solutionService.rob(values));

        assertEquals(expected, actual);
    }

}