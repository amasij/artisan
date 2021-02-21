package com.artisan.artisan.models;

import java.util.*;

public enum MediaTypeConstant {
    MP3("MP3"),
    MP4("MP4");

    private static final long serialVersionUID = -9086148061317024860L;
    private final String enumValue;
    private static Map<String, MediaTypeConstant> values = new LinkedHashMap(2, 1.0F);
    private static List<String> literals = new ArrayList(2);
    private static List<String> names = new ArrayList(2);
    private static List<MediaTypeConstant> valueList = new ArrayList(2);

    private MediaTypeConstant(String value) {
        this.enumValue = value;
    }

    public static MediaTypeConstant fromString(String name) {
        return valueOf(name);
    }

    public String value() {
        return this.enumValue;
    }

    public static MediaTypeConstant fromValue(String value) {
        MediaTypeConstant[] var1 = values();
        int var2 = var1.length;

        for (MediaTypeConstant enumName : var1) {
            if (enumName.getValue().equals(value)) {
                return enumName;
            }
        }

        throw new IllegalArgumentException("EntityStatusConstant.fromValue(" + value + ')');
    }

    public String getValue() {
        return this.enumValue;
    }

    public static List<String> literals() {
        return literals;
    }

    public static List<String> names() {
        return names;
    }

    static {
        synchronized(values) {
            values.put(MP3.enumValue, MP3);
            values.put(MP4.enumValue, MP4);
        }

        synchronized(valueList) {
            valueList.add(MP3);
            valueList.add(MP4);
            valueList = Collections.unmodifiableList(valueList);
        }

        synchronized(literals) {
            literals.add(MP3.enumValue);
            literals.add(MP4.enumValue);
            literals = Collections.unmodifiableList(literals);
        }

        synchronized(names) {
            names.add("MP3");
            names.add("MP4");
            names = Collections.unmodifiableList(names);
        }
    }
}
