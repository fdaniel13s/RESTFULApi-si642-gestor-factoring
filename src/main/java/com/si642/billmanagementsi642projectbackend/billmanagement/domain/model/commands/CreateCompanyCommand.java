package com.si642.billmanagementsi642projectbackend.billmanagement.domain.model.commands;

import java.util.List;

public record CreateCompanyCommand(
        String name,
        String address,
        String email,
        String phone,
        String username,
        String password,
        List<String> roles
) {
}
