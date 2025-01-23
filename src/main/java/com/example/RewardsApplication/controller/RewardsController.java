package com.example.RewardsApplication.controller;

import com.example.RewardsApplication.model.Reward;
import com.example.RewardsApplication.model.RewardRequest;  // Import the RewardRequest model
import com.example.RewardsApplication.service.RewardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rewards")
public class RewardsController {

    @Autowired
    private RewardsService rewardsService;

    // This method handles POST requests
    @PostMapping("/calculate")
    public Reward calculateRewards(@RequestBody RewardRequest request) {
        return rewardsService.calculateRewards(request.getCustomerId(), request.getStartDate(), request.getEndDate());
    }
}
