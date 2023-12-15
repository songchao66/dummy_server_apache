package com.example.dummy_server_apache;

import java.time.LocalDate;

public record File(String record, String fileCode, String fileName, int status, String whereCode, String whereName, String kanriCode, LocalDate day) { }
