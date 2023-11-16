package com.devsuperior.sdlist.dto;


import com.devsuperior.sdlist.projection.GameMinProjetion;

public record GameMinDTO(
        Long id,
        String title,
        Integer year,
        String imgUrl,
        String shortDescription
) {

}
