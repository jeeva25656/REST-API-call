package com.rams.service.controllers;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rams.service.repository.JobTestRepository;

@RestController
@RequestMapping("test/job")
public class JobTestController {
  @Autowired
  private JobTestRepository jobRepository;
  
  @GetMapping("/{start}/{end}")
  public ResponseEntity<?> getJobsByDateRange(
      @PathVariable("start") String startdate,
      @PathVariable("end") String enddate) {
      try {
          LocalDate start = LocalDate.parse(startdate);
          LocalDate end = LocalDate.parse(enddate);
          return ResponseEntity.ok(jobRepository.findByStartdateBetween(start, end));
      } catch (DateTimeParseException e) {
          return ResponseEntity.badRequest().body("Invalid date format. Use yyyy-MM-dd");
      }
  }


  
}
