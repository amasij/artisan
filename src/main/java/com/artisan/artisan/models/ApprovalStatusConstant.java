package com.artisan.artisan.models;

import java.util.*;

public enum ApprovalStatusConstant {
    APPROVED("APPROVED"),
    PENDING("PENDING"),
    DENIED("DENIED");

    private static final long serialVersionUID = -9086148061317024860L;
    private final String enumValue;
    private static Map<String, ApprovalStatusConstant> values = new LinkedHashMap(3, 1.0F);
    private static List<String> literals = new ArrayList(3);
    private static List<String> names = new ArrayList(3);
    private static List<ApprovalStatusConstant> valueList = new ArrayList(3);

    private ApprovalStatusConstant(String value) {
        this.enumValue = value;
    }

    public static ApprovalStatusConstant fromString(String name) {
        return valueOf(name);
    }

    public String value() {
        return this.enumValue;
    }

    public static ApprovalStatusConstant fromValue(String value) {
        ApprovalStatusConstant[] var1 = values();
        int var2 = var1.length;

        for (ApprovalStatusConstant enumName : var1) {
            if (enumName.getValue().equals(value)) {
                return enumName;
            }
        }

        throw new IllegalArgumentException("ApprovalStatusConstant.fromValue(" + value + ')');
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
            values.put(APPROVED.enumValue, APPROVED);
            values.put(PENDING.enumValue, PENDING);
            values.put(DENIED.enumValue, DENIED);
        }

        synchronized(valueList) {
            valueList.add(APPROVED);
            valueList.add(PENDING);
            valueList.add(DENIED);
            valueList = Collections.unmodifiableList(valueList);
        }

        synchronized(literals) {
            literals.add(APPROVED.enumValue);
            literals.add(PENDING.enumValue);
            literals.add(DENIED.enumValue);
            literals = Collections.unmodifiableList(literals);
        }

        synchronized(names) {
            names.add("APPROVED");
            names.add("PENDING");
            names.add("DENIED");
            names = Collections.unmodifiableList(names);
        }
    }
}
