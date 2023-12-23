package com.milo.ms.rob.service.impl;

import com.milo.ms.rob.service.SolutionService;
import org.springframework.stereotype.Service;

@Service
public class SolutionServiceImpl implements SolutionService {

    @Override
    public Integer rob(Integer[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        int sum = nums[0];
        int prev = 0;

        for (int i = 1; i < n; i++) {
            var aux = prev + nums[i];
            var max = aux > sum ? aux : sum;
            prev = sum;
            sum = max;
        }

        return sum;
    }
}
