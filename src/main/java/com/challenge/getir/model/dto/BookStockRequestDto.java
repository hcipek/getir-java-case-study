package com.challenge.getir.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookStockRequestDto {
    @NotBlank
    @JsonProperty("book_id")
    private String bookId;
    @NotBlank
    @JsonProperty("new_stock_size")
    private Integer newStockSize;
}
