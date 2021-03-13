package com.denkarz.corsexample;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class TestLog {
    private final String method;
    private final String status;
}
