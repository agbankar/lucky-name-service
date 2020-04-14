package com.ashish.service;

import com.ashish.model.LuckyResponse;

import java.text.ParseException;

public interface LuckyService {
     LuckyResponse checkLuckyName ( String name, String dob )  throws ParseException;
}
