package com.example.ecommerce.Backend.Dtos;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CouponsDTO {

    @NotBlank
    @Size(min = 3, max = 15, message = "Tên mã giãm giá từ 3 kí tự đến 15 kí tự")
    @JsonProperty("tên của mã")
    private String name;

    private Boolean status;

    @Size(max = 255, message = "Giới hạn 255 kí tự")
    private String description;

    @DecimalMin(value = "0.0", inclusive = false)
    @DecimalMin(value = "100.0", inclusive = true)
    private Double discountPercentage;

    @Future(message = "Expiration date must be in the future")
    private LocalDate expirationDate;

}
