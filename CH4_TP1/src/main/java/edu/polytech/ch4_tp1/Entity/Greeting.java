package edu.polytech.ch4_tp1.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Greeting {
    private final long id;
    private final String content;
}
