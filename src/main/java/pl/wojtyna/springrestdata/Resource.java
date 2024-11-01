package pl.wojtyna.springrestdata;

import org.springframework.data.annotation.Id;

public record Resource(@Id String id, String name) {}
