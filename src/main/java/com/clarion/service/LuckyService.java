package com.clarion.service;

import com.clarion.model.LuckyResponse;

import java.text.ParseException;

public interface LuckyService {
     LuckyResponse checkLuckyName ( String name, String dob )  throws ParseException;
}
