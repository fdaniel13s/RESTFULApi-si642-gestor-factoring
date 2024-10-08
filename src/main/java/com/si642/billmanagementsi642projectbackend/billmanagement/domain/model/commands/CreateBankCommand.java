package com.si642.billmanagementsi642projectbackend.billmanagement.domain.model.commands;

import com.si642.billmanagementsi642projectbackend.billmanagement.domain.model.valueobjects.Capitalization;
import com.si642.billmanagementsi642projectbackend.billmanagement.domain.model.valueobjects.TypeRate;

public record CreateBankCommand(
        String name,
        Double rate,
        TypeRate typeRate,
        Integer daysRate,
        Capitalization capitalization
) {
}
